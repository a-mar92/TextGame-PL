public class Łazienka extends Starter {

    String tabletka = "TABLETKI";
    int ilośćTabletek = 1;
    int ilosckubek = 1;
    String kubek = "KUBEK";
    int wybórŁazienka;

    public int lazienka() {

        for (int i = 0; i < TEXT.lazienka.length; i++) {

            zwolnijTekst(TEXT.lazienka[i], "", 0);


        }
        System.out.println(">");
        wybórŁazienka = scanner.nextInt();
        switch (wybórŁazienka) {
            case 1:
                for (int i = 0; i < TEXT.lazienkaOpis.length; i++) ;
                wyborZLazienki();
                break;
            case 2:
                zasadyGry();
//                    bag.add(kubek);
//                    System.out.println("dodano " + kubek+"do ekwipunku");
                break;
            case 3:
                exit();
//                    wyborZLazienki();
                break;
            case 4:
                System.out.println("bf");
               zasadyGry();
                break;
            case 5:
                ekwipunek.przeglądEkwipunku();
                break;
            case 6:
                System.out.println("Bf");
                break;
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();


        }
        return wybórŁazienka;
    }

    public void wyborZLazienki() {
        System.out.println(">");
        switch (wybórŁazienka) {
            case 1:
                for (int i = 0; i < TEXT.lazienkaOpis.length; i++) {
                    zwolnijTekst(TEXT.lazienkaOpis[i], "", 0);
                }
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
                ekwipunek.przeglądEkwipunku();
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
        switch (wybórŁazienka) {
            case 1:

                if (ilośćTabletek == 0 ){
                    System.out.println("Niemożesz zabrać kolejnej tabletki do ekwipunku ");
                }
                else{
                    bag.add(tabletka);
                System.out.println("dodano " + tabletka + " do ekwipunku");
                ilośćTabletek--;}

//                System.out.println(">");
//                wybórŁazienka = scanner.nextInt();
                wyborZLazienki();
                break;
            case 2:
                bag.add(kubek);
                System.out.println("dodano " + kubek + " do ekwipunku");
                if (ilosckubek == 0 ){
                    System.out.println("Niemożesz zabrać kolejnej tabletki do ekwipunku ");
                }
                ilosckubek --;
                wyborZLazienki();

                break;
            case 3:
                for (int i = 0; i < TEXT.lazienkaOpis.length; i++) {
                    zwolnijTekst(TEXT.lazienkaOpis[i], "", 0);
                }
                wybórŁazienka = scanner.nextInt();
                System.out.println(">");
                wyborZLazienkiOpcje();
                break;
            case 4:
                zasadyGry();
                break;
            case 5:
                ekwipunek.przeglądEkwipunku();
                break;
            case 6:
                System.out.println("idę do salonu ");
                for (int i = 0; i < TEXT.opisSalon.length; i++) {
                    zwolnijTekst(TEXT.opisSalon[i], "", 0);
                }
                break;
            case 7:
                System.out.println("ide do kuchni");
            default:
                System.out.println("Jestem prostą grą, nie znam tej funkcji, spróbuj jeszcze raz");
                System.out.println(">");
                wybor = scanner.nextInt();
        }


    }
}


