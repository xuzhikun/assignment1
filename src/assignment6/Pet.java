import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by xuzhi on 10/28/2016.
 */
public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    protected Integer sex;

    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int SPAYED = 2;
    public static final int NEUTERED = 3;

    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPetName() {

        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        if (sex == 0) return "MALE";
        if (sex == 1) return "FEMALE";
        if (sex == 2) return "SPAYED";
        if (sex == 3) return "NEUTERED";
        return null;
    }

    @Override
    public String toString() {
        return   petName + "owned by" + ownerName + "\n"
                +"Color:" + color + "\n" +
                "Sex:" + getSex();
    }
}
