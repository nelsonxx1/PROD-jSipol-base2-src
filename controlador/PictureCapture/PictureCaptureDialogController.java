package controlador.PictureCapture;

import controlador.General;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logger.LoggerUtil;
import org.openswing.swing.client.OptionPane;
import org.openswing.swing.mdi.client.MDIFrame;
import vista.PictureCapture.PictureCaptureDialog;

public class PictureCaptureDialogController extends WindowAdapter implements ActionListener {

   
    private PictureCaptureDialog vista;
    public final boolean isAllOk;
    private Image image;
    private File file;
    public static final String DEFAULT_FILE_NAME = "ImagenCapturada";

    public PictureCaptureDialogController() {
        vista = new PictureCaptureDialog(null, this);
        vista.getPicturePanel().setVisible(false);
        isAllOk = playerStart(vista.getVideoPanel());
        if (!isAllOk) {
            OptionPane.showMessageDialog(
                    MDIFrame.getInstance(),
                    "camara.no.disponible",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean playerStart(JPanel vidPanel) {
        boolean allOk2 = false;
        try {
            String camara = "vfw://0";
//            String str2 = "vfw:Microsoft WDM Image Capture (Win32):0";
//            String str1 = "vfw:Logitech USB Video Camera:0";
//            Vector v = CaptureDeviceManager.getDeviceList();
//            for (int i = 0; i < v.size(); i++) {
//                Object object = v.elementAt(i);
//                System.out.println(object);
//            }
//            System.out.println("-------" + v.size());
//            CaptureDeviceInfo di = CaptureDeviceManager.getDevice(str2);
//            CaptureDeviceInfo di = CaptureDeviceManager.getDevice(General.licencia.getCodigoCamara());
//            System.out.println("di: " + di);
//            MediaLocator ml = di.getLocator();
//            player = Manager.createRealizedPlayer(ml);
//            player.start();
//            allOk2 = true;

//            Processor p = Manager.createProcessor(ml);
//            p.configure();
//
//            for (TrackControl trackControl : p.getTrackControls()) {
//                System.out.println(trackControl);
//            }
////            player = Manager.createProcessor(ml);
////            boolean result = waitForState(player, Processor.Configured);
////            if (result == false) {
////                System.out.println("Couldn't configure processor");
////                return allOk2;
////            }


//ContentDescriptor.
//            result = waitForState(player, Processor.Prefetched);
//            if (result == false) {
//                System.out.println("Couldn't Started processor");
//                return allOk2;
//            }

////            TrackControl[] tracks = player.getTrackControls();
////
////            // Do we have atleast one track?
////            if (tracks == null || tracks.length < 1) {
////                System.out.println("Couldn't find tracks in processor");
////                return allOk2;
////            }
////            Format supported[];
////            Format chosen;
////            boolean atLeastOneTrack = false;
////
////
////            // Program the tracks.
////            for (int i = 0; i < tracks.length; i++) {
////                //Format format = tracks[i].getFormat();
////                for (int j = 0; j < 42; j++) {
////                    System.out.println(tracks[i].getSupportedFormats()[j]);
////
////                }
////                if (tracks[i].isEnabled()) {
////
////                    // We've set the output content to the RAW_RTP.
////                    // So all the supported formats should work with RTP.
////                    // We'll just pick the first one.
////
//////                    if (supported.length > 0) {
//////                        if (supported[0] instanceof VideoFormat) {
//////                            // For video formats, we should double check the
//////                            // sizes since not all formats work in all sizes.
//////                            chosen = checkForVideoSizes(tracks[i].getFormat(),
//////                                    supported[0]);
//////                        } else {
//////                            chosen = supported[0];
//////                        }
//////                        tracks[i].setFormat(chosen);
//////                        System.err.println("Track " + i + " is set to transmit as:");
//////                        System.err.println("  " + chosen);
//////                        atLeastOneTrack = true;
//////                    } else {
//////                        tracks[i].setEnabled(false);
//////                    }
////                } else {
////                    tracks[i].setEnabled(false);
////                }
////            }
////
////            result = waitForState(player, Processor.Realized);
////            if (result == false) {
////                System.out.println("Couldn't Realized processor");
////                return allOk2;
////            }

          
            allOk2 = true;
        } catch (Exception ex) {
            LoggerUtil.error(this.getClass(), "playerStart", ex);
        }
        if (allOk2) {
            Component comp;
           
        }
        return allOk2;
    }

////    /**
////     * Setting the encoding quality to the specified value on the JPEG encoder.
////     * 0.5 is a good default.
////     */
////    void setJPEGQuality(Player p, float val) {
////        System.out.println("jaja");
////        Control cs[] = p.getControls();
////        QualityControl qc = null;
////        VideoFormat jpegFmt = new VideoFormat(VideoFormat.JPEG);
////
////        // Loop through the controls to find the Quality control for
////        // the JPEG encoder.
////        System.out.println("---9---");
////        for (Format f : ((com.sun.media.renderer.video.GDIRenderer) cs[2]).getSupportedInputFormats()) {
////            System.out.println(f);
////        }
////        System.out.println("--*---");
////
////        System.out.println(cs.length);
////        for (int i = 0; i < cs.length; i++) {
////            System.out.println(cs[i]);
////            if (cs[i] instanceof QualityControl
////                    && cs[i] instanceof Owned) {
////                Object owner = ((Owned) cs[i]).getOwner();
////                System.out.println("dentro");
////                // Check to see if the owner is a Codec.
////                // Then check for the output format.
////                if (owner instanceof Codec) {
////                    Format fmts[] = ((Codec) owner).getSupportedOutputFormats(null);
////                    for (int j = 0; j < fmts.length; j++) {
////
////
////                        if (fmts[j].matches(jpegFmt)) {
////                            qc = (QualityControl) cs[i];
////                            qc.setQuality(val);
////                            System.err.println("- Setting quality to "
////                                    + val + " on " + qc);
////                            break;
////                        }
////                    }
////                }
////                if (qc != null) {
////                    break;
////                }
////            }
////        }
////    }

    private void playerClose() {
       
    }

    private void capture(boolean showPicture) {
       
    }

    private File saveJPG(Image image, String name) {
        File imageFile = new File(name);
        try {
            ImageIO.write((RenderedImage) image, "JPEG", imageFile);
        } catch (IOException ex) {
            LoggerUtil.error(this.getClass(), "saveJPG", ex);
        }
        return imageFile;
    }

    private void saveJPG() {
        if (this.image != null) {
            this.file = saveJPG(this.image, System.getProperty("java.io.tmpdir") + "jSipolEEimageCache");
        } else {
            this.file = null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getPreviewButton())) {
            vista.getVideoPanel().setVisible(true);
            vista.getPicturePanel().setVisible(false);
            vista.getPreviewButton().setEnabled(false);
            vista.getSaveButton().setEnabled(false);
        } else if (e.getSource().equals(vista.getCaptureButton())) {
            vista.getPreviewButton().setEnabled(true);
            vista.getVideoPanel().setVisible(false);
            vista.getPicturePanel().setVisible(true);
            vista.getSaveButton().setEnabled(true);
            capture(true);
        } else if (e.getSource().equals(vista.getSaveButton())) {
            saveJPG();
            playerClose();
            vista.dispose();
        } else if (e.getSource().equals(vista.getCancelButton())) {
            playerClose();
            vista.dispose();
        }
    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent evt) {
        playerClose();
    }

    public int showCaptureDialog() {
        if (isAllOk) {
            vista.setVisible(true);
            if (file != null) {
                return JOptionPane.YES_OPTION;
            } else {
                return JOptionPane.NO_OPTION;
            }
        } else {
            OptionPane.showMessageDialog(
                    MDIFrame.getInstance(),
                    "Camara \"" + General.licencia.getCodigoCamara() + "\" \n"
                    + "No disponible.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return JOptionPane.CANCEL_OPTION;
        }
    }

    public File getFile() {
        return file;
    }

    public String getFileName() {
        return DEFAULT_FILE_NAME;
    }
////    /****************************************************************
////     * Convenience methods to handle processor's state changes.
////     ****************************************************************/
////    private Integer stateLock = new Integer(0);
////    private boolean failed = false;
////
////    Integer getStateLock() {
////        return stateLock;
////    }
////
////    void setFailed() {
////        failed = true;
////    }
////
////    private synchronized boolean waitForState(Processor p, int state) {
////        p.addControllerListener(new StateListener());
////        failed = false;
////
////        // Call the required method on the processor
////        if (state == Processor.Configured) {
////            p.configure();
////        } else if (state == Processor.Realized) {
////            p.realize();
////        }
////
////        // Wait until we get an event that confirms the
////        // success of the method, or a failure event.
////        // See StateListener inner class
////        while (p.getState() < state && !failed) {
////            synchronized (getStateLock()) {
////                try {
////                    getStateLock().wait();
////                } catch (InterruptedException ie) {
////                    return false;
////                }
////            }
////        }
////
////        if (failed) {
////            return false;
////        } else {
////            return true;
////        }
////    }
////
////    /****************************************************************
////     * Inner Classes
////     ****************************************************************/
////    class StateListener implements ControllerListener {
////
////        public void controllerUpdate(ControllerEvent ce) {
////            // If there was an error during configure or
////            // realize, the processor will be closed
////            if (ce instanceof ControllerClosedEvent) {
////                setFailed();
////            }
////
////            // All controller events, send a notification
////            // to the waiting thread in waitForState method.
////            if (ce instanceof ControllerEvent) {
////                synchronized (getStateLock()) {
////                    getStateLock().notifyAll();
////                }
////            }
////        }
////    }
}
