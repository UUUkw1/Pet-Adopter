import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.YES_OPTION;

public class DisplayPanel extends JPanel {
    private JLabel Petinfo;
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
    private JLabel AdoptedL;
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
    private JLabel AdoptedInfo;
    private JLabel AddToLikeList;
    private JButton Next;
    private JButton Back;
    private JButton BackToHomePage;
    private JButton AddPicture;
    private JButton LikeButton;
    private JButton RemoveLikeButton;
    private JButton Adopt;
    private int currentPetNo;
    private String filename;
    private String name;
    private String birthday;
    private String age;
    private String gender;
    private String type;
    private String size;
    private String weight;
    private String vaccinated;
    private String sterilized;
    private String insurance;
    private String adopted;
    private String owner;
    private String ownerName;
    private int index;
    private List<List<String>> ChangeAdoptStatus = new ArrayList<>();

    public DisplayPanel(JPanel contentpane, CardLayoutExample cle) {
        currentPetNo = 0;
        this.setLayout(null);
        Petinfo = new JLabel("Pet Information");
        Petinfo.setBounds(10, 80, 100, 20);
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
        AdoptedL = new JLabel("Is he/she adopted?");
        AdoptedL.setBounds(10, 300, 500, 20);
        this.add(AdoptedL);
        AdoptedL.setVisible(true);
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
        Next.setBounds(10, 320, 100, 20);
        this.add(Next);
        Next.setVisible(true);
        Back = new JButton("Back");
        Back.setBounds(120, 320, 100, 20);
        this.add(Back);
        Back.setVisible(true);
        LikeButton = new JButton("Add to my like list");
        LikeButton.setBounds(10, 340, 200, 20);
        this.add(LikeButton);
        LikeButton.setVisible(true);
        RemoveLikeButton = new JButton("Remove from my like list");
        RemoveLikeButton.setBounds(10, 360, 200, 20);
        this.add(RemoveLikeButton);
        RemoveLikeButton.setVisible(true);
        BackToHomePage = new JButton("Back to Home Page");
        BackToHomePage.setBounds(10, 380, 200, 20);
        this.add(BackToHomePage);
        BackToHomePage.setVisible(true);
        Adopt = new JButton("Adopt");
        Adopt.setBounds(250, 100, 100, 20);
        this.add(Adopt);
        Adopt.setVisible(true);
        NameInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getName()));
        NameInfo.setBounds(100, 100, 100, 20);
        this.add(NameInfo);
        NameInfo.setVisible(true);
        BirthdayInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getBirthday()));
        BirthdayInfo.setBounds(100, 120, 100, 20);
        this.add(BirthdayInfo);
        BirthdayInfo.setVisible(true);
        AgeInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getAge()));
        AgeInfo.setBounds(100, 140, 100, 20);
        this.add(AgeInfo);
        AgeInfo.setVisible(true);
        GenderInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getGender()));
        GenderInfo.setBounds(100, 160, 100, 20);
        this.add(GenderInfo);
        GenderInfo.setVisible(true);
        TypeInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getType()));
        TypeInfo.setBounds(100, 180, 100, 20);
        this.add(TypeInfo);
        TypeInfo.setVisible(true);
        SizeInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getSize()));
        SizeInfo.setBounds(100, 200, 100, 20);
        this.add(SizeInfo);
        SizeInfo.setVisible(true);
        WeightInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").getWeight()));
        WeightInfo.setBounds(100, 220, 100, 20);
        this.add(WeightInfo);
        WeightInfo.setVisible(true);
        VaccinatedInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").isVaccinated()));
        VaccinatedInfo.setBounds(200, 240, 500, 20);
        this.add(VaccinatedInfo);
        VaccinatedInfo.setVisible(true);
        SterilizedInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").isSterilized()));
        SterilizedInfo.setBounds(200, 260, 500, 20);
        this.add(SterilizedInfo);
        SterilizedInfo.setVisible(true);
        InsuranceInfo = new JLabel(String.valueOf(cle.getPetList().get("temp").isInsurance()));
        InsuranceInfo.setBounds(200, 280, 500, 20);
        this.add(InsuranceInfo);
        InsuranceInfo.setVisible(true);
        AdoptedInfo = new JLabel("false");
        AdoptedInfo.setBounds(200, 300, 500, 20);
        this.add(AdoptedInfo);
        AdoptedInfo.setVisible(true);
        AddToLikeList = new JLabel("It is added to like list.");
        AddToLikeList.setBounds(250, 340, 200, 20);
        this.add(AddToLikeList);
        AddToLikeList.setVisible(false);

        BackToHomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                cardLayout.show(contentpane, "homepage");
            }
        });
        LikeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                if (cle.likeNameList.contains(NameInfo.getText())==false) {
                    cle.likeNameList.add(NameInfo.getText());
                }
                AddToLikeList.setVisible(true);
            }
        });
        RemoveLikeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                if (cle.likeNameList.contains(NameInfo.getText())==false) {
                    JOptionPane.showMessageDialog(null,"It is not in the like list.");
                }
                cle.likeNameList.remove(NameInfo.getText());
                AddToLikeList.setVisible(false);
            }
        });
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                List pnl = cle.getPetNameList();
                currentPetNo+=1;
                if (currentPetNo<cle.getPetList().size()) {
                    NameInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getName()));
                    BirthdayInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getBirthday()));
                    AgeInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getAge()));
                    GenderInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getGender()));
                    TypeInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getType()));
                    SizeInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getSize()));
                    WeightInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getWeight()));
                    VaccinatedInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).isVaccinated()));
                    SterilizedInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).isSterilized()));
                    InsuranceInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).isInsurance()));
                    AdoptedInfo.setText("false");
                    if ((cle.getPetList().get(pnl.get(currentPetNo)).getPicture())!=null) {
                        picLabel.setIcon(new ImageIcon(cle.getPetList().get(pnl.get(currentPetNo)).getPicture()));
                    }
                    if (cle.likeNameList.contains(NameInfo.getText())==true) {
                        AddToLikeList.setVisible(true);
                    }else{
                        AddToLikeList.setVisible(false);
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
                List pnl = cle.getPetNameList();
                if (currentPetNo>=0) {
                    NameInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getName()));
                    BirthdayInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getBirthday()));
                    AgeInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getAge()));
                    GenderInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getGender()));
                    TypeInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getType()));
                    SizeInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getSize()));
                    WeightInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).getWeight()));
                    VaccinatedInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).isVaccinated()));
                    SterilizedInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).isSterilized()));
                    InsuranceInfo.setText(String.valueOf(cle.getPetList().get(pnl.get(currentPetNo)).isInsurance()));
                    AdoptedInfo.setText("false");
                    if ((cle.getPetList().get(pnl.get(currentPetNo)).getPicture())!=null) {
                        picLabel.setIcon(new ImageIcon(cle.getPetList().get(pnl.get(currentPetNo)).getPicture()));
                    }
                    if (cle.likeNameList.contains(NameInfo.getText())==true) {
                        AddToLikeList.setVisible(true);
                    }else{
                        AddToLikeList.setVisible(false);
                    }
                } else {
                    currentPetNo+=1;
                }
            }
        });
        Adopt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentpane.getLayout();
                int n=JOptionPane.showConfirmDialog(null,"Do you really want to adopt the pet?", "Confirmation of adopting",  JOptionPane.YES_NO_OPTION);
                if (n==YES_OPTION) {
                    AdoptedInfo.setText("true");
                    filename="src/pet.txt";
                    String line;
                    index=0;
                    try {
                        FileReader fd = new FileReader(filename);
                        BufferedReader br = new BufferedReader(fd);
                        while ((line = br.readLine())!=null) {
                            name = line;
                            line = br.readLine();
                            birthday = line;
                            line = br.readLine();
                            gender = line;
                            line = br.readLine();
                            type = line;
                            line = br.readLine();
                            size = line;
                            line = br.readLine();
                            weight = line;
                            line = br.readLine();
                            vaccinated = line;
                            line = br.readLine();
                            sterilized = line;
                            line = br.readLine();
                            insurance = line;
                            line = br.readLine();
                            ownerName = line;
                            File file=new File("./src/Petpic/"+ index +".jpg");
                            index+=1;
                            BufferedImage picture = ImageIO.read(file);
                            adopted = "true";
                            List<String> AdoptPetInfo = new ArrayList<>();
                            AdoptPetInfo.add(name);
                            AdoptPetInfo.add(birthday);
                            AdoptPetInfo.add(gender);
                            AdoptPetInfo.add(type);
                            AdoptPetInfo.add(size);
                            AdoptPetInfo.add(weight);
                            AdoptPetInfo.add(vaccinated);
                            AdoptPetInfo.add(sterilized);
                            AdoptPetInfo.add(insurance);
                            AdoptPetInfo.add(ownerName);
                            AdoptPetInfo.add(adopted);
                            ChangeAdoptStatus.add(AdoptPetInfo);
                        }
                        br.close();
                    } catch (IOException e2) {
                        System.out.println("File does not exit");
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        System.out.println("System error");
                    }
                    filename="src/pet.txt";
                    try {
                        FileWriter fw = new FileWriter(filename, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.append(name+"\n");
                        bw.append(birthday+"\n");
                        bw.append(gender+"\n");
                        bw.append(type+"\n");
                        bw.append(size+"\n");
                        bw.append(weight+"\n");
                        bw.append(vaccinated+"\n");
                        bw.append(sterilized+"\n");
                        bw.append(insurance+"\n");
                        bw.append(ownerName+"\n");
                        bw.append(adopted+"\n");
                        bw.close();
                    } catch (IOException e3) {
                        System.out.println("File not found");
                    }
                }
            }
        });
    }
    @Override
    public Dimension getPreferredSize(){
        return (new Dimension(500,500));
    }

    public void changePic(JLabel pic) {
        System.out.println("123");
        picLabel.setVisible(false);
        pic.setBounds(240,100,250,250);
        this.add(pic);
        pic.setVisible(true);
        System.out.println(pic.getText());
    }
}
