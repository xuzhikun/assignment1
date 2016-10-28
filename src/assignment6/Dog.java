import java.util.Date;

/**
 * Created by xuzhi on 10/28/2016.
 */
public class Dog extends Pet implements Boardable {
    private String size;
    private Date start;
    private Date end;

    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "DOG: \n" + super.getPetName() + " owned by " +
                super.getOwnerName() + "\n" + "Color:" + super.getColor() + "\n" +
                "Sex: " + super.getSex() + "\n" +
                "Size:" + size;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.start = new Date(year - 1900, month - 1, day);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {        this.start = new Date(year - 1900, month - 1, day);
        this.end = new Date(year - 1900, month - 1, day);

    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Date date = new Date(year - 1900, month - 1, day);
        return date.after(this.start) && date.before(this.end);
    }
}
