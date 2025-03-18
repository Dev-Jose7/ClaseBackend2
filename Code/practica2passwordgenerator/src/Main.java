
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordGeneratorView passwordView = new PasswordGeneratorView();
            new PasswordGeneratorController(passwordView);
            passwordView.setVisible(true);
            
        });
    }
}
