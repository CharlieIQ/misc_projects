import java.util.ArrayList;
public class Kennel {
    private ArrayList<Dog> dogsInKennel;
    private String kennelName;
    private int dogsCheckedIn;

    public Kennel(String kennelName){
        this.kennelName = kennelName;
        dogsCheckedIn = 0;
        dogsInKennel = new ArrayList<>();
    }

    public void checkIn(Dog dog){
        dogsInKennel.add(dog);
        dogsCheckedIn++;
    }

}
