
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EncryptorController {
    private EncryptorView view;
    
    public EncryptorController(EncryptorView view) {
        this.view = view;
        this.view.btnEncrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = view.txtInput.getText();
                view.txtOutput.setText(Encryptor.encrypt(text));
            }
        });
        
        this.view.btnDecrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = view.txtInput.getText();
                view.txtOutput.setText(Encryptor.decrypt(text));
            }
        });
    }
}
