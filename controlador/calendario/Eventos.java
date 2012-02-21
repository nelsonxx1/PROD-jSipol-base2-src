/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package controlador.calendario;

import com.google.gdata.client.calendar.CalendarService;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.WebContent;
import com.google.gdata.data.extensions.Recurrence;
import com.google.gdata.data.extensions.When;
import com.google.gdata.util.ServiceException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author orlandobcrra
 */
public class Eventos {
// The base URL for a user's calendar metafeed (needs a username appended).

    private static final String METAFEED_URL_BASE =
            "https://www.google.com/calendar/feeds/";
    // The string to add to the user's metafeedUrl to access the event feed for
    // their primary calendar.
    private static final String EVENT_FEED_URL_SUFFIX = "/private/full";
    // The URL for the metafeed of the specified user.
    // (e.g. http://www.google.com/feeds/calendar/jdoe@gmail.com)
    private static URL metafeedUrl = null;
    // The URL for the event feed of the specified user's primary calendar.
    // (e.g. http://www.googe.com/feeds/calendar/jdoe@gmail.com/private/full)
    private static URL eventFeedUrl = null;

    public Eventos() {
    }

    /**
     * Creates a single-occurrence event.
     *
     * @param service An authenticated CalendarService object.
     * @param eventTitle Title of the event to create.
     * @param eventContent Text content of the event to create.
     * @return The newly-created CalendarEventEntry.
     * @throws ServiceException If the service is unable to handle the request.
     * @throws IOException Error communicating with the server.
     */
    private static CalendarEventEntry createSingleEvent(CalendarService service,
            String eventTitle, String eventContent) throws ServiceException,
            IOException {
        return createEvent(service, eventTitle, eventContent, null, false, null);
    }

    /**
     * Helper method to create either single-instance or recurring events. For
     * simplicity, some values that might normally be passed as parameters (such
     * as author name, email, etc.) are hard-coded.
     *
     * @param service An authenticated CalendarService object.
     * @param eventTitle Title of the event to create.
     * @param eventContent Text content of the event to create.
     * @param recurData Recurrence value for the event, or null for
     *        single-instance events.
     * @param isQuickAdd True if eventContent should be interpreted as the text of
     *        a quick add event.
     * @param wc A WebContent object, or null if this is not a web content event.
     * @return The newly-created CalendarEventEntry.
     * @throws ServiceException If the service is unable to handle the request.
     * @throws IOException Error communicating with the server.
     */
    private static CalendarEventEntry createEvent(CalendarService service,
            String eventTitle, String eventContent, String recurData,
            boolean isQuickAdd, WebContent wc) throws ServiceException, IOException {
        CalendarEventEntry myEntry = new CalendarEventEntry();

        myEntry.setTitle(new PlainTextConstruct(eventTitle));
        myEntry.setContent(new PlainTextConstruct(eventContent));
        myEntry.setQuickAdd(isQuickAdd);
        myEntry.setWebContent(wc);

        // If a recurrence was requested, add it. Otherwise, set the
        // time (the current date and time) and duration (30 minutes)
        // of the event.
        if (recurData == null) {
            Calendar calendar = new GregorianCalendar();
            DateTime startTime = new DateTime(calendar.getTime(), TimeZone.getDefault());

            calendar.add(Calendar.MINUTE, 30);
            DateTime endTime = new DateTime(calendar.getTime(),
                    TimeZone.getDefault());

            When eventTimes = new When();
            eventTimes.setStartTime(startTime);
            eventTimes.setEndTime(endTime);
            myEntry.addTime(eventTimes);
        } else {
            Recurrence recur = new Recurrence();
            recur.setValue(recurData);
            myEntry.setRecurrence(recur);
        }
        // Send the request and receive the response:
        return service.insert(eventFeedUrl, myEntry);
    }

    public static void main(String[] args) {
        try {


            CalendarService myService = new CalendarService("exampleCo-exampleApp-1");

            String userName = "jsipolee@gmail.com";
            String userPassword = "claveja123";

            // Create the necessary URL objects.
            try {
                metafeedUrl = new URL(METAFEED_URL_BASE + userName);
                eventFeedUrl = new URL(METAFEED_URL_BASE + userName
                        + EVENT_FEED_URL_SUFFIX);
            } catch (MalformedURLException e) {
                // Bad URL
                System.err.println("Uh oh - you've got an invalid URL.");
                e.printStackTrace();
                return;
            }

            myService.setUserCredentials(userName, userPassword);

            CalendarEventEntry singleEvent = createSingleEvent(myService, "Titulo", "Detalle");
            System.out.println("Successfully created event "
                    + singleEvent.getTitle().getPlainText());

            
        } catch (ServiceException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
