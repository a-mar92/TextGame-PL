import java.lang.reflect.Array;
import java.util.Arrays;

public class Kuchnia extends Starter {
    int kuchniaWspomnienie;
    int kuchniaWybor;

    public void starterKuchnia() {
        for (int i = 0; i < TEXT.opisKuchnia.length; i++) {

            zwolnijTekst(TEXT.opisKuchnia[i], "", 0);
        }
        for (int i = 0; i < TEXT.menuKuchnia.length; i++) {
            zwolnijTekst(TEXT.menuKuchnia[i], "", 0);
        }
        System.out.println(">");

        kuchniaWybor = scanner.nextInt();
        menuKuchnia();}





    public void menuKuchnia() {


        switch (kuchniaWybor) {
            case 1:
                zrobKawe();
                break;
            case 2:
                if (!bag.contains("KLUCZ")) {
                    System.out.println(" Zeby Otworzyć szafkę potrzebny jest KLUCZ ");}
                else {
                    System.out.println("Znalezłem yubi KEY, teraz mogę odblokować laptop - automatycznie dodano do ekwipunku");
                    Starter.bag.add("YubiKey");
                }
                    for (int i = 0; i < TEXT.menuKuchnia.length; i++) {
                        zwolnijTekst(TEXT.menuKuchnia[i], "", 0);}
                    System.out.println(">");
                    kuchniaWybor = scanner.nextInt();
                    menuKuchnia();
                break;
            case 3:
                Salon pomieszczenie = new Salon();
                pomieszczenie.opisSalon();
                break;
            case 4:
                Łazienka łazienka = new Łazienka();
                łazienka.lazienka();
                break;
            case 5:
                uzycieEkwipunku();
                for (int i = 0; i < TEXT.menuKuchnia.length; i++) {
                    zwolnijTekst(TEXT.menuKuchnia[i], "", 0);}
                System.out.println(">");
                kuchniaWybor = scanner.nextInt();
                menuKuchnia();
                break;
        }
        for (int i = 0; i < TEXT.menuKuchnia.length; i++) {
            zwolnijTekst(TEXT.menuKuchnia[i], "", 0);


        }
    }

    public void zrobKawe() {
        if (!bag.contains("KUBEK")) {
            System.out.println(" Zeby zrobić kawę potrzebny jest kubek ");
            for (int i = 0; i < TEXT.menuKuchnia.length; i++) {
                zwolnijTekst(TEXT.menuKuchnia[i], "", 0);}
            System.out.println(">");
            kuchniaWybor = scanner.nextInt();
            menuKuchnia();

        } else if (Starter.bag.contains(kubek.toUpperCase())) {
            Starter.bag.remove(kubek);
            System.out.println("Robię kawe ");
            Starter.bag.add("KAWA");
            System.out.println("dodano kawę do ekwipunku");
        }
        for (int i = 0; i < TEXT.menuKuchnia.length; i++) {
            zwolnijTekst(TEXT.menuKuchnia[i], "", 0);}
        System.out.println(">");
        kuchniaWybor = scanner.nextInt();
        menuKuchnia();
    }

}



