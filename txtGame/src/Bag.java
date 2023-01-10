import java.util.ArrayList;

public class Bag {
    ArrayList <String> bag = new ArrayList();

    public void przeglądEkwipunku(){
        for (int i = 0; i < bag.size(); i++) {
            System.out.println(bag);
        }
    }


}
