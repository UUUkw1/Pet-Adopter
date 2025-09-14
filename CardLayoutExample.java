import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardLayoutExample {
    private JPanel contentPane;
    private LoginPanel login;
    private DisplayPanel display;
    private NewPetPanel newpet;
    private HomePagePanel homepage;
    private RegisterPanel register;
    private LikeListPanel likelist;
    private User user;
    private List<String> nameList;
    private List<String> passwordList;
    private String filename;
    private Pet_info pet;
    private String name;
    private String birthday;
    private int age;
    private Gender g;
    private Type t;
    private Size s;
    private double weight;
    private boolean vaccinated;
    private boolean sterilized;
    private boolean insurance;
    private boolean adopted;
    private PetGiver owner;
    private String ownerName;
    private BufferedImage picture;
    Map<String, Pet_info> m =new HashMap<>();
    List<String> petNameList = new ArrayList<>();
    List<String> likeNameList = new ArrayList<>();
    private List<JLabel> pet_pic;
    private int index;

    public BufferedImage test_pic;

    public CardLayoutExample() {
        String line;
        nameList = new ArrayList<>();
        passwordList = new ArrayList<>();
        filename="src/login.txt";
        try {
            FileReader fd = new FileReader(filename);
            BufferedReader br = new BufferedReader(fd);
            while ((line = br.readLine()) != null) {
                nameList.add(line);
                line=br.readLine();
                passwordList.add(line);
            }
            br.close();
        }catch (IOException e) {
            System.out.println("File does not exit");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("System error");
        }

        pet_pic = new ArrayList<>();
        likeNameList.add("temp"); // this is not good. should be corrected later
        filename="src/pet.txt";
        index=0;
        try {
            FileReader fd = new FileReader(filename);
            BufferedReader br = new BufferedReader(fd);
            while ((line = br.readLine())!=null) {
                name = line;
                line = br.readLine();
                birthday = line;
                line = br.readLine();
                Gender g;
                if (line.equals("FEMALE")) {
                    g = Gender.FEMALE;
                } else {
                    g = Gender.MALE;
                }
                line = br.readLine();
                Type t;
                if (line.equals("CAT")) {
                    t = Type.CAT;
                } else {
                    t = Type.DOG;
                }
                line = br.readLine();
                Size s;
                if (line.equals("small")) {
                    s = Size.SMALL;
                } else if(line.equals("medium")) {
                    s = Size.MEDIUM;
                } else {
                    s = Size.LARGE;
                }
                line = br.readLine();
                Double weight = Double.valueOf(line);
                line = br.readLine();
                Boolean vaccinated = Boolean.valueOf(line);
                line = br.readLine();
                Boolean sterilized = Boolean.valueOf(line);
                line = br.readLine();
                Boolean insurance = Boolean.valueOf(line);
                line = br.readLine();
                ownerName = line;
                File file=new File("./src/Petpic/"+ index +".jpg");
                index+=1;
                BufferedImage picture = ImageIO.read(file);
                Boolean adopted = Boolean.valueOf(line);
                line = br.readLine();
                Pet_info p = new Pet_info(name, birthday, g, t, s, weight, vaccinated, sterilized, insurance, ownerName, picture, adopted);
                m.put(name, p);
                petNameList.add(name);
            }
            br.close();
        }catch (IOException e) {
            System.out.println("File does not exit");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("System error");
        }

        // load image


    }

    public Map<String, Pet_info> getM() {
        return m;
    }

    private void displayGUI() {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(
                BorderFactory.createEmptyBorder(5,5,5,5));
        contentPane.setLayout(new CardLayout());

        login = new LoginPanel(contentPane, this);
        display = new DisplayPanel(contentPane, this);
        newpet = new NewPetPanel(contentPane, this);
        homepage = new HomePagePanel(contentPane);
        register= new RegisterPanel(contentPane, this);
        likelist= new LikeListPanel(contentPane,this);

        contentPane.add(login, "login");
        contentPane.add(display,"display");
        contentPane.add(newpet,"newpet");
        contentPane.add(homepage,"homepage");
        contentPane.add(register, "register");
        contentPane.add(likelist,"likelist");

        frame.getContentPane().add(contentPane, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public void loginUser (String username, String password){
        owner = new PetGiver (username, password);
        System.out.println("Login successfully.");
    }

    public boolean hasUser (String username, String password) {
        for (int i=0; i<nameList.size(); i++) {
            if (nameList.get(i).equals(username)) {
                return passwordList.get(i).equals(password);
            }
        }
        return false;
    }

    public boolean addUser(String username, String password) {
        for (int i=0; i<nameList.size(); i++) {
            if (nameList.get(i).equals(username)) {
                System.out.println("Username already exits");
                return false;
            }
        }
        try {
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(username+"\n");
            bw.append(password+"\n");
            bw.close();
            System.out.println("User added successfully");
            nameList.add(username);
            passwordList.add(password);
            return true;
        } catch (IOException e) {
            System.out.println("File not found");
            return false;
        }
    }

    public void newpet (String name, String birthday, Gender g, Type t, Size s, double weight, boolean vaccinated, boolean sterilized, boolean insurance, String ownerName, BufferedImage picture, boolean adopted){
        pet= new Pet_info (name, birthday, g, t, s, weight, vaccinated, sterilized, insurance, ownerName, picture,adopted);
        System.out.println("Pet added successfully.");
    }

    public boolean addpet(String name, String birthday, Gender g, Type t, Size s, double weight, boolean vaccinated, boolean sterilized, boolean insurance, String ownerName, BufferedImage picture) {
        filename="src/pet.txt";
        try {
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(name+"\n");
            bw.append(birthday+"\n");
            bw.append(g+"\n");
            bw.append(t+"\n");
            bw.append(s+"\n");
            bw.append(weight+"\n");
            bw.append(vaccinated+"\n");
            bw.append(sterilized+"\n");
            bw.append(insurance+"\n");
            bw.append(owner.getUsername()+"\n");
            bw.close();
            System.out.println("Pet added successfully");

            Pet_info p = new Pet_info(name, birthday, g, t, s,  weight, vaccinated, sterilized, insurance, ownerName, picture, adopted);
            if (p.getPicture() == null) {
                System.out.println("no picture 2");
            }
            m.put(name, p);
            petNameList.add(name);

            return true;
        } catch (IOException e) {
            System.out.println("File not found");
            return false;
        }
    }

    public PetGiver getOwner() {
        return owner;
    }

    public Map<String, Pet_info> getPetList() {
        return m;
    }

    public List<JLabel> getPetpic() {return pet_pic;}

    public List<String> getPetNameList() {return petNameList;}

    public static void main (String... args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardLayoutExample().displayGUI();
            }
        });
    }
}
