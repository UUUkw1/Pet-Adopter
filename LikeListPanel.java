import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class LikeListPanel extends JPanel {
    private JLabel NameL;
    private JLabel BirthdayL;
    private JLabel AgeL;
    private JLabel GenderL;
    private JLabel TypeL;
    private JLabel SizeL;
    private JLabel WeightL;
    private JLabel VaccinatedL;
    private JLabel SterilizedL;
    private JLabel InsuranceL;
    private JLabel picLabel;
    private JLabel NameInfo;
    private JLabel BirthdayInfo;
    private JLabel AgeInfo;
    private JLabel GenderInfo;
    private JLabel TypeInfo;
    private JLabel SizeInfo;
    private JLabel WeightInfo;
    private JLabel VaccinatedInfo;
    private JLabel SterilizedInfo;
    private JLabel InsuranceInfo;
    private JButton Next;
    private JButton Back;
    private JButton BackToHomePage;
    private int currentPetNo;

    public LikeListPanel(JPanel contentpane, CardLayoutExample cle) {
        this.setLayout(null);
        NameL = new JLabel("Name:");
        NameL.setBounds(10, 100, 100, 20);
        this.add(NameL);
        NameL.setVisible(true);
        BirthdayL = new JLabel("Birthday:");
        BirthdayL.setBounds(10, 120, 100, 20);
        this.add(BirthdayL);
        BirthdayL.setVisible(true);
        AgeL = new JLabel("Age:");
        AgeL.setBounds(10, 140, 100, 20);
        this.add(AgeL);
        AgeL.setVisible(true);
        GenderL = new JLabel("Gender:");
        GenderL.setBounds(10, 160, 100, 20);
        this.add(GenderL);
        GenderL.setVisible(true);
        TypeL = new JLabel("Type:");
        TypeL.setBounds(10, 180, 100, 20);
        this.add(TypeL);
        TypeL.setVisible(true);
        SizeL = new JLabel("Size:");
        SizeL.setBounds(10, 200, 100, 20);
        this.add(SizeL);
        SizeL.setVisible(true);
        WeightL = new JLabel("Weight:");
        WeightL.setBounds(10, 220, 100, 20);
        this.add(WeightL);
        WeightL.setVisible(true);
        VaccinatedL = new JLabel("Is he/she vaccinated?");
        VaccinatedL.setBounds(10, 240, 500, 20);
        this.add(VaccinatedL);
        VaccinatedL.setVisible(true);
        SterilizedL = new JLabel("Is he/she sterilized?");
        SterilizedL.setBounds(10, 260, 500, 20);
        this.add(SterilizedL);
        SterilizedL.setVisible(true);
        InsuranceL = new JLabel("Does he/she has insurance?");
        InsuranceL.setBounds(10, 280, 500, 20);
        this.add(InsuranceL);
        InsuranceL.setVisible(true);
        picLabel = new JLabel();
        picLabel.setBounds(240,100,250,250);
        this.add(picLabel);
        picLabel.setVisible(true);
        if ((cle.getPetList().get("temp").getPicture())!=null) {
            try {
                System.out.println("aaa");
                picLabel.setIcon(new ImageIcon(cle.getPetList().get("temp").getPicture()));
            } catch (Exception e) {
                System.out.println("image read error");
            }
        }
        Next = new JButton("Next");
        Next.setBounds(10, 300, 100, 20);
        this.add(Next);
        Next.setVisible(true);
        Back = new JButton("Back");
        Back.setBounds(120, 300, 100, 20);
        this.add(Back);
        Back.setVisible(true);
        BackToHomePage = new JButton("Back to Home Page");
        BackToHomePage.setBounds(10, 320, 200, 20);
        this.add(BackToHomePage);
        BackToHomePage.setVisible(true);
        NameInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getName()));
        NameInfo.setBounds(100, 100, 100, 20);
        this.add(NameInfo);
        NameInfo.setVisible(true);
        BirthdayInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getBirthday()));
        BirthdayInfo.setBounds(100, 120, 100, 20);
        this.add(BirthdayInfo);
        BirthdayInfo.setVisible(true);
        AgeInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getAge()));
        AgeInfo.setBounds(100, 140, 100, 20);
        this.add(AgeInfo);
        AgeInfo.setVisible(true);
        GenderInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getGender()));
        GenderInfo.setBounds(100, 160, 100, 20);
        this.add(GenderInfo);
        GenderInfo.setVisible(true);
        TypeInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getType()));
        TypeInfo.setBounds(100, 180, 100, 20);
        this.add(TypeInfo);
        TypeInfo.setVisible(true);
        SizeInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getSize()));
        SizeInfo.setBounds(100, 200, 100, 20);
        this.add(SizeInfo);
        SizeInfo.setVisible(true);
        WeightInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).getWeight()));
        WeightInfo.setBounds(100, 220, 100, 20);
        this.add(WeightInfo);
        WeightInfo.setVisible(true);
        VaccinatedInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).isVaccinated()));
        VaccinatedInfo.setBounds(200, 240, 500, 20);
        this.add(VaccinatedInfo);
        VaccinatedInfo.setVisible(true);
        SterilizedInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).isSterilized()));
        SterilizedInfo.setBounds(200, 260, 500, 20);
        this.add(SterilizedInfo);
        SterilizedInfo.setVisible(true);
        InsuranceInfo = new JLabel(String.valueOf(cle.getPetList().get(cle.likeNameList.get(0)).isInsurance()));
        InsuranceInfo.setBounds(200, 280, 500, 20);
        this.add(InsuranceInfo);
        InsuranceInfo.setVisible(true);

        BackToHomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "homepage");
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                currentPetNo+=1;
                if (currentPetNo<cle.likeNameList.size()) {
                    NameInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getName()));
                    BirthdayInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getBirthday()));
                    AgeInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getAge()));
                    GenderInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getGender()));
                    TypeInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getType()));
                    SizeInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getSize()));
                    WeightInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getWeight()));
                    VaccinatedInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).isVaccinated()));
                    SterilizedInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).isSterilized()));
                    InsuranceInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).isInsurance()));
                    if ((cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getPicture())!=null) {
                        picLabel.setIcon(new ImageIcon(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getPicture()));
                    }
                } else {
                    currentPetNo-=1;
                }
            }
        });
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                currentPetNo-=1;
                if (currentPetNo>=0) {
                    NameInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getName()));
                    BirthdayInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getBirthday()));
                    AgeInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getAge()));
                    GenderInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getGender()));
                    TypeInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getType()));
                    SizeInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getSize()));
                    WeightInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getWeight()));
                    VaccinatedInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).isVaccinated()));
                    SterilizedInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).isSterilized()));
                    InsuranceInfo.setText(String.valueOf(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).isInsurance()));
                    if ((cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getPicture())!=null) {
                        picLabel.setIcon(new ImageIcon(cle.getPetList().get(cle.likeNameList.get(currentPetNo)).getPicture()));
                    }
                } else {
                    currentPetNo+=1;
                }
            }
        });
    }
    @Override
    public Dimension getPreferredSize(){
        return (new Dimension(500,500));
    }
}
