

package controlador.licencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import logger.LoggerUtil;

public class Equipo {

    public static String getSerial() {
        String serial = null;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                Process p = Runtime.getRuntime().exec("cmd /c dir xserialx");
                BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
                b.readLine();
                String s = b.readLine();
                serial = s.substring(s.indexOf(": ") + 2);
            } catch (Exception ex) {
                LoggerUtil.error(Equipo.class, "getSerial", ex);
            }
        } else {
            serial = "Linux";
        }
        return serial;
    }

    public static byte[] encodeText(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            //return new String(md.digest(password.getBytes()));
            return (md.digest(password.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            LoggerUtil.error(Equipo.class, "encodeText", ex);
        }
        return null;
    }

    public static String encodeText2(String text) {
        byte bs[] = text.getBytes();
        for (int i = 0; i < bs.length; i++) {
            bs[i] += i + 1;
        }
        return new String(bs);
    }

    public static String decodeText(String encry) {
        byte bs[] = encry.getBytes();
        for (int i = 0; i < bs.length; i++) {
            bs[i] -= i + 1;
        }
        return new String(bs);
    }
}
