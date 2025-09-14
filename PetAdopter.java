import java.util.ArrayList;

public class PetAdopter extends User{
    private ArrayList<Pet_info>  wishlist;
    public PetAdopter (String username, String password) {
        super(username, password);
        wishlist=new ArrayList<>();
    }
    public void addWishList (Pet_info pet) {
        wishlist.add(pet);
    }
    public void deletePet (Pet_info pet) {
        wishlist.remove(pet);
    }
    public void deletePet (int i) {
        wishlist.remove(i);
    }
    public String getPetName (int i) {
        return wishlist.get(i).getName();
    }
    public String getPetBirthday (int i) {
        return wishlist.get(i).getBirthday();
    }
    public void getPetGender (int i, Gender g) {
        wishlist.get(i).setGender(g);
    }
    public void getPetType (int i, Type t) {
        wishlist.get(i).setType(t);
    }
    public void getPetSize (int i, Size s) {
        wishlist.get(i).setSize(s);
    }
    public void getPetVaccinated (int i, boolean vaccinated) {
        wishlist.get(i).setVaccinated(vaccinated);
    }
    public void updatePetSterilized(int i, boolean sterilized) {
        wishlist.get(i).setSterilized(sterilized);
    }
    public void updatePetInsurance (int i, boolean insurance) {
        wishlist.get(i).setInsurance(insurance);
    }
}
