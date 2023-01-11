public class Kuchnia extends Starter {
    int kuchniaWspomnienie;
    int kuchniaWybor;

public void starterKuchnia(){
    for (int i = 0; i < TEXT.opisKuchnia.length; i++) {

        zwolnijTekst(TEXT.opisKuchnia[i], "", 0);
    }
    System.out.println(">");

    kuchniaWybor = scanner.nextInt();
switch (kuchniaWybor){
    case 1:
        zrobKawe();
break;



}


}
public void zrobKawe(){
    if (bag.isEmpty()){
        System.out.println("masz pusty plecak ! Zeby zrobić kawę potrzebny jest kubek ");
    }
else {
    for (int i = 0; i < bag.size(); i++) {
      if (bag.get(i).toUpperCase().equals(kubek)){
          bag.remove(i);
          System.out.println("Robię kawe ");
      }
    }

}


}}
