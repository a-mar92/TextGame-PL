import java.util.ArrayList;

public class Salon extends Starter {

    String klucz = "KLUCZ";
    int salonWspomnienie;
    int salondzialanie;
    int passwordtry = 0;
    Kuchnia kuchnia = new Kuchnia();
    Łazienka łazienka = new Łazienka();
    boolean yubiKey = true;

    public void opisSalon() {
        for (int i = 0; i < TEXT.opisSalonStart.length; i++) {

            zwolnijTekst(TEXT.opisSalonStart[i], "", 0);
        }
        System.out.println(">");
        salonWspomnienie = scanner.nextInt();
        salonOpisSwich();

    }

    private void salonPrzeszukanie() {

        System.out.println("");
        switch (salondzialanie) {
            case 1:
                System.out.println("Odpalam Kompa...");
                while (passwordtry <= 3) {
                    if (yubiKey) {
                        System.out.println("komputer odblokowany");
                        break;
                    }
                    String password = scanner.nextLine();
                    System.out.println("Podaj hasło...");
                    passwordtry++;
                }
                if (!yubiKey) {
                    System.out.println("Komputer zablokowany, aby odlokować użyj YubiKey");
                }
                for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanie[i], "", 0);
                }
                System.out.println(">");
                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
                break;
            case 2:
                salonPrzeszukanieCase2();
                break;

            case 3:
                zasadyGry();
                System.out.println("chyba tu po key");
                salondzialanie = scanner.nextInt();
                salonPrzeszukanie();
            case 4:
                kuchnia.starterKuchnia();
                break;
            case 5:
                łazienka.lazienka();
                break;
            case 6:
                for (int i = 0; i < bag.size(); i++) {
                    if (Starter.bag.size() == 0) {
                        System.out.println("plecak pusty");
                    } else
                        System.out.println("w plecaku masz : " + Starter.bag.get(i));
                }
                System.out.println("Twój ekwipunek to : " + Starter.bag.size());

                for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanie[i], "", 0);
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
            zwolnijTekst(TEXT.salonDzialanieLozko[i], "", 0);
        }
        System.out.println(">");
        int kluczValue = scanner.nextInt();

        do {
            switch (kluczValue) {
                case 1:
                    dodawnieDoPlecaka("KLUCZ");
//                    if (!kluczSzafka) {
//                        Starter.bag.add(klucz);
//                        System.out.println("dodano " + klucz + " do ekwipunku");
//                        kluczSzafka = true;
//
//                    } else {
//                        System.out.println("klucz został już dodany ");

                    for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                        zwolnijTekst(TEXT.salonDzialanie[i], "", 0);
                    }
                    kluczValue = scanner.nextInt();
                    break;

                case 2:
                    dodawnieDoPlecaka(klucz);
//                    if (kluczSzafka) {
//                        System.out.println("mam klucz, nic więcej nie znajdę. Idź do kuchni :)");
//
//                    } else {
                        System.out.println("znalezłem klucz od szafki,zabierz go do ekwipunku. Nic innego tutaj nie ma" +
                                "\n1 - Zabierz klucz " +
                                "2 - szukaj innych wskazówek" +
                                "3 - Idź się do łazienki " +
                                "4 - Potrzebuje pomocy " +
                                "5 - Idz do kuchni(bf) " +
                                "6 - Ekwiunek(bf)"
                        );

                    kluczValue = scanner.nextInt(); //nie wiem po co to
                    //System.out.println(TEXT.salonDzialanie);
                    break;
                case 3:
                    łazienka.lazienka();
                    break;
                case 4:
                    zasadyGry();
                    break;
                case 5:
                    kuchnia.starterKuchnia();
                    break;
                case 6:

                    for (int i = 0; i < bag.size(); i++) {
                        if (Starter.bag.size() == 0) {
                            System.out.println("plecak pusty");
                        } else
                            System.out.println(Starter.bag.get(i));
                    }
                    System.out.println("Twój ekwipunek to : " + Starter.bag.size() +
                            "\n 1 - Zabierz klucz " +
                            "2 - szukaj innych wskazówek" +
                            "3 - Idź się do łazienki " +
                            "4 - Potrzebuje pomocy " +
                            "5 - Idz do kuchni(bf) " +
                            "6 - Ekwiunek(bf)");
                    kluczValue = scanner.nextInt();
                    break;
            }
        }
        while (!kluczSzafka);


        salondzialanie = scanner.nextInt();
        salonPrzeszukanie();


    }

    public void salonOpisSwich() {
        switch (salonWspomnienie) {
            case 1:
                for (int i = 0; i < TEXT.salonDzialanieIntro.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanieIntro[i], "", 0);
                }
                for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                    zwolnijTekst(TEXT.salonDzialanie[i], "", 0);
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
                break;
            case 4:
                kuchnia.starterKuchnia();
                break;
            case 5:
                przeglądEkwipunku();
                System.out.println("1 - Wstań i szukaj jakiś wskazówek\n" +
                        "2 - Siku !!! - Idź się do łazienki\n" +
                        "3 - Potrzebuje pomocy\n" +
                        "4 - Idz do kuchni(bf)\n" +
                        "5 - Ekwiunek(bf)\n"
                );
                System.out.println(">");
                salonWspomnienie = scanner.nextInt();
                salonOpisSwich();
                break;
            default:
                System.out.println("jest w opis salon w defoult");
        }
    }
}





