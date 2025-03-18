
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordGeneratorView passwordView = new PasswordGeneratorView();
            new PasswordGeneratorController(passwordView);
            passwordView.setVisible(true);
            
        });
    }
}
