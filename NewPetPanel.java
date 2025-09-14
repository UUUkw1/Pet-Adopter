import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NewPetPanel extends JPanel {
    private JLabel Petinfo;
    private JLabel NameL;
    private JLabel NameL2;
    private JLabel BirthdayL2;
    private JLabel BirthdayL;
    private JLabel BirthdayTip;
    private JLabel AgeL;
    private JLabel GenderL;
    private JLabel AgeL2;
    private JLabel GenderL2;
    private JComboBox GenderJ;
    private JLabel TypeL;
    private JLabel TypeL2;
    private JComboBox TypeJ;
    private JLabel SizeL;
    private JLabel SizeL2;
    private JRadioButton SButton;
    private JRadioButton MButton;
    private JRadioButton LButton;
    private JLabel WeightL;
    private JLabel WeightL2;
    private JLabel WeightTip;
    private JLabel VaccinatedL;
    private JLabel VaccinatedL2;
    private JComboBox VaccinatedJ;
    private JLabel SterilizedL;
    private JLabel SterilizedL2;
    private JComboBox SterilizedJ;
    private JLabel InsuranceL;
    private JLabel InsuranceL2;
    private JComboBox InsuranceJ;
    private JLabel PictureL;
    private JTextField NameInfo;
    private JLabel NameInfo2;
    private JTextField BirthdayInfo;
    private JTextField AgeInfo;
    private JTextField WeightInfo;
    private JTextField GenderInfo;
    private JTextField TypeInfo;
    private JTextField SizeInfo;
    private JTextField VaccinatedInfo;
    private JTextField SterilizedInfo;
    private JTextField InsuranceInfo;
    private JLabel BirthdayInfo2;
    private JLabel AgeInfo2;
    private JLabel WeightInfo2;
    private JLabel GenderInfo2;
    private JLabel TypeInfo2;
    private JLabel SizeInfo2;
    private JLabel VaccinatedInfo2;
    private JLabel SterilizedInfo2;
    private JLabel InsuranceInfo2;
    private JButton Submit;
    private JButton BackToHomePage;
    private JButton AddPicture;
    private BufferedImage picture;
    private int index;

    public NewPetPanel(JPanel contentpane, CardLayoutExample cle) {
        this.setLayout(null);
        Petinfo = new JLabel("Add New Pet Information");
        Petinfo.setBounds(10, 80, 1000, 20);
        this.add(Petinfo);
        Petinfo.setVisible(true);
        NameL = new JLabel("Name:");
        NameL.setBounds(10, 100, 100, 20);
        this.add(NameL);
        NameL.setVisible(true);
        BirthdayL = new JLabel("Birthday:");
        BirthdayL.setBounds(10, 120, 100, 20);
        this.add(BirthdayL);
        BirthdayL.setVisible(true);
        BirthdayTip = new JLabel("dd/mm/yyyy");
        BirthdayTip.setBounds(200, 120, 150, 20);
        this.add(BirthdayTip);
        BirthdayTip.setVisible(true);
        AgeL = new JLabel("Age:");
        AgeL.setBounds(10, 140, 100, 20);
        this.add(AgeL);
        AgeL.setVisible(true);
        GenderL = new JLabel("Gender:");
        GenderL.setBounds(10, 160, 100, 20);
        this.add(GenderL);
        GenderL.setVisible(true);
        JComboBox GenderJ = new JComboBox();
        GenderJ.addItem("male");
        GenderJ.addItem("female");
        GenderJ.setBounds(100, 160, 100, 20);
        this.add(GenderJ);
        GenderJ.setVisible(true);
        TypeL = new JLabel("Type:");
        TypeL.setBounds(10, 180, 100, 20);
        this.add(TypeL);
        TypeL.setVisible(true);
        JComboBox TypeJ = new JComboBox();
        TypeJ.addItem("cat");
        TypeJ.addItem("dog");
        TypeJ.setBounds(100,180,100,20);
        this.add(TypeJ);
        TypeJ.setVisible(true);
        SizeL = new JLabel("Size:");
        SizeL.setBounds(10, 200, 100, 20);
        this.add(SizeL);
        SizeL.setVisible(true);
        JRadioButton SButton = new JRadioButton("small");
        JRadioButton MButton = new JRadioButton("medium");
        JRadioButton LButton = new JRadioButton("large");
        ButtonGroup sizeButtons = new ButtonGroup();
        sizeButtons.add(SButton);
        sizeButtons.add(MButton);
        sizeButtons.add(LButton);
        this.add(SButton);
        this.add(MButton);
        this.add(LButton);
        SButton.setBounds(100,200,70,20);
        MButton.setBounds(170,200,100,20);
        LButton.setBounds(270,200,100,20);
        SButton.setVisible(true);
        MButton.setVisible(true);
        LButton.setVisible(true);
        WeightL = new JLabel("Weight:");
        WeightL.setBounds(10, 220, 100, 20);
        this.add(WeightL);
        WeightL.setVisible(true);
        WeightTip = new JLabel("Unit: kg");
        WeightTip.setBounds(200, 220, 100, 20);
        this.add(WeightTip);
        WeightTip.setVisible(true);
        VaccinatedL = new JLabel("Is he/she vaccinated?");
        VaccinatedL.setBounds(10, 240, 500, 20);
        this.add(VaccinatedL);
        VaccinatedL.setVisible(true);
        JComboBox VaccinatedJ = new JComboBox();
        VaccinatedJ.addItem("true");
        VaccinatedJ.addItem("false");
        VaccinatedJ.setBounds(200, 240, 100, 20);
        this.add(VaccinatedJ);
        VaccinatedJ.setVisible(true);
        SterilizedL = new JLabel("Is he/she sterilized?");
        SterilizedL.setBounds(10, 260, 500, 20);
        this.add(SterilizedL);
        SterilizedL.setVisible(true);
        JComboBox SterilizedJ = new JComboBox();
        SterilizedJ.addItem("true");
        SterilizedJ.addItem("false");
        SterilizedJ.setBounds(200,260,100,20);
        this.add(SterilizedJ);
        SterilizedJ.setVisible(true);
        InsuranceL = new JLabel("Does he/she has insurance?");
        InsuranceL.setBounds(10, 280, 500, 20);
        this.add(InsuranceL);
        InsuranceL.setVisible(true);
        JComboBox InsuranceJ = new JComboBox();
        InsuranceJ.addItem("true");
        InsuranceJ.addItem("false");
        InsuranceJ.setBounds(200,280,100,20);
        this.add(InsuranceJ);
        InsuranceJ.setVisible(true);
        PictureL = new JLabel();
        PictureL.setBounds(300,0,200,200);
        this.add(PictureL);
        PictureL.setVisible(true);
        NameInfo = new JTextField();
        NameInfo.setBounds(100, 100, 100, 20);
        this.add(NameInfo);
        NameInfo.setVisible(true);
        BirthdayInfo = new JTextField();
        BirthdayInfo.setBounds(100, 120, 100, 20);
        this.add(BirthdayInfo);
        BirthdayInfo.setVisible(true);
        AgeInfo = new JTextField();
        AgeInfo.setBounds(100, 140, 100, 20);
        this.add(AgeInfo);
        AgeInfo.setVisible(true);
        WeightInfo = new JTextField();
        WeightInfo.setBounds(100, 220, 100, 20);
        this.add(WeightInfo);
        WeightInfo.setVisible(true);
        AddPicture = new JButton("Add a picture");
        AddPicture.setBounds(10,300,200,20);
        this.add(AddPicture);
        AddPicture.setVisible(true);
        Submit = new JButton("Submit");
        Submit.setBounds(10, 320, 100, 20);
        this.add(Submit);
        Submit.setVisible(true);
        BackToHomePage = new JButton("Back to Home Page");
        BackToHomePage.setBounds(10, 340, 200, 20);
        this.add(BackToHomePage);
        BackToHomePage.setVisible(true);
        AddPicture.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(getParent());
                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File file = fileChooser.getSelectedFile();
                        picture = ImageIO.read(file);
                        picture = resizeImage(picture, 200,200);
                        PictureL.setIcon(new ImageIcon(picture));
                        add(PictureL);
                        cle.getPetpic().add(PictureL);
                        cle.test_pic = picture;
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                        JOptionPane.showMessageDialog(null,"Error");
                    }
                }
            }
            BufferedImage resizeImage (BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
                Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
                BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
                outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
                return outputImage;
            }
        });
        BackToHomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "homepage");
            }
        });
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean hasError = false;;
                String gender = String.valueOf(GenderJ.getSelectedItem());
                Gender g = Gender.FEMALE;
                if (gender.equals("")) {
                    hasError = true;
                    JOptionPane.showMessageDialog(null,"Your input is empty.");
                } else {
                    if (gender.equals("female")) {
                        g = Gender.FEMALE;
                    } else if (gender.equals("male")) {
                        g = Gender.MALE;
                    } else{
                        hasError = true;
                        JOptionPane.showMessageDialog(null,"Incorrect input format.");
                    }
                }
                String type = String.valueOf(TypeJ.getSelectedItem());
                Type t = Type.CAT;
                if (hasError==false) {
                    if (type.equals("")) {
                        hasError=true;
                        JOptionPane.showMessageDialog(null,"Your input is empty.");
                    } else {
                        if (type.equals("cat")) {
                            t = Type.CAT;
                        } else if (type.equals("dog")) {
                            t = Type.DOG;
                        } else {
                            hasError = true;
                            JOptionPane.showMessageDialog(null,"Incorrect input format.");
                        }
                    }
                }
                Size s = Size.SMALL;
                if (hasError==false) {
                    if (SButton.isSelected()) {
                        s = Size.SMALL;
                    } else if (MButton.isSelected()) {
                            s = Size.MEDIUM;
                    } else if(LButton.isSelected()) {
                            s = Size.LARGE;
                    } else {
                        hasError=true;
                        JOptionPane.showMessageDialog(null,"Your input is empty.");
                    }
                }
                String weight = WeightInfo.getText();
                Double w = Double.valueOf(0);
                if (hasError==false) {
                    if (weight.equals("")) {
                        hasError=true;
                        JOptionPane.showMessageDialog(null,"Your input is empty.");
                    } else {
                        try {
                            Double.parseDouble(weight);
                            w = Double.valueOf(weight);
                        } catch (NumberFormatException e1) {
                            JOptionPane.showMessageDialog(null,"Incorrect input format.");
                        }
                    }
                }
                String vaccinatedS = String.valueOf(VaccinatedJ.getSelectedItem());
                Boolean vaccinated = Boolean.valueOf(true);
                if (hasError==false) {
                    if (vaccinatedS.equals("")) {
                        hasError=true;
                        JOptionPane.showMessageDialog(null,"Your input is empty.");
                    } else {
                        if (vaccinatedS.equals("true")) {
                            vaccinated = Boolean.valueOf(vaccinatedS);
                        } else if (vaccinatedS.equals("false")) {
                            vaccinated = Boolean.valueOf(vaccinatedS);
                        } else {
                            JOptionPane.showMessageDialog(null,"Incorrect input format.");
                        }
                    }
                }
                String sterilizedS = String.valueOf(SterilizedJ.getSelectedItem());
                Boolean sterilized = Boolean.valueOf(true);
                if (hasError==false) {
                    if (sterilizedS.equals("")) {
                        hasError=true;
                        JOptionPane.showMessageDialog(null,"Your input is empty.");
                    } else {
                        if (sterilizedS.equals("true")){
                            sterilized = Boolean.valueOf(sterilizedS);
                        } else if (sterilizedS.equals("false")) {
                            sterilized = Boolean.valueOf(sterilizedS);
                        } else {
                            JOptionPane.showMessageDialog(null,"Incorrect input format.");
                        }
                    }
                }
                String insuranceS = String.valueOf(InsuranceJ.getSelectedItem());
                Boolean insurance = Boolean.valueOf(true);

                if (hasError==false) {
                    if (insuranceS.equals("")) {
                        hasError=true;
                        JOptionPane.showMessageDialog(null,"Your input is empty.");
                    } else {
                        if (insuranceS.equals("true")) {
                            insurance = Boolean.valueOf(insuranceS);
                        } else if (insuranceS.equals("false")) {
                            insurance = Boolean.valueOf(insuranceS);
                        } else {
                            JOptionPane.showMessageDialog(null,"Incorrect input format.");
                        }
                    }
                }
                if (!hasError) {
                    cle.addpet(NameInfo.getText(), BirthdayInfo.getText(), g, t, s, w, vaccinated, sterilized, insurance, cle.getOwner().getUsername(), picture);
                    if (picture == null) {
                        System.out.println("no picture");
                    } else {
                        try {
                            index=cle.getM().size()-1;
                            ImageIO.write(picture, "jpg", new File("./src/Petpic/"+ index +".jpg"));
                            System.out.println("456");
                        } catch (Exception f) {
                            System.out.println("Image Save Error");
                        }
                    }
                    JFrame frame = new JFrame("CheckInfo");
                    frame.setSize(500,500);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    NameL2 = new JLabel("Name:");
                    NameL2.setBounds(10, 100, 100, 20);
                    frame.add(NameL2);
                    NameL2.setVisible(true);
                    BirthdayL2 = new JLabel("Birthday:");
                    BirthdayL2.setBounds(10, 120, 100, 20);
                    frame.add(BirthdayL2);
                    BirthdayL2.setVisible(true);
                    AgeL2 = new JLabel("Age:");
                    AgeL2.setBounds(10, 140, 100, 20);
                    frame.add(AgeL2);
                    AgeL2.setVisible(true);
                    GenderL2 = new JLabel("Gender:");
                    GenderL2.setBounds(10, 160, 100, 20);
                    frame.add(GenderL2);
                    GenderL2.setVisible(true);
                    TypeL2 = new JLabel("Type:");
                    TypeL2.setBounds(10, 180, 100, 20);
                    frame.add(TypeL2);
                    TypeL2.setVisible(true);
                    SizeL2 = new JLabel("Size:");
                    SizeL2.setBounds(10, 200, 100, 20);
                    frame.add(SizeL2);
                    SizeL2.setVisible(true);
                    WeightL2 = new JLabel("Weight:");
                    WeightL2.setBounds(10, 220, 100, 20);
                    frame.add(WeightL2);
                    WeightL2.setVisible(true);
                    VaccinatedL2 = new JLabel("Is he/she vaccinated?");
                    VaccinatedL2.setBounds(10, 240, 500, 20);
                    frame.add(VaccinatedL2);
                    VaccinatedL2.setVisible(true);
                    SterilizedL2 = new JLabel("Is he/she sterilized?");
                    SterilizedL2.setBounds(10, 260, 500, 20);
                    frame.add(SterilizedL2);
                    SterilizedL2.setVisible(true);
                    InsuranceL2 = new JLabel("Does he/she has insurance?");
                    InsuranceL2.setBounds(10, 280, 500, 20);
                    frame.add(InsuranceL2);
                    InsuranceL2.setVisible(true);
                    NameInfo2 = new JLabel(String.valueOf(NameInfo));
                    NameInfo2.setBounds(100, 100, 100, 20);
                    frame.add(NameInfo2);
                    NameInfo2.setVisible(true);
                    BirthdayInfo2 = new JLabel(String.valueOf(BirthdayInfo));
                    BirthdayInfo2.setBounds(100, 120, 100, 20);
                    frame.add(BirthdayInfo2);
                    BirthdayInfo.setVisible(true);
                    AgeInfo2 = new JLabel(String.valueOf(AgeInfo));
                    AgeInfo2.setBounds(100, 140, 100, 20);
                    frame.add(AgeInfo2);
                    AgeInfo2.setVisible(true);
                    GenderInfo2 = new JLabel(String.valueOf(GenderInfo));
                    GenderInfo2.setBounds(100, 160, 100, 20);
                    frame.add(GenderInfo2);
                    GenderInfo2.setVisible(true);
                    TypeInfo2 = new JLabel(String.valueOf(TypeInfo));
                    TypeInfo2.setBounds(100, 180, 100, 20);
                    frame.add(TypeInfo2);
                    TypeInfo2.setVisible(true);
                    SizeInfo2 = new JLabel(String.valueOf(SizeInfo));
                    SizeInfo2.setBounds(100, 200, 100, 20);
                    frame.add(SizeInfo2);
                    SizeInfo2.setVisible(true);
                    WeightInfo2 = new JLabel(String.valueOf(WeightInfo));
                    WeightInfo2.setBounds(100, 220, 100, 20);
                    frame.add(WeightInfo2);
                    WeightInfo2.setVisible(true);
                    VaccinatedInfo2 = new JLabel(String.valueOf(VaccinatedInfo));
                    VaccinatedInfo2.setBounds(200, 240, 500, 20);
                    frame.add(VaccinatedInfo2);
                    VaccinatedInfo2.setVisible(true);
                    SterilizedInfo2 = new JLabel(String.valueOf(SterilizedInfo));
                    SterilizedInfo2.setBounds(200, 260, 500, 20);
                    frame.add(SterilizedInfo2);
                    SterilizedInfo2.setVisible(true);
                    InsuranceInfo2 = new JLabel(String.valueOf(InsuranceInfo));
                    InsuranceInfo2.setBounds(200, 280, 500, 20);
                    frame.add(InsuranceInfo2);
                    InsuranceInfo2.setVisible(true);
                    CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                    cardLayout.show(contentpane, "homepage");
                }
            }
        });
    }
    @Override
    public Dimension getPreferredSize(){
        return (new Dimension(500,500));
    }
}