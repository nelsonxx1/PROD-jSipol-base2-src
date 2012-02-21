package org.openswing.swing.server;

import java.lang.reflect.*;
import java.math.*;
import java.sql.*;
import java.util.*;

import org.openswing.swing.internationalization.java.*;
import org.openswing.swing.logger.server.*;
import org.openswing.swing.message.receive.java.*;
import org.openswing.swing.message.send.java.*;
import org.openswing.swing.util.java.*;

/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Utility (singleton) class used with queries.</p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 *
 * <p> This file is part of OpenSwing Framework.
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the (LGPL) Lesser General Public
 * License as published by the Free Software Foundation;
 *
 *                GNU LESSER GENERAL PUBLIC LICENSE
 *                 Version 2.1, February 1999
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *       The author may be contacted at:
 *           maurocarniel@tin.it</p>
 *
 * @author Mauro Carniel
 * @version 1.0
 */
public class QueryUtil {

    /**
     * @param baseSQL SQL to change by adding filter and order clauses
     * @param values binding values related to baseSQL
     * @param filteredColumns columns to add in the WHERE clause
     * @param currentSortedColumns columns to add in the ORDER clause
     * @param currentSortedVersusColumns ordering versus
     * @param attributesMapping collection of pairs attributeName, corresponding database column (table.column)
     * @return baseSQL + filtering and ordering conditions
     */
    public static String getSql(
            UserSessionParameters userSessionPars,
            String baseSQL,
            ArrayList values,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Map attributesMapping) {
        return getSql(
                userSessionPars,
                baseSQL,
                new ArrayList(),
                values,
                filteredColumns,
                currentSortedColumns,
                currentSortedVersusColumns,
                attributesMapping);
    }

    /**
     * This constructor can be useful when combining OpenSwing with Hibernate, to retrieve attribute names too.
     * @param baseSQL SQL to change by adding filter and order clauses
     * @param attrNames attribute names related to filter values
     * @param values binding values related to baseSQL
     * @param filteredColumns columns to add in the WHERE clause
     * @param currentSortedColumns columns to add in the ORDER clause
     * @param currentSortedVersusColumns ordering versus
     * @param attributesMapping collection of pairs attributeName, corresponding database column (table.column)
     * @return baseSQL + filtering and ordering conditions
     */
    public static String getSql(
            UserSessionParameters userSessionPars,
            String baseSQL,
            ArrayList attrNames,
            ArrayList values,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Map attributesMapping) {
        return getSql(
                userSessionPars,
                baseSQL,
                attrNames,
                values,
                filteredColumns,
                currentSortedColumns,
                currentSortedVersusColumns,
                attributesMapping,
                false);
    }

    /**
     * This constructor can be useful when combining OpenSwing with Hibernate, to retrieve attribute names too.
     * SQL is expressed using more argument, each one without the related keyword (select, from, ...).
     *
     * Example: following query
     *
     * select customer_code,corporate_name from companies order by customer_code asc
     *
     * become an invokation of getSql:
     *
     * getSql(userSessionPars,"customer_code,corporate_name","companies","","customer_code asc","","",...);
     *
     *
     * Example: following query
     *
     * select customer_code,customername from
     * (select customer_code,corporate_name as customername from companies
     * union
     * select customer_code,name as customername from privates)
     * order by customer_code asc
     *
     * become an invokation of getSql:
     *
     * getSql(userSessionPars,"customer_code,customername","(select customer_code,corporate_name as customername from companies union select customer_code,name as customername from privates)","","customer_code asc","","",...);
     *
     * @param select list of fields for select statement
     * @param from list of tables for from statement
     * @param where where statement; may be null
     * @param group group by statement; may be null
     * @param having having statement; may be null
     * @param order list of fields for order by statement; may be null
     * @param values binding values related to baseSQL
     * @param filteredColumns columns to add in the WHERE clause
     * @param currentSortedColumns columns to add in the ORDER clause
     * @param currentSortedVersusColumns ordering versus
     * @param attributesMapping collection of pairs attributeName, corresponding database column (table.column)
     * @return baseSQL + filtering and ordering conditions
     */
    public static String getSql(
            UserSessionParameters userSessionPars,
            String select,
            String from,
            String where,
            String group,
            String having,
            String order,
            ArrayList values,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Map attributesMapping) {
        return getSql(
                userSessionPars,
                select,
                from,
                where,
                group,
                having,
                order,
                new ArrayList(),
                values,
                filteredColumns,
                currentSortedColumns,
                currentSortedVersusColumns,
                attributesMapping);
    }

    /**
     * This constructor can be useful when combining OpenSwing with Hibernate, to retrieve attribute names too.
     * SQL is expressed using more argument, each one without the related keyword (select, from, ...).
     *
     * Example: following query
     *
     * select customer_code,corporate_name from companies order by customer_code asc
     *
     * become an invokation of getSql:
     *
     * getSql(userSessionPars,"customer_code,corporate_name","companies","","customer_code asc","","",...);
     *
     *
     * Example: following query
     *
     * select customer_code,customername from
     * (select customer_code,corporate_name as customername from companies
     * union
     * select customer_code,name as customername from privates)
     * order by customer_code asc
     *
     * become an invokation of getSql:
     *
     * getSql(userSessionPars,"customer_code,customername","(select customer_code,corporate_name as customername from companies union select customer_code,name as customername from privates)","","customer_code asc","","",...);
     *
     * @param select list of fields for select statement
     * @param from list of tables for from statement
     * @param where where statement; may be null
     * @param group group by statement; may be null
     * @param having having statement; may be null
     * @param order list of fields for order by statement; may be null
     * @param attrNames attribute names related to filter values
     * @param values binding values related to baseSQL
     * @param filteredColumns columns to add in the WHERE clause
     * @param currentSortedColumns columns to add in the ORDER clause
     * @param currentSortedVersusColumns ordering versus
     * @param attributesMapping collection of pairs attributeName, corresponding database column (table.column)
     * @return baseSQL + filtering and ordering conditions
     */
    public static String getSql(
            UserSessionParameters userSessionPars,
            String select,
            String from,
            String where,
            String group,
            String having,
            String order,
            ArrayList attrNames,
            ArrayList values,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Map attributesMapping) {
        return getSql(
                userSessionPars,
                select,
                from,
                where,
                group,
                having,
                order,
                attrNames,
                values,
                filteredColumns,
                currentSortedColumns,
                currentSortedVersusColumns,
                attributesMapping,
                false);
    }

    /**
     * This constructor can be useful when combining OpenSwing with Hibernate, to retrieve attribute names too.
     * SQL is expressed using more argument, each one without the related keyword (select, from, ...).
     *
     * Example: following query
     *
     * select customer_code,corporate_name from companies order by customer_code asc
     *
     * become an invokation of getSql:
     *
     * getSql(userSessionPars,"customer_code,corporate_name","companies","","customer_code asc","","",...);
     *
     *
     * Example: following query
     *
     * select customer_code,customername from
     * (select customer_code,corporate_name as customername from companies
     * union
     * select customer_code,name as customername from privates)
     * order by customer_code asc
     *
     * become an invokation of getSql:
     *
     * getSql(userSessionPars,"customer_code,customername","(select customer_code,corporate_name as customername from companies union select customer_code,name as customername from privates)","","customer_code asc","","",...);
     *
     * @param select list of fields for select statement
     * @param from list of tables for from statement
     * @param where where statement; may be null
     * @param group group by statement; may be null
     * @param having having statement; may be null
     * @param order list of fields for order by statement; may be null
     * @param attrNames attribute names related to filter values
     * @param values binding values related to baseSQL
     * @param filteredColumns columns to add in the WHERE clause
     * @param currentSortedColumns columns to add in the ORDER clause
     * @param currentSortedVersusColumns ordering versus
     * @param attributesMapping collection of pairs attributeName, corresponding database column (table.column)
     * @param isJPAsyntax flag
     * @return baseSQL + filtering and ordering conditions
     */
    public static String getSql(
            UserSessionParameters userSessionPars,
            String select,
            String from,
            String where,
            String group,
            String having,
            String order,
            ArrayList attrNames,
            ArrayList values,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Map attributesMapping,
            boolean isJPAsyntax) {
        String baseSQL = "";
        if (select != null && select.trim().length() > 0) {
            baseSQL += "SELECT " + select;
        }
        baseSQL += " FROM " + from;
        try {
            if (where != null && !where.trim().equals("")) {
                baseSQL += " WHERE " + where;
            }

            int num = values.size() + 1;
            if (filteredColumns.size() > 0) {
                if (where != null && !where.trim().equals("")) {
                    baseSQL += " AND ";
                } else {
                    baseSQL += " WHERE ";
                }

                Iterator keys = filteredColumns.keySet().iterator();
                String attributeName = null;
                FilterWhereClause[] filterClauses = null;
                while (keys.hasNext()) {
                    attributeName = keys.next().toString();
                    filterClauses = (FilterWhereClause[]) filteredColumns.get(attributeName);
                    if (filterClauses[0].getValue() != null
                            && !(filterClauses[0].getOperator().equals(Consts.IS_NOT_NULL) || filterClauses[0].getOperator().equals(Consts.IS_NULL))) {
                        if (filterClauses[0].getValue() instanceof ArrayList) {
                            // name IN (...)
                            // (name op value1 OR name op value2 OR ...)
                            if (filterClauses[0].getOperator().equals(Consts.IN)) {
                                // name IN (...)
                                baseSQL +=
                                        attributesMapping.get(attributeName)
                                        + " " + filterClauses[0].getOperator()
                                        + " (";
                                ArrayList inValues = (ArrayList) filterClauses[0].getValue();
                                for (int j = 0; j < inValues.size(); j++) {
                                    baseSQL += " ?" + (isJPAsyntax ? String.valueOf(num++) : "") + ",";
                                    values.add(inValues.get(j));
                                }
                                baseSQL = baseSQL.substring(0, baseSQL.length() - 1);
                                baseSQL += ") AND ";
                            } else {
                                // (name op value1 OR name op value2 OR ...)
                                int i = 0; // start index
                                boolean isExamineNull = false;
                                baseSQL += "(";
                                ArrayList inValues = (ArrayList) filterClauses[0].getValue();
                                if (filterClauses[0].getOperator().equals(Consts.EQ)
                                        && inValues.get(0).equals(Consts.IS_NULL)) {
                                    i = 1;
                                    isExamineNull = true;
                                    baseSQL += "(" + attributesMapping.get(attributeName) + " IS NULL) OR (";
                                }
                                if (filterClauses[0].getOperator().equals(Consts.NEQ)
                                        && inValues.get(0).equals(Consts.IS_NULL)) {
                                    i = 1;
                                    isExamineNull = true;
                                    baseSQL += "(" + attributesMapping.get(attributeName) + " IS NOT NULL) OR (";
                                }
                                for (int j = i; j < inValues.size(); j++) {
                                    baseSQL +=
                                            attributesMapping.get(attributeName)
                                            + " " + filterClauses[0].getOperator()
                                            + " ?" + (isJPAsyntax ? String.valueOf(num++) : "") + " OR ";
                                    values.add(inValues.get(j));
                                }
                                baseSQL = baseSQL.substring(0, baseSQL.length() - 3);
                                if (isExamineNull) {
                                    baseSQL += ")";
                                }
                                baseSQL += ") AND ";
                            }
                        } else {

                            /*
                            else {
                            // (name op value1 OR name op value2 OR ...)
                            baseSQL += "(";
                            ArrayList inValues = (ArrayList)filterClauses[0].getValue();
                            for(int j=0;j<inValues.size();j++) {
                            baseSQL +=
                            attributesMapping.get(attributeName) +
                            " " + filterClauses[0].getOperator() +
                            " ?"+(isJPAsyntax?String.valueOf(num++):"")+" OR ";
                            values.add(inValues.get(j));
                            }
                            baseSQL = baseSQL.substring(0,baseSQL.length()-3);
                            baseSQL += ") AND ";
                            }
                            } else {
                             */
                            // name op value
                            baseSQL +=
                                    attributesMapping.get(attributeName)
                                    + " " + filterClauses[0].getOperator()
                                    + " ?" + (isJPAsyntax ? String.valueOf(num++) : "") + " AND ";
                            values.add(filterClauses[0].getValue());
                        }
                    } else {
                        // name IS NULL
                        // name IS NOT NULL
                        baseSQL +=
                                attributesMapping.get(attributeName)
                                + " " + filterClauses[0].getOperator() + " "
                                + "AND ";
                    }
                    attrNames.add(filterClauses[0].getAttributeName());
                    if (filterClauses[1] != null) {
                        if (filterClauses[1].getValue() != null
                                && !(filterClauses[1].getOperator().equals(Consts.IS_NOT_NULL) || filterClauses[1].getOperator().equals(Consts.IS_NULL))) {
                            if (filterClauses[1].getValue() instanceof ArrayList) {
                                // name IN (...)
                                // (name op value1 OR name op value2 OR ...)
                                if (filterClauses[1].getOperator().equals(Consts.IN)) {
                                    // name IN (...)
                                    baseSQL +=
                                            attributesMapping.get(attributeName)
                                            + " " + filterClauses[1].getOperator()
                                            + " (";
                                    ArrayList inValues = (ArrayList) filterClauses[1].getValue();
                                    for (int j = 0; j < inValues.size(); j++) {
                                        baseSQL += " ?" + (isJPAsyntax ? String.valueOf(num++) : "") + ",";
                                        values.add(inValues.get(j));
                                    }
                                    baseSQL = baseSQL.substring(0, baseSQL.length() - 1);
                                    baseSQL += ") AND ";
                                } else {
                                    // (name op value1 OR name op value2 OR ...)
                                    baseSQL += "(";
                                    ArrayList inValues = (ArrayList) filterClauses[1].getValue();
                                    for (int j = 0; j < inValues.size(); j++) {
                                        baseSQL +=
                                                attributesMapping.get(attributeName)
                                                + " " + filterClauses[1].getOperator()
                                                + " ?" + (isJPAsyntax ? String.valueOf(num++) : "") + " OR ";
                                        values.add(inValues.get(j));
                                    }
                                    baseSQL = baseSQL.substring(0, baseSQL.length() - 3);
                                    baseSQL += ") AND ";
                                }
                            } else {
                                // name op value
                                baseSQL +=
                                        attributesMapping.get(attributeName)
                                        + " " + filterClauses[1].getOperator()
                                        + " ?" + (isJPAsyntax ? String.valueOf(num++) : "") + " AND ";
                                values.add(filterClauses[1].getValue());
                            }
                        } else {
                            // name IS NULL
                            // name IS NOT NULL
                            baseSQL +=
                                    attributesMapping.get(attributeName)
                                    + " " + filterClauses[1].getOperator() + " "
                                    + "AND ";
                        }
                        attrNames.add(filterClauses[1].getAttributeName());
                    }
                }
                baseSQL = baseSQL.substring(0, baseSQL.length() - 4);
            }

            if (group != null && !group.trim().equals("")) {
                baseSQL += " GROUP BY " + group;
            }
            if (having != null && !having.trim().equals("")) {
                baseSQL += " HAVING " + having;
            }
            if (order != null && !order.trim().equals("")) {
                baseSQL += " ORDER BY " + order;
            }

            if (currentSortedColumns.size() > 0) {
                if (order != null && !order.trim().equals("")) {
                    baseSQL += ", ";
                } else {
                    baseSQL += " ORDER BY ";
                }

                for (int i = 0; i < currentSortedColumns.size(); i++) {
                    baseSQL +=
                            (attributesMapping.get(currentSortedColumns.get(i)) == null ? currentSortedColumns.get(i) : attributesMapping.get(currentSortedColumns.get(i)))
                            + " "
                            + currentSortedVersusColumns.get(i) + ", ";
                }
                baseSQL = baseSQL.substring(0, baseSQL.length() - 2);
            }

        } catch (Throwable ex) {
            Logger.error(
                    userSessionPars.getUsername(),
                    "org.openswing.swing.server.QueryUtil",
                    "getSql",
                    "Error while composing the SQL:\n" + ex.getMessage(),
                    ex);
        }

        return baseSQL;
    }

    /**
     * This constructor can be useful when combining OpenSwing with Hibernate, to retrieve attribute names too.
     * @param baseSQL SQL to change by adding filter and order clauses
     * @param attrNames attribute names related to filter values
     * @param values binding values related to baseSQL
     * @param filteredColumns columns to add in the WHERE clause
     * @param currentSortedColumns columns to add in the ORDER clause
     * @param currentSortedVersusColumns ordering versus
     * @param attributesMapping collection of pairs attributeName, corresponding database column (table.column)
     * @param isJPAsyntax flag
     * @return baseSQL + filtering and ordering conditions

     */
    public static String getSql(
            UserSessionParameters userSessionPars,
            String baseSQL,
            ArrayList attrNames,
            ArrayList values,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Map attributesMapping,
            boolean isJPAsyntax) {
        try {
            baseSQL = " " + baseSQL.replace('\n', ' ').replace('\r', ' ') + " ";
            String lowerSQL = baseSQL.toLowerCase();
            int s1 = lowerSQL.indexOf("select "); // may be "" or null for a base SQL written for JPA/ORM layer
            int f1 = lowerSQL.indexOf(" from ");
            int w1 = lowerSQL.indexOf(" where ");
            int g1 = lowerSQL.indexOf(" group by ");
            int h1 = lowerSQL.indexOf(" having ");
            int o1 = lowerSQL.indexOf(" order by ");
            int s2, f2, w2, g2, h2, o2;

            if (o1 == -1) {
                o1 = baseSQL.length() - 1;
                o2 = o1;
            } else {
                o2 = o1 + 10;
            }
            if (h1 == -1) {
                h1 = o1;
                h2 = h1;
            } else {
                h2 = h1 + 8;
            }
            if (g1 == -1) {
                g1 = h1;
                g2 = g1;
            } else {
                g2 = g1 + 10;
            }
            if (w1 == -1) {
                w1 = g1;
                w2 = w1;
            } else {
                w2 = w1 + 7;
            }
            f2 = f1 + 6;
            if (s1 == -1) {
                s1 = f1;
                s2 = s1;
            } else {
                s2 = s1 + 7;
            }

            return getSql(
                    userSessionPars,
                    baseSQL.substring(s2, f1).trim(), // select
                    baseSQL.substring(f2, w1).trim(), // from
                    baseSQL.substring(w2, g1).trim(), // where
                    baseSQL.substring(g2, h1).trim(), // group by
                    baseSQL.substring(h2, o1).trim(), // having
                    baseSQL.substring(o2).trim(), // order by
                    attrNames,
                    values,
                    filteredColumns,
                    currentSortedColumns,
                    currentSortedVersusColumns,
                    attributesMapping,
                    isJPAsyntax);


        } catch (Throwable ex) {
            Logger.error(
                    userSessionPars.getUsername(),
                    "org.openswing.swing.server.QueryUtil",
                    "getSql",
                    "Error while composing the SQL:\n" + ex.getMessage(),
                    ex);
        }

        return baseSQL;
    }

    /**
     * Method called by getQuery method to retrieve all db fields in select clause.
     * @param sql query to execute
     * @return list of db fields
     */
    private static ArrayList getColumns(String sql) {
        ArrayList list = new ArrayList();
        sql = sql.substring(sql.replace('\n', ' ').replace('\r', ' ').toLowerCase().indexOf("select ") + 7, sql.replace('\n', ' ').replace('\r', ' ').toLowerCase().indexOf(" from "));
        StringTokenizer st = new StringTokenizer(sql, ",");
        String token = null;
        while (st.hasMoreTokens()) {
            token = st.nextToken().trim();
            if (token.indexOf(" ") != -1) {
                token = token.substring(token.lastIndexOf(" ") + 1);
            }
            list.add(token);
        }
        return list;
    }

    /**
     * This method can be used to convert a list of Object[], one for each record already read,
     * in a list of ValueObjects.
     * @param attributes list of attribute names of the specified value object, exactly one for each fields is the select clause (i.e. one for each elements of Object[])
     * @param valueObjectClass value object class to use to generate the result
     * @param rows list of Object[] elements, one for each record already read
     * @param moreRows <code>true</code> if there are still other records to read after these ones, <code>false</code> if no other records ara available
     * @return a list of value objects or an error response
     */
    public static Response getQuery(
            String[] attributes,
            Class valueObjectClass,
            List rows,
            boolean moreRows) throws Exception {
        try {
            Object[] row = null;

            Method[] setterMethods = new Method[attributes.length];
            Method getter = null;
            Method setter = null;
            String aName = null;
            ArrayList[] getters = new ArrayList[attributes.length];
            ArrayList[] setters = new ArrayList[attributes.length];
            Class clazz = null;
            Object vo = null;
            Object value = null;

            for (int i = 0; i < attributes.length; i++) {
                aName = attributes[i];
                getters[i] = new ArrayList(); // list of Methods objects (getters for accessing inner vos)
                setters[i] = new ArrayList(); // list of Methods objects (setters for instantiating inner vos)
                clazz = valueObjectClass;

                // check if the specified attribute is a composed attribute and there exist inner v.o. to instantiate...
                while (aName.indexOf(".") != -1) {
                    try {
                        getter = clazz.getMethod(
                                "get"
                                + aName.substring(0, 1).
                                toUpperCase()
                                + aName.substring(1, aName.indexOf(".")),
                                new Class[0]);
                    } catch (NoSuchMethodException ex2) {
                        getter = clazz.getMethod("is" + aName.substring(0, 1).toUpperCase() + aName.substring(1, aName.indexOf(".")), new Class[0]);
                    }
                    setter = clazz.getMethod("set" + aName.substring(0, 1).toUpperCase() + aName.substring(1, aName.indexOf(".")), new Class[]{getter.getReturnType()});
                    aName = aName.substring(aName.indexOf(".") + 1);
                    clazz = getter.getReturnType();
                    getters[i].add(getter);
                    setters[i].add(setter);
                }

                try {
                    getter = clazz.getMethod(
                            "get"
                            + aName.substring(0, 1).
                            toUpperCase()
                            + aName.substring(1),
                            new Class[0]);
                } catch (NoSuchMethodException ex2) {
                    getter = clazz.getMethod("is" + aName.substring(0, 1).toUpperCase() + aName.substring(1), new Class[0]);
                }

                setterMethods[i] = clazz.getMethod("set" + aName.substring(0, 1).toUpperCase() + aName.substring(1), new Class[]{getter.getReturnType()});
            }


            ArrayList list = new ArrayList();
            while (rows.size() > 0) {
                row = (Object[]) rows.remove(0);
                if (row.length != attributes.length) {
                    String msg = "row.length (" + row.length + ") is not equals to attributes.length (" + attributes.length + ")";
                    return new ErrorResponse(msg);
                }

                vo = valueObjectClass.newInstance();
                Object currentVO = null;
                Object innerVO = null;
                for (int i = 0; i < row.length; i++) {
                    currentVO = vo;
                    for (int j = 0; j < getters[i].size(); j++) {
                        if (((Method) getters[i].get(j)).invoke(currentVO, new Object[0]) == null) {
                            innerVO = ((Method) getters[i].get(j)).getReturnType().newInstance();  // instantiate the inner v.o.
                            ((Method) setters[i].get(j)).invoke(currentVO, new Object[]{innerVO});
                            currentVO = innerVO;
                        } else {
                            currentVO = ((Method) getters[i].get(j)).invoke(currentVO, new Object[0]);
                        }
                    }

                    Class parType = setterMethods[i].getParameterTypes()[0];
                    if (parType.equals(String.class)) {
                        value = row[i];
                    } //           else if (parType.equals(Boolean.class) ||
                    //                    parType.equals(boolean.class)) {
                    //             value = row[i];
                    //             if (value!=null && value.equals(booleanTrueValue))
                    //               value = Boolean.TRUE;
                    //             else if (value!=null && value.equals(booleanFalseValue))
                    //               value = Boolean.FALSE;
                    //           }
                    else if (parType.equals(BigDecimal.class)) {
                        value = row[i];
                    } else if (parType.equals(Double.class) || parType == Double.TYPE) {
                        value = row[i];
                        if (value != null) {
                            value = new Double(((BigDecimal) value).doubleValue());
                        }
                    } else if (parType.equals(Float.class) || parType == Float.TYPE) {
                        value = row[i];
                        if (value != null) {
                            value = new Float(((BigDecimal) value).floatValue());
                        }
                    } else if (parType.equals(Integer.class) || parType == Integer.TYPE) {
                        value = row[i];
                        if (value != null) {
                            value = new Integer(((BigDecimal) value).intValue());
                        }
                    } else if (parType.equals(Long.class) || parType == Long.TYPE) {
                        value = row[i];
                        if (value != null) {
                            value = new Long(((BigDecimal) value).longValue());
                        }
                    } else if (parType.equals(Short.class) || parType == Short.TYPE) {
                        value = row[i];
                        if (value != null) {
                            value = new Long(((BigDecimal) value).longValue());
                        }
                    } else if (parType.equals(java.util.Date.class)
                            || parType.equals(java.sql.Date.class)) {
                        value = row[i];
                    } else if (parType.equals(java.sql.Timestamp.class)) {
                        value = row[i];
                    } else {
                        value = row[i];
                    }

                    try {
                        setterMethods[i].invoke(currentVO, new Object[]{value});
                    } catch (IllegalArgumentException ex5) {
                        if (value != null && !value.getClass().getName().equals(parType.getClass().getName())) {
                            throw new Exception(
                                    "Incompatible type found between value read (" + value.getClass().getName() + ") and value expected (" + parType.getClass().getName() + ") in setter '" + setterMethods[i].getName() + "'.");
                        }
                    }
                } // end for

                list.add(vo);

            } // end while on rows
            return new VOListResponse(list, moreRows, list.size());

        } catch (Throwable ex) {
            return new ErrorResponse(ex.getMessage());
        }
    }

    /**
     * This method can be used to convert a single record Object[]to a ValueObject.
     * @param attributes list of attribute names of the specified value object, exactly one for each fields is the select clause (i.e. one for each elements of Object[])
     * @param valueObjectClass value object class to use to generate the result
     * @param row Object[], related to the record already read
     * @param booleanTrueValue read value to interpret as true
     * @param booleanFalseValue read value to interpret as false
     * @param context servlet context; this may be null
     * @return value object or an error response
     */
    public static Response getQuery(
            String[] attributes,
            Class valueObjectClass,
            Object[] row) throws Exception {
        try {
            Method[] setterMethods = new Method[attributes.length];
            Method getter = null;
            Method setter = null;
            String aName = null;
            ArrayList[] getters = new ArrayList[attributes.length];
            ArrayList[] setters = new ArrayList[attributes.length];
            Class clazz = null;
            Object vo = null;
            Object value = null;

            for (int i = 0; i < attributes.length; i++) {
                aName = attributes[i];
                getters[i] = new ArrayList(); // list of Methods objects (getters for accessing inner vos)
                setters[i] = new ArrayList(); // list of Methods objects (setters for instantiating inner vos)
                clazz = valueObjectClass;

                // check if the specified attribute is a composed attribute and there exist inner v.o. to instantiate...
                while (aName.indexOf(".") != -1) {
                    try {
                        getter = clazz.getMethod(
                                "get"
                                + aName.substring(0, 1).
                                toUpperCase()
                                + aName.substring(1, aName.indexOf(".")),
                                new Class[0]);
                    } catch (NoSuchMethodException ex2) {
                        getter = clazz.getMethod("is" + aName.substring(0, 1).toUpperCase() + aName.substring(1, aName.indexOf(".")), new Class[0]);
                    }
                    setter = clazz.getMethod("set" + aName.substring(0, 1).toUpperCase() + aName.substring(1, aName.indexOf(".")), new Class[]{getter.getReturnType()});
                    aName = aName.substring(aName.indexOf(".") + 1);
                    clazz = getter.getReturnType();
                    getters[i].add(getter);
                    setters[i].add(setter);
                }

                try {
                    getter = clazz.getMethod(
                            "get"
                            + aName.substring(0, 1).
                            toUpperCase()
                            + aName.substring(1),
                            new Class[0]);
                } catch (NoSuchMethodException ex2) {
                    getter = clazz.getMethod("is" + aName.substring(0, 1).toUpperCase() + aName.substring(1), new Class[0]);
                }

                setterMethods[i] = clazz.getMethod("set" + aName.substring(0, 1).toUpperCase() + aName.substring(1), new Class[]{getter.getReturnType()});
            }


            if (row.length != attributes.length) {
                String msg = "row.length (" + row.length + ") is not equals to attributes.length (" + attributes.length + ")";
                return new ErrorResponse(msg);
            }

            vo = valueObjectClass.newInstance();
            Object currentVO = null;
            Object innerVO = null;
            for (int i = 0; i < row.length; i++) {
                currentVO = vo;
                for (int j = 0; j < getters[i].size(); j++) {
                    if (((Method) getters[i].get(j)).invoke(currentVO, new Object[0]) == null) {
                        innerVO = ((Method) getters[i].get(j)).getReturnType().newInstance();  // instantiate the inner v.o.
                        ((Method) setters[i].get(j)).invoke(currentVO, new Object[]{innerVO});
                        currentVO = innerVO;
                    } else {
                        currentVO = ((Method) getters[i].get(j)).invoke(currentVO, new Object[0]);
                    }
                }

                Class parType = setterMethods[i].getParameterTypes()[0];
                if (parType.equals(String.class)) {
                    value = row[i];
                } //        else if (parType.equals(Boolean.class) ||
                //                 parType.equals(boolean.class)) {
                //          value = row[i];
                //          if (value!=null && value.equals(booleanTrueValue))
                //            value = Boolean.TRUE;
                //          else if (value!=null && value.equals(booleanFalseValue))
                //            value = Boolean.FALSE;
                //        }
                else if (parType.equals(BigDecimal.class)) {
                    value = row[i];
                } else if (parType.equals(Double.class) || parType == Double.TYPE) {
                    value = row[i];
                    if (value != null) {
                        value = new Double(((BigDecimal) value).doubleValue());
                    }
                } else if (parType.equals(Float.class) || parType == Float.TYPE) {
                    value = row[i];
                    if (value != null) {
                        value = new Float(((BigDecimal) value).floatValue());
                    }
                } else if (parType.equals(Integer.class) || parType == Integer.TYPE) {
                    value = row[i];
                    if (value != null) {
                        value = new Integer(((BigDecimal) value).intValue());
                    }
                } else if (parType.equals(Long.class) || parType == Long.TYPE) {
                    value = row[i];
                    if (value != null) {
                        value = new Long(((BigDecimal) value).longValue());
                    }
                } else if (parType.equals(Short.class) || parType == Short.TYPE) {
                    value = row[i];
                    if (value != null) {
                        value = new Long(((BigDecimal) value).longValue());
                    }
                } else if (parType.equals(java.util.Date.class)
                        || parType.equals(java.sql.Date.class)) {
                    value = row[i];
                } else if (parType.equals(java.sql.Timestamp.class)) {
                    value = row[i];
                } else {
                    value = row[i];
                }

                try {
                    setterMethods[i].invoke(currentVO, new Object[]{value});
                } catch (IllegalArgumentException ex5) {
                    throw new Exception(
                            "Error while converting Object[] to value object:\n"
                            + "Incompatible type found between value read (" + value.getClass().getName() + ") and value expected (" + parType.getClass().getName() + ") in setter '" + setterMethods[i].getName() + "'.");
                }
            } // end for

            return new VOResponse(vo);

        } catch (Throwable ex) {
            return new ErrorResponse(ex.getMessage());
        }
    }
}
