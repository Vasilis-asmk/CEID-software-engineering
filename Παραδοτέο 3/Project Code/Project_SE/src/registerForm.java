import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



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


    //constructor

    public registerForm() {
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(signUp,"Success!");
                String usernameVal = username.getText();
                String emailVal = email.getText();
                char[] passwordVal = password.getPassword();
                String passwordValString = new String(passwordVal);
                dbConnection user_insert = new dbConnection();
                user_insert.userInsert(usernameVal, emailVal, passwordValString);
            }
        });

        loginLabel.setText("<html><a href=' '>Already an account?Login here.</a></html>");
        loginLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                loginForm user_login = new loginForm();
                user_login.createLoginForm();
            }
        });

    }


    public void createRegisterForm() {
        registerForm scr2 = new registerForm();
        scr2.setContentPane(scr2.formPanel);
        scr2.setVisible(true);
        scr2.setSize(600, 400);
        scr2.setTitle("Register Form");
        scr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
