import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Salon extends Starter {

    String klucz = "KLUCZ";
    int salonWspomnienie;
    int salondzialanie;
    static int passwordtry = 0;
    Kuchnia kuchnia = new Kuchnia();
    Łazienka łazienka = new Łazienka();
    boolean yubiKey = true;
    String password;
    int koniec;

    public void opisSalon() {
        for (int i = 0; i < TEXT.opisSalonStart.length; i++) {

            zwolnijTekst(TEXT.opisSalonStart[i], "", spowolnienie);
        }
        System.out.println(">");
        salonWspomnienie = scanner.nextInt();
        salonOpisSwich();

    }

    private void salonPrzeszukanie() {

        System.out.println("");
        switch (salondzialanie) {
            case 1:
                odblokujKomputer();
//

                break;
            case 2:
                salonPrzeszukanieCase2();
                break;

            case 3:
                zasadyGry();


                System.out.println("1 - przeszukaj Laptop \n" +
                        "2 - przeszukaj łóżko\n" +
                        "3 - Potrzebuje pomocy\n" +
                        "4 - Idz do kuchni\n" +
                        "5 - Idz do łazienki\n" +
                        "6 - Ekwiunek\n" +
                        ">");
                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
            case 4:
                kuchnia.starterKuchnia();
                break;
            case 5:
                łazienka.lazienka();
                break;
            case 6:
                uzycieEkwipunku();

                for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanie[i], "", spowolnienie);
                }

                System.out.println(">");
                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
                break;
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                salondzialanie = scanner.nextInt();
                break;

        }
    }

    private void salonPrzeszukanieCase2() {
        for (int i = 0; i < TEXT.salonDzialanieLozko.length; i++) {
            zwolnijTekst(TEXT.salonDzialanieLozko[i], "", spowolnienie);
        }
        System.out.println(">");
        int kluczValue = scanner.nextInt();

        //  do {
        switch (kluczValue) {
            case 1:

                if (!Starter.bag.contains("KAWA")) {
                    System.out.println("Jestem bardzo zmęczony, nie dam rady zabrać teraz klucza. Napij się kawy i wróć po klucz\n");
                } else
                    dodawnieDoPlecaka("KLUCZ");

//                    if (!kluczSzafka) {
//                        Starter.bag.add(klucz);
//                        System.out.println("dodano " + klucz + " do ekwipunku");
//                        kluczSzafka = true;
//
//                    } else {
//                        System.out.println("klucz został już dodany ");

                System.out.println(
                        "1 - przeszukaj Laptop (do zrobienia)\n" +
                                "2 - przeszukaj łóżko\n" +
                                "3 - Potrzebuje pomocy\n" +
                                "4 - Idz do kuchni(do zrobienia)\n" +
                                "5 - Idz do łazienki\n" +
                                "6 - Ekwiunek\n" +
                                ">");

                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
                break;

            case 2:
                if (Starter.bag.isEmpty()) {
                    System.out.println("W łóżku znajdziesz tylko klucz. Wykorzystasz go w kuchni");
                } else {
                    System.out.println("Nic więcej nie znajdziesz");
                }
                System.out.println(
                        "1 - przeszukaj Laptop (do zrobienia)\n" +
                                "2 - przeszukaj łóżko\n" +
                                "3 - Potrzebuje pomocy\n" +
                                "4 - Idz do kuchni(do zrobienia)\n" +
                                "5 - Idz do łazienki\n" +
                                "6 - Ekwiunek\n" +
                                ">");


                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
                break;
            case 3:
                łazienka.lazienka();
                break;
            case 4:
                zasadyGry();
                System.out.println(
                        "1 - Zabierz klucz \n" +
                                "2 - szukaj innych wskazówek\n" +
                                "3 - Idź się do łazienki\n" +
                                "4 - Potrzebuje pomocy\n" +
                                "5 - Idz do kuchni\n" +
                                "6 - Ekwiunek\n" +
                                ">");
                kluczValue = scanner.nextInt();
//                    salonPrzeszukanieCase2();
                break;
            case 5:
                System.out.println("PEweni tu");
                kuchnia.starterKuchnia();
                break;
            case 6:
                uzycieEkwipunku();

                System.out.println(
                        "1 - Zabierz klucz \n" +
                                "2 - szukaj innych wskazówek\n" +
                                "3 - Idź się do łazienki\n" +
                                "4 - Potrzebuje pomocy\n" +
                                "5 - Idz do kuchni\n" +
                                "6 - Ekwiunek\n" +
                                ">");
                kluczValue = scanner.nextInt();
                break;
        }
    }


    public void salonOpisSwich() {
        switch (salonWspomnienie) {
            case 1:
                for (int i = 0; i < TEXT.salonDzialanieIntro.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanieIntro[i], "", spowolnienie);
                }
                for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanie[i], "", spowolnienie);
                }
                System.out.println(">");
                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
                break;
            case 2:
                łazienka.lazienka();
                break;
            case 3:
                zasadyGry();
                System.out.println(
                        "1 - Wstań i szukaj jakiś wskazówek\n" +
                                "2 - Siku !!! - Idź się do łazienki\n" +
                                "3 - Potrzebuje pomocy\n" +
                                "4 - Idz do kuchni\n" +
                                "5 - Ekwiunek");
                System.out.println(">");
                salonWspomnienie = scanner.nextInt();
                salonOpisSwich();


                break;
            case 4:
                kuchnia.starterKuchnia();
                break;
            case 5:
                uzycieEkwipunku();
                System.out.println("1 - Wstań i szukaj jakiś wskazówek\n" +
                        "2 - Siku !!! - Idź się do łazienki\n" +
                        "3 - Potrzebuje pomocy\n" +
                        "4 - Idz do kuchni\n" +
                        "5 - Ekwiunek"
                );
                System.out.println(">");
                salonWspomnienie = scanner.nextInt();
                salonOpisSwich();
                break;
            default:
                System.out.println("jest w opis salon w defoult");
        }
    }

    public void odblokujKomputer() {
        while (passwordtry <= 3) {
            Scanner scanner1 = new Scanner(System.in);
            if (Starter.bag.contains("YubiKey")) {
                laptop();
                break;
            } else if (passwordtry == 3) {
                System.out.println("Komputer zablokowny, użyj yubikey\n");
                break;
            } else {
                System.out.println("podaj hasło: ");


                password = scanner1.nextLine();
                Salon.passwordtry++;
                System.out.println("błędne hasło, spróbój jescze raz, zostało " + (3 - passwordtry) + " prób ");
            }
        }
        for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

            zwolnijTekst(TEXT.salonDzialanie[i], "", spowolnienie);
        }
        System.out.println(">");
        salondzialanie = scanner.nextInt();
        salonPrzeszukanie();
    }

    public void laptop(){
        for (int i = 0; i < TEXT.laptop.length; i++) {
            zwolnijTekst(TEXT.laptop[i],"",spowolnienie );
        }

        if (Starter.bag.contains("TABLETKA")){
            for (int i = 0; i < TEXT.laptopTabletka.length; i++) {
                zwolnijTekst(TEXT.laptopTabletka[i],"",spowolnienie );
            }
            System.out.println(">");
            koniec=scanner.nextInt();
            if (koniec != 1){
            System.exit(0);}
            else {
                System.out.println("\n");
                app();
            }
        }else{
            System.out.println("\nZnajdz TABLETKI i wróć do przeglądania kompa");}
            for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                zwolnijTekst(TEXT.salonDzialanie[i], "", spowolnienie);
            }
            System.out.println(">");
            salondzialanie = scanner.nextInt();
            salonPrzeszukanie();

        }

    }











