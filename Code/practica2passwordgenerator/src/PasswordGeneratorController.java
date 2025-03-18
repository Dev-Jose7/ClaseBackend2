
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class PasswordGeneratorController {
    private final PasswordGeneratorView view;
    
    public PasswordGeneratorController(PasswordGeneratorView view) {
        this.view = view;
        this.view.btnGenerate.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean letters = view.chkLetters.isSelected();
                boolean numbers = view.chkNumbers.isSelected();
                boolean symbols = view.chkSymbols.isSelected();
                
                String password = PasswordGenerator.generatePassword(letters, numbers, symbols);
                view.txtPassword.setText(password);
            }
        });
    }
}
