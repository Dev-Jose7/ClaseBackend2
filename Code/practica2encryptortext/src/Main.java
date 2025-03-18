
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EncryptorView encryptorView = new EncryptorView();
            new EncryptorController(encryptorView);
            encryptorView.setVisible(true);
        });
    }
}
