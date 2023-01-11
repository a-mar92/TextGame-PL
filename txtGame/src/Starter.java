import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
    Scanner scanner = new Scanner(System.in);
    Bag ekwipunek = new Bag();
    boolean kluczSzafka = false;
    String kubek = "KUBEK";
    int pokoj = 0;
    int trybGry;
    int wybor;
    String nazwaGracza;
    String item = "LATARKA";
    String[] textStart = {"Beep !", "ależ ciężki poranek....", " czujesz to ?", "Bolą ręce, głowa, stopy..... ", "co się wczoraj działo ?!.... "

    };
    ArrayList<String> bag = new ArrayList<>();

    public void app() {
        System.out.println("Witaj w grze tekstowiej, podaj swoje imię:  ");
        System.out.print(" > ");
        nazwaGracza = scanner.nextLine();
        System.out.println("Czesć " + nazwaGracza + " wybierz opcje : \n1 - Rozpocznij grę \n2 - Wyjście z gry");
        System.out.print(" > ");
        trybGry = scanner.nextInt();

        if (trybGry == 1) {
            StartGame();


        } else {
            exit();

        }
    }

    public void StartGame() {

        for (int i = 0; i <= 2; i++) {
            System.out.print(textStart[0]);
            try {
                Thread.sleep(0);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(" ");
        }
        System.out.println("....");

        zwolnijTekst(textStart[1], nazwaGracza + textStart[2], 0);


        zwolnijTekst(textStart[3], textStart[4], 0);
        zwolnijTekst("\nWybierz opcje :\n1 - Przypomnij sobie (Start gry) , \n2 - Spróbuj dalej spać \n3 - Opis gry\n4 - EXIT", ">", 500);

        wybor = scanner.nextInt();
        boolean petal = true;
        while (petal) {
            switch (wybor) {
                case 1:
                    wspomnienie();
                    petal=false;
                    break;
                case 2:
                    System.out.println("Nic to nie da :(");
                    System.out.println("Wybierz jeszcze raz");
                    System.out.println(">");
                    wybor = scanner.nextInt();
                    break;
                case 3:
                    zasadyGry();
                    zwolnijTekst("Wybierz opcje :\n1 - Przypomnij sobie , \n2 - Spróbuj dalej spać \n3 - Opis gry \n4 - EXIT", ">", 0);
//                    System.out.println(">");
                    wybor = scanner.nextInt();
                    break;
                case 4:
                    exit();
                    petal = false;
                    break;
                default:
                    System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                    System.out.println(">");
                    wybor = scanner.nextInt();


            }

        }


    }

    public void zasadyGry() {
        for (int i = 0; i < TEXT.ZasadyGry.length; i++) {

            zwolnijTekst(TEXT.ZasadyGry[i], "", 0);

        }
    }

    public void exit() {
        System.out.println("exit");

    }

    public void wspomnienie() {

        for (int i = 0; i < TEXT.wspomnienieSalon.length; i++) {

            zwolnijTekst(TEXT.wspomnienieSalon[i], "", 0);

        }
        System.out.println("> wspomnienie ? ");
        int wyborWspomnienie = scanner.nextInt();
        switch (wyborWspomnienie) {
            case 1:
                Salon pomieszczenie = new Salon();
                pomieszczenie.opisSalon();


                break;
            case 2:
                zasadyGry();
                wspomnienie();
                break;
            case 3:
                System.out.println("Przeszukaj pokój, może znajdziesz jakąć ciekawy przedmiot....");
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();
        }
    }


    void changeRoom() {
        System.out.println("");
        if (pokoj == 1) {
            System.out.println("you are in room 1 ");

        } else if (pokoj == 2) {
            System.out.println("you are in room 2 ");
        } else {
            System.out.println("Starter");
        }


    }

    public void zwolnijTekst(String tekstPierwszy, String tekstDrugi, int czas) {
        for (int i = 0; i < 1; i++) {
            System.out.println(tekstPierwszy);
//
//            System.out.println(  textStart[3]);
//            System.out.println(  textStart[4]);

        }
        try {
            Thread.sleep(czas);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print(tekstDrugi);

    }


}
