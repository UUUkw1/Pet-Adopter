import java.awt.image.BufferedImage;
import java.time.LocalDate;

enum Gender {MALE, FEMALE}
enum Size {LARGE, MEDIUM, SMALL}
enum Type {CAT, DOG}

public class Pet_info {
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
    private BufferedImage picture;
    private boolean adopted;
    private String ownerName;
    public Pet_info(String name, String birthday, Gender g, Type t, Size s,  boolean vaccinated, boolean sterilized, String ownerName, BufferedImage picture, boolean adopted) {
        this.name=name;
        this.birthday=birthday;
        this.g=g;
        this.t=t;
        this.s=s;
        this.vaccinated=vaccinated;
        this.sterilized=sterilized;
        this.ownerName=ownerName;
        this.weight=0.0;
        this.insurance=false;
        this.picture=picture;
        this.adopted=false;
        updateAge();
    }

    public Pet_info(String name, String birthday, Gender g, Type t, Size s, double weight, boolean vaccinated, boolean sterilized, boolean insurance, String ownerName, BufferedImage picture, boolean adopted) {
        this.name=name;
        this.birthday=birthday;
        this.g=g;
        this.t=t;
        this.s=s;
        this.weight=weight;
        this.vaccinated=vaccinated;
        this.sterilized=sterilized;
        this.insurance=insurance;
        this.ownerName=ownerName;
        this.picture=picture;
        this.adopted=false;
        updateAge();
    }

    private void updateAge () {
        LocalDate d=LocalDate.now();
        d.getYear();
        d.getMonthValue();
        d.getDayOfMonth();
        if (d.getYear()>Integer.parseInt(getBirthYear())) {
            if (d.getMonthValue()>Integer.parseInt(getBirthMonth())) {
                age=d.getYear()-Integer.parseInt(getBirthYear());
            } else if (d.getMonthValue()==Integer.parseInt(getBirthMonth())) {
                if (d.getDayOfMonth()>=Integer.parseInt(getBirthDate())) {
                    age=d.getYear()-Integer.parseInt(getBirthYear());
                }else {
                    age=d.getYear()-Integer.parseInt(getBirthYear())-1;
                }
            }else {
                age=d.getYear()-Integer.parseInt(getBirthYear())-1;
            }
        }
    }

    public String getBirthDate() {
        return birthday.substring(0,2);
    }
    public void setBirthDate(String Date) {
        birthday=Date+birthday.substring(2);
        updateAge();
    }
    public String getBirthMonth() {
        return birthday.substring(3,5);
    }
    public void setBirthMonth(String Month) {
        birthday=birthday.substring(0,3)+Month+birthday.substring(5);
        updateAge();
    }
    public String getBirthYear() {
        return birthday.substring(6);
    }
    public void setBirthYear(String Year) {
        birthday=birthday.substring(0,6)+Year;
        updateAge();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Gender getGender() {
        return g;
    }
    public void setGender(Gender g) {
        this.g = g;
    }
    public Type getType() {
        return t;
    }
    public void setType(Type t) {
        this.t = t;
    }
    public Size getSize() {
        return s;
    }
    public void setSize(Size s) {
        this.s = s;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isVaccinated() {
        return vaccinated;
    }
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    public boolean isSterilized() {
        return sterilized;
    }
    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }
    public boolean isInsurance() {
        return insurance;
    }
    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }
    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }
}
