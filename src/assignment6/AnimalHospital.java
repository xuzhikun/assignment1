import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xuzhi on 10/28/2016.
 */
public class AnimalHospital {
    private ArrayList<Pet> list = new ArrayList<>();

    public void printPetInfoByName(String name) {
        for (Pet p : list) {
            if (p.getPetName().equals(name))
                System.out.println(p.toString());
        }
    }

    public void printPetInfoByOwner(String name) {
        for (Pet p : list) {
            if (p.getOwnerName().equals(name))
                System.out.println(p.toString());
        }
    }

    public void printPetsBoarding(int month, int day, int year) {
        for (Pet p : list) {
            if (p instanceof Cat) {
                Cat c = (Cat)p;
                if (c.boarding(month, day, year))
                    System.out.println(p.toString());
            }

            else if (p instanceof Dog) {
                Dog d = (Dog)p;
                if (d.boarding(month, day, year))
                    System.out.println(p.toString());
            }

        }
    }
}
