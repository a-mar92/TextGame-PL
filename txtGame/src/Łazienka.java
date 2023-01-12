public class Łazienka extends Starter {

    String tabletka = "TABLETKA";
    int ilośćTabletek = 1;
    int ilosckubek = 1;

    int wybórŁazienka;
    int wyborłazienkaOpis;

    public void lazienka() {

        lazienkaStart();
        lazienkaStartMenu();
        System.out.println(">");
        wybórŁazienka = scanner.nextInt();
        switchLazienka1();


    }

    public void wyborZLazienki() {

        switch (wybórŁazienka) {
            case 1:
                lazienkaOpis();
                lazienkaMenu();
                wybórŁazienka = scanner.nextInt();
                System.out.println("> chyba tu");
                wyborZLazienkiOpcje();
                break;
            case 2:
                zasadyGry();
                break;
            case 3:
                exit();
//                    wyborZLazienki();
                break;
            case 4:
                zasadyGry();
                break;
            case 5:
                przeglądEkwipunku();
                break;
            case 6:
                break;
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();
        }

    }

    public void wyborZLazienkiOpcje() {
        switch (wyborłazienkaOpis) {
            case 1:
                dodawnieDoPlecaka(tabletka);
                lazienkaMenu();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();

                break;
            case 2:
                dodawnieDoPlecaka(kubek);
                lazienkaMenu();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 3:
                lazienkaOpis();
                lazienkaMenu();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 4:
                zasadyGry();
                lazienkaMenu();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 5:
               przeglądEkwipunku();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 6:
                System.out.println("idę do salonu ");
                for (int i = 0; i < TEXT.opisSalon.length; i++) {
                    zwolnijTekst(TEXT.opisSalon[i], "", 0);
                }
                Salon pomieszczenie = new Salon();
                pomieszczenie.opisSalon();
                break;
            case 7:
                System.out.println("ide do kuchni");
                break;
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();
        }


    }

    public void lazienkaStart() {
        for (int i = 0; i < TEXT.lazienkaStart.length; i++) {
            zwolnijTekst(TEXT.lazienkaStart[i], "", 0);
        }
    }

    public void lazienkaStartMenu() {
        for (int i = 0; i < TEXT.lazienkaStartMenu.length; i++) {
            zwolnijTekst(TEXT.lazienkaStartMenu[i], "", 0);
        }
    }

    public void lazienkaOpis() {
        for (int i = 0; i < TEXT.lazienkaOpis.length; i++) {
            zwolnijTekst(TEXT.lazienkaOpis[i], "", 0);
        }
    }

    public void lazienkaMenu() {
        for (int i = 0; i < TEXT.lazienkaMenu.length; i++) {
            zwolnijTekst(TEXT.lazienkaMenu[i], "", 0);
        }
    }

    public void switchLazienka1() {
        switch (wybórŁazienka) {
            case 1:
                lazienkaOpis();
                lazienkaMenu();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 2:
                zasadyGry();
                System.out.println("");
                lazienkaStartMenu();
                System.out.println(">");
                wybórŁazienka = scanner.nextInt();
                switchLazienka1();
                break;
            case 3:
                exit();
                break;
            case 4:

                Salon pomieszczenie = new Salon();
                pomieszczenie.opisSalon();
                break;
            case 5:
                przeglądEkwipunku();
                lazienkaStartMenu();
                System.out.println(">");
                wybórŁazienka = scanner.nextInt();
                switchLazienka1();
                break;
            case 6:
                System.out.println("Kuchnia");
                //kuchnia.starterKuchnia();
                break;
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();


        }
    }


}

