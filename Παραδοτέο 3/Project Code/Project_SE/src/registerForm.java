import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registerForm extends screen {
    private JLabel cityVerseLabel;
    private JPanel cityVersePanel;
    private JLabel registerLabel;
    private JTextField email;
    private JPasswordField password;
    private JLabel usernameLabel;
    private JLabel emailLabel;
    private JTextField username;
    private JLabel loginLabel;
    private JLabel passLabel;
    private JButton signUp;
    private JPanel formPanel;


    //Constructor

    public registerForm() {
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(signUp,username.getText());
                String usernameVal = username.getText();
                String emailVal = email.getText();
                char[] passwordVal = password.getPassword();
                String passwordValString = new String(passwordVal);
            }
        });
    }


    public void createRegisterForm() {
        registerForm scr2 = new registerForm();
        scr2.setContentPane(scr2.formPanel);
        scr2.setVisible(true);
        scr2.setSize(600, 400);
        scr2.setTitle("Form Completed");
        scr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
