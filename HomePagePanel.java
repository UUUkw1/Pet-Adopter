import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePagePanel extends JPanel {
    private JButton check;
    private JButton add;
    private JButton logout;
    private JButton likelist;
    public HomePagePanel(JPanel contentpane) {
        this.setLayout(null);
        check = new JButton("Check Pet Information");
        check.setBounds(100, 100, 200, 20);
        this.add(check);
        check.setVisible(true);
        add = new JButton("Add New Pet Information");
        add.setBounds(100, 120, 200, 20);
        this.add(add);
        add.setVisible(true);
        logout = new JButton("Log Out");
        logout.setBounds(100, 160, 200, 20);
        this.add(logout);
        logout.setVisible(true);
        likelist = new JButton("Check my like list");
        likelist.setBounds(100, 140, 200, 20);
        this.add(likelist);
        likelist.setVisible(true);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "display");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "newpet");
            }
        });
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "login");
            }
        });
        likelist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "likelist");
            }
        });
    }
    @Override
    public Dimension getPreferredSize(){
        return (new Dimension(500,500));
    }
}
