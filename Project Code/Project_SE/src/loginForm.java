import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class loginForm extends screen{
    private JLabel cityVerseL;
    private JPanel cityVerseP;
    private JPanel loginPanel;
    private JLabel loginL;
    private JTextField userName;
    private JPasswordField pass;
    private JLabel usernameL;
    private JLabel passwordL;
    private JButton login;

    //construstor
    public loginForm() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(login,"Success!");
                String usernameValue = userName.getText();
                char[] passwordValue = pass.getPassword();
                String passwordValueString = new String(passwordValue);
                dbConnection user_select = new dbConnection();
                user_select.userSelect(usernameValue,passwordValueString);
            }
        });
    }

    //methods

    public void createLoginForm() {
        loginForm scr3 = new loginForm();
        scr3.setContentPane(scr3.loginPanel);
        scr3.setVisible(true);
        scr3.setSize(600, 400);
        scr3.setTitle("Login Form");
        scr3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
