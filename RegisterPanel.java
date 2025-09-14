import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel{
    private JButton Register;
    private JLabel UserNameLabel;
    private JLabel PasswordLabel;
    private JLabel Password2Label;
    private JPasswordField Password2Field;
    private JTextField UserNameField;
    private JPasswordField PasswordField;
    public RegisterPanel (JPanel contentpane, CardLayoutExample cle) {
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
        UserNameField.setBounds(220,100,150,20);
        this.add(UserNameField);
        UserNameField.setVisible(true);
        PasswordField=new JPasswordField();
        PasswordField.setBounds(220,120,150,20);
        this.add(PasswordField);
        PasswordField.setVisible(true);
        Password2Label=new JLabel("Confirm password:");
        Password2Label.setBounds(100,140,150,20);
        this.add(Password2Label);
        Password2Label.setVisible(true);
        Password2Field=new JPasswordField();
        Password2Field.setBounds(220,140,150,20);
        this.add(Password2Field);
        Password2Field.setVisible(true);
        Register = new JButton("Register");
        Register.setBounds(100, 170, 80, 20);
        this.add(Register);
        Register.setVisible(true);
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PasswordField.getText().equals(Password2Field.getText())) {
                    if(cle.addUser(UserNameField.getText(), PasswordField.getText())) {
                        CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                        cardLayout.show(contentpane, "login");
                    }else {
                        System.out.println("False");
                    }
                }else {
                    System.out.println("Passwords not match");
                }
            }
        });
    }
    @Override
    public Dimension getPreferredSize(){
        return (new Dimension(500,500));
    }
}

