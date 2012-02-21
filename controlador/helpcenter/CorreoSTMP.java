package controlador.helpcenter;

import controlador.General;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import logger.LoggerUtil;
import modelo.entidades.helpcenter.maestra.Mensaje;

public class CorreoSTMP {

    private static String smtpHostDefault = "mail.cantv.net";

    public static void send(Mensaje vo) {
        enviarCorreoConAdjuntos(General.empresa.getEmailEmpresaSoporte(), General.empresa.getEmailSistemaSoporte(), vo.getAsunto(), vo.getMensajeEnvio(), (File[]) null);
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static boolean enviarCorreo(String from, String to, String asunto, String mensaje) {
        return enviarCorreo(smtpHostDefault, from, to, asunto, mensaje);
    }

    private static boolean enviarCorreo(String smtpHost, String from, String to, String asunto, String mensaje) {
        Properties props = System.getProperties();
        props.put("mail.smtp.host", smtpHost);
        Session sesion = Session.getDefaultInstance(props, null);
        Message correo = new MimeMessage(sesion);
        try {
            correo.setFrom(new InternetAddress(from));
            correo.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            correo.setSubject(asunto);
            correo.setText(mensaje);
            Transport.send(correo);
        } catch (MessagingException ex) {
            LoggerUtil.error(CorreoSTMP.class, "enviarCorreo", ex);
            return false;
        }
        return true;
    }

    public static void enviarCorreoConAdjuntos(String from, String to, String asunto, String mensaje, File... archivos) {
        enviarCorreoConAdjuntos(smtpHostDefault, from, to, asunto, mensaje, archivos);
    }

    private static void enviarCorreoConAdjuntos(String smtpHost, String from, String to, String asunto, String mensaje, File... archivos) {
        Properties props = System.getProperties();
        props.put("mail.smtp.host", smtpHost);
        Session sesion = Session.getDefaultInstance(props, null);
        Message correo = new MimeMessage(sesion);
        try {
            correo.setFrom(new InternetAddress(from));
            correo.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            correo.setSubject(asunto);
            Multipart mp = new MimeMultipart();
            BodyPart bp = new MimeBodyPart();
            bp.setText(mensaje);
            mp.addBodyPart(bp);
            MimeBodyPart adjuntos[] = new MimeBodyPart[archivos.length];
            for (int i = 0; i < adjuntos.length; i++) {
                adjuntos[i] = new MimeBodyPart();
                try {
                    adjuntos[i].attachFile(archivos[i]);
                } catch (IOException ex) {
                    LoggerUtil.error(CorreoSTMP.class, "enviarCorreo", ex);
                }
                mp.addBodyPart(adjuntos[i]);
            }
            correo.setContent(mp);
            Transport.send(correo);
        } catch (MessagingException ex) {
            LoggerUtil.error(CorreoSTMP.class, "enviarCorreo", ex);
        }
    }
}
