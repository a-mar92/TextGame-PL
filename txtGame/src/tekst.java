public interface tekst {
    private void zwolnijTekst(String tekstPierwszy, String tekstDrugi, int czas) {
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
}}
