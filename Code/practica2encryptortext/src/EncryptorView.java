
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class EncryptorView extends JFrame {
    JTextField txtInput, txtOutput;
    JButton btnEncrypt, btnDecrypt;
    
    public EncryptorView() {
        setTitle("Encriptador / Desencriptador");
        setSize(300, 200);
        setLayout(new FlowLayout());
        
        txtInput = new JTextField(15);
        txtOutput = new JTextField(15);
        txtOutput.setEditable(false);
        btnEncrypt = new JButton("Encriptar");
        btnDecrypt = new JButton("Desencriptar");
        
        add(new JLabel("Texto:"));
        add(txtInput);
        add(btnEncrypt);
        add(btnDecrypt);
        add(new JLabel("Resultado:"));
        add(txtOutput);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
