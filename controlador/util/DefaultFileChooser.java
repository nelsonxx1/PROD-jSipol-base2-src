package controlador.util;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.Hashtable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileView;

/**
 *
 * @author orlandobcrra
 */
public class DefaultFileChooser {

    private static JFileChooser fileChooser;

    public DefaultFileChooser() {
        fileChooser = new JFileChooser();
        fileChooser.setAccessory(new FilePreviewer(fileChooser));
        //ExampleFileView fileView = new ExampleFileView();
        //fileView.putIcon("jpg", new javax.swing.ImageIcon(getClass().getResource("/images/cancel2.png")));
        //fileView.putIcon("gif", new javax.swing.ImageIcon(getClass().getResource("/images/cancel2.png")));
        //fileChooser.setFileView(fileView);
    }

    public static JFileChooser getFileChooser() {
        return fileChooser;
    }

    class FilePreviewer extends JComponent implements PropertyChangeListener {

        ImageIcon thumbnail = null;

        public FilePreviewer(JFileChooser fc) {
            setPreferredSize(new Dimension(200, 100));
            fc.addPropertyChangeListener(this);
            setBorder(new BevelBorder(BevelBorder.LOWERED));
        }

        public void loadImage(File f) {
            if (f == null) {
                thumbnail = null;
            } else {
                ImageIcon tmpIcon = new ImageIcon(f.getPath());
                if (tmpIcon.getIconWidth() > 190) {
                    thumbnail = new ImageIcon(
                            tmpIcon.getImage().getScaledInstance(190, -1, Image.SCALE_DEFAULT));
                } else {
                    thumbnail = tmpIcon;
                }
            }
        }

        public void propertyChange(PropertyChangeEvent e) {
            String prop = e.getPropertyName();
            if (prop == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY) {
                if (isShowing()) {
                    loadImage((File) e.getNewValue());
                    repaint();
                }
            }
        }

        public void paint(Graphics g) {
            super.paint(g);
            if (thumbnail != null) {
                int x = getWidth() / 2 - thumbnail.getIconWidth() / 2;
                int y = getHeight() / 2 - thumbnail.getIconHeight() / 2;
                if (y < 5) {
                    y = 5;
                }

                if (x < 5) {
                    x = 5;
                }
                thumbnail.paintIcon(this, g, x, y);
            }
        }
    }

    class ExampleFileView extends FileView {

        private Hashtable icons = new Hashtable(5);
        private Hashtable fileDescriptions = new Hashtable(5);
        private Hashtable typeDescriptions = new Hashtable(5);

        /**
         * The name of the file.  Do nothing special here. Let
         * the system file view handle this.
         * @see FileView#getName
         */
        public String getName(File f) {
            return null;
        }

        /**
         * Adds a human readable description of the file.
         */
        public void putDescription(File f, String fileDescription) {
            fileDescriptions.put(f, fileDescription);
        }

        /**
         * A human readable description of the file.
         *
         * @see FileView#getDescription
         */
        public String getDescription(File f) {
            return (String) fileDescriptions.get(f);
        }

        ;

        /**
         * Adds a human readable type description for files. Based on "dot"
         * extension strings, e.g: ".gif". Case is ignored.
         */
        public void putTypeDescription(String extension, String typeDescription) {
            typeDescriptions.put(extension, typeDescription);
        }

        /**
         * Adds a human readable type description for files of the type of
         * the passed in file. Based on "dot" extension strings, e.g: ".gif".
         * Case is ignored.
         */
        public void putTypeDescription(File f, String typeDescription) {
            putTypeDescription(getExtension(f), typeDescription);
        }

        /**
         * A human readable description of the type of the file.
         *
         * @see FileView#getTypeDescription
         */
        public String getTypeDescription(File f) {
            return (String) typeDescriptions.get(getExtension(f));
        }

        /**
         * Convenience method that returns the "dot" extension for the
         * given file.
         */
        public String getExtension(File f) {
            String name = f.getName();
            if (name != null) {
                int extensionIndex = name.lastIndexOf('.');
                if (extensionIndex < 0) {
                    return null;
                }
                return name.substring(extensionIndex + 1).toLowerCase();
            }
            return null;
        }

        /**
         * Adds an icon based on the file type "dot" extension
         * string, e.g: ".gif". Case is ignored.
         */
        public void putIcon(String extension, Icon icon) {
            icons.put(extension, icon);
        }

        /**
         * Icon that reperesents this file. Default implementation returns
         * null. You might want to override this to return something more
         * interesting.
         *
         * @see FileView#getIcon
         */
        public Icon getIcon(File f) {
            Icon icon = null;
            String extension = getExtension(f);
            if (extension != null) {
                icon = (Icon) icons.get(extension);
            }
            return icon;
        }

        /**
         * Whether the directory is traversable or not. Generic implementation
         * returns true for all directories and special folders.
         *
         * You might want to subtype ExampleFileView to do somethimg more interesting,
         * such as recognize compound documents directories; in such a case you might
         * return a special icon for the directory that makes it look like a regular
         * document, and return false for isTraversable to not allow users to
         * descend into the directory.
         *
         * @see FileView#isTraversable
         */
        public Boolean isTraversable(File f) {
            // if (some_reason) {
            //    return Boolean.FALSE;
            // }
            return null;	// Use default from FileSystemView
        }
    }
}
