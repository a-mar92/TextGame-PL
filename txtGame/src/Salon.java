public class Salon extends Starter {

    String klucz = "KLUCZ";
    int salonWspomnienie;
    int salondzialanie;
    int passwordtry = 0;
    boolean key = false;
    Łazienka łazienka = new Łazienka();
    boolean yubiKey = true;

    public void opisSalon() {
        for (int i = 0; i < TEXT.opisSalonStart.length; i++) {

            zwolnijTekst(TEXT.opisSalonStart[i], "", 0);
        }
        System.out.println(">");
        salonWspomnienie = scanner.nextInt();
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
            default:
                System.out.println("jesz");
        }

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
                System.out.println("salonPrzeszukanie case 4");
                break;
            case 5:
                for (int i = 0; i < bag.size(); i++) {
                    if (bag.size()==0){
                        System.out.println("plecak pusty");
                    }
                    else
                        System.out.println("w plecaku masz : " +  bag.get(i));
                }
                System.out.println("Twój ekwipunek to : " + bag.size());

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
    private void salonPrzeszukanieCase2(){for (int i = 0; i < TEXT.salonDzialanieLozko.length; i++) {
        zwolnijTekst(TEXT.salonDzialanieLozko[i], "", 0);
    }
        System.out.println(">");
        int kluczValue = scanner.nextInt();

        do {
            switch (kluczValue) {
                case 1:
                    if (!key) {
                        bag.add(klucz);
                        System.out.println("dodano " + klucz + " do ekwipunku");
                        key = true;
                    } else {
                        System.out.println("klucz został już dodany ");
                    }

                    for (int i = 0; i < TEXT.salonDzialanie.length; i++) {

                        zwolnijTekst(TEXT.salonDzialanie[i], "", 0);
                    }

                    break;

                case 2:
                    if (key) {
                        System.out.println("mam klucz, nic więcej nie znajdę. Idź do kuchni :)");

                    } else {
                        System.out.println("znalezłem klucz od szafki,zabierz go do ekwipunku. Nic innego tutaj nie ma" +
                                "\n1 - Zabierz klucz " +
                                "2 - szukaj innych wskazówek" +
                                " 3 - Idź się do łazienki " +
                                "4 - Potrzebuje pomocy " +
                                "5 - Idz do kuchni(bf) " +
                                "6 - Ekwiunek(bf)"
                        );
                    }
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
                    System.out.println("Kuchnia ");
                    break;
                case  6 :

                    for (int i = 0; i < bag.size(); i++) {
                        if (bag.size()==0){
                            System.out.println("plecak pusty");
                        }
                        else
                            System.out.println(bag.get(i));
                    }
                    System.out.println("Twój ekwipunek to : " + bag.size()+
                            "\n 1 - Zabierz klucz " +
                            "2 - szukaj innych wskazówek" +
                            " 3 - Idź się do łazienki " +
                            "4 - Potrzebuje pomocy " +
                            "5 - Idz do kuchni(bf) " +
                            "6 - Ekwiunek(bf)");
                    kluczValue = scanner.nextInt();
                    break;
            }
        }
        while (!key);


        salondzialanie = scanner.nextInt();
        salonPrzeszukanie();


    }
}





