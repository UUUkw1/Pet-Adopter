import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel{
    private JLabel UserNameLabel;
    private JLabel PasswordLabel;
    private JTextField UserNameField;
    private JPasswordField PasswordField;
    public LoginPanel (JPanel contentpane, CardLayoutExample cle) {
        this.setLayout(null);
        UserNameLabel=new JLabel("Username:");
        UserNameLabel.setBounds(100,100,100,20);
        this.add(UserNameLabel);
        UserNameLabel.setVisible(true);
        PasswordLabel=new JLabel("Password:");
        PasswordLabel.setBounds(100,120,100,20);
        this.add(PasswordLabel);
        PasswordLabel.setVisible(true);
        UserNameField=new JTextField();
        UserNameField.setBounds(170,100,150,20);
        this.add(UserNameField);
        UserNameField.setVisible(true);
        PasswordField=new JPasswordField();
        PasswordField.setBounds(170,120,150,20);
        this.add(PasswordField);
        PasswordField.setVisible(true);
        JButton b = new JButton("Log In");
        b.setVisible(true);
        b.setBounds(200, 150, 80, 20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cle.hasUser(UserNameField.getText(), PasswordField.getText())) {
                    cle.loginUser(UserNameField.getText(), PasswordField.getText());
                    CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                    JOptionPane.showMessageDialog(null,"Login successfully.");
                    cardLayout.show(contentpane, "homepage");
                } else {
                    System.out.println("Incorrect username and password");
                    JOptionPane.showMessageDialog(null,"Incorrect username and password.");
                }
            }
        });
        this.add(b);
        JButton Register = new JButton("Register");
        Register.setVisible(true);
        Register.setBounds(100, 150, 80, 20);
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cle.loginUser(UserNameField.getText(), PasswordField.getText());
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "register");
            }
        });
        this.add(Register);
    }
    @Override
    public Dimension getPreferredSize(){
        return (new Dimension(500,500));
    }
}
