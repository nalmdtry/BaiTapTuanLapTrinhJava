package ungdung;

import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            XMLGui gui = new XMLGui();
            gui.setVisible(true);
        });
    }
}
