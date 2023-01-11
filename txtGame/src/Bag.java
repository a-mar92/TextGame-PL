import java.util.ArrayList;

public class Bag {
    ArrayList <String> bag = new ArrayList();

    public void przeglądEkwipunku(){
        System.out.println("Masz w plecaku " + bag.size() + " przedmiotów");
        for (int i = 0; i < bag.size(); i++) {
            System.out.println(bag);
        }
    }


}
