

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class PasswordGeneratorView extends JFrame {
    JCheckBox chkLetters, chkNumbers, chkSymbols;
    JTextField txtPassword;
    JButton btnGenerate;
    
    public PasswordGeneratorView() {
        setTitle("Generador de Contraseñas");
        setSize(300, 200);
        setLayout(new FlowLayout());
        
        chkLetters = new JCheckBox("Letras");
        chkNumbers = new JCheckBox("Números");
        chkSymbols = new JCheckBox("Símbolos");
        txtPassword = new JTextField(15);
        txtPassword.setEditable(false);
        btnGenerate = new JButton("Generar");
        
        add(chkLetters);
        add(chkNumbers);
        add(chkSymbols);
        add(txtPassword);
        add(btnGenerate);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}