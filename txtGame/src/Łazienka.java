public class Łazienka extends Starter {
    Kuchnia kuchnia = new Kuchnia();
    String tabletka = "TABLETKA";
    int ilośćTabletek = 1;
    int ilosckubek = 1;

    int wybórŁazienka;
    int wyborłazienkaOpis;

    public void lazienka() {
        System.out.println("wybór z Łazineki");
        lazienkaStart();
        lazienkaStartMenu();
        System.out.println(">");
        wybórŁazienka = scanner.nextInt();
        switchLazienka1();


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
                informacjeŁazienka();
                lazienkaMenu();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 5:
               uzycieEkwipunku();
                System.out.println(">");
                wyborłazienkaOpis = scanner.nextInt();
                wyborZLazienkiOpcje();
                break;
            case 6:
                System.out.println("idę do salonu ");
                for (int i = 0; i < TEXT.opisSalon.length; i++) {
                    zwolnijTekst(TEXT.opisSalon[i], "", spowolnienie);
                }
                Salon pomieszczenie = new Salon();
                pomieszczenie.opisSalon();
                break;
            case 7:
               // Kuchnia kuchnia = new Kuchnia();
                kuchnia.starterKuchnia();

                break;
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();
        }


    }

    public void lazienkaStart() {
        for (int i = 0; i < TEXT.lazienkaStart.length; i++) {
            zwolnijTekst(TEXT.lazienkaStart[i], "", spowolnienie);
        }
    }

    public void lazienkaStartMenu() {
        for (int i = 0; i < TEXT.lazienkaStartMenu.length; i++) {
            zwolnijTekst(TEXT.lazienkaStartMenu[i], "", spowolnienie);
        }
    }

    public void lazienkaOpis() {
        for (int i = 0; i < TEXT.lazienkaOpis.length; i++) {
            zwolnijTekst(TEXT.lazienkaOpis[i], "", spowolnienie);
        }
    }

    public void lazienkaMenu() {
        for (int i = 0; i < TEXT.lazienkaMenu.length; i++) {
            zwolnijTekst(TEXT.lazienkaMenu[i], "", spowolnienie);
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
                informacjeŁazienka();
                System.out.println("");
                lazienkaStartMenu();
                System.out.println(">");
                wybórŁazienka = scanner.nextInt();
                switchLazienka1();
                break;
            case 3:
                kuchnia.starterKuchnia();
                break;
            case 4:

                Salon pomieszczenie = new Salon();
                pomieszczenie.opisSalon();
                break;
            case 5:
                uzycieEkwipunku();
                lazienkaStartMenu();
                System.out.println(">");
                wybórŁazienka = scanner.nextInt();
                switchLazienka1();
                break;
            case 6:
                exit();
System.exit(0);
                break;

            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();


        }
    }


}

