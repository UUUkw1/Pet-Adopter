import java.util.ArrayList;

public class PetGiver extends User{
    private ArrayList<Pet_info> petlist;
    public PetGiver (String username, String password) {
        super(username, password);
        petlist=new ArrayList<>();
    }
    public void addPet (Pet_info pet) {
        petlist.add(pet);
    }
    public void deletePet (Pet_info pet) {
        petlist.remove(pet);
    }
    public void deletePet (int i) {
        petlist.remove(i);
    }
    public void updatePetName (int i, String name) {
        petlist.get(i).setName(name);
    }
    public void updatePetBirthday (int i, String birthday) {
        petlist.get(i).setBirthday(birthday);
    }
    public void updatePetGender (int i, Gender g) {
        petlist.get(i).setGender(g);
    }
    public void updatePetType (int i, Type t) {
        petlist.get(i).setType(t);
    }
    public void updatePetSize (int i, Size s) {
        petlist.get(i).setSize(s);
    }
    public void updatePetVaccinated (int i, boolean vaccinated) {
        petlist.get(i).setVaccinated(vaccinated);
    }
    public void updatePetSterilized(int i, boolean sterilized) {
        petlist.get(i).setSterilized(sterilized);
    }
    public void updatePetInsurance (int i, boolean insurance) {
        petlist.get(i).setInsurance(insurance);
    }
    public Pet_info getPet(int i) {
        return petlist.get(i);
    }
}
