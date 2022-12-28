import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
    Scanner scanner = new Scanner(System.in);

    int pokoj = 0;
    int trybGry;
    int wybor2;
    String nazwaGracza;
    String item = "LATARKA";
    String []textStart = {"Beep !","ależ ciężki poranek...."," czujesz to ?", "Bolą ręce, głowa, stopy..... ", "co się wczoraj działo ?!.... "

    };
    ArrayList<String> bag = new ArrayList<>();

    public void app (){
        System.out.println("Witaj w grze tekstowiej, podaj swoje imię:  ");
        System.out.print( " > ");
        nazwaGracza = scanner.nextLine();
        System.out.println( "Czesć " + nazwaGracza + " wybierz opcje : \n1 - Rozpocznij grę \n2 - Wyjście z gry" );
        System.out.print( " > ");
        trybGry = scanner.nextInt();

        if (trybGry == 1 ){
            StartGame();


        }
        else {
            exit();

        }
    }

    public void StartGame(){

        for (int i = 0; i <= 2; i++) {
            System.out.print(textStart[0]);
            try {
                Thread.sleep(700);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(" ");
        }
        System.out.println("....");
        for (int i = 0; i < 1; i++) {

        }
        try {
            Thread.sleep(1000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        } System.out.println(textStart[1]);
        System.out.println( nazwaGracza + textStart[2]);
        System.out.println(  textStart[3]);
        System.out.println(  textStart[4]);

        System.out.println(" Wybierz opcje :\n 1 - przypomnij sobie , \n 2 - spróbuj spać ");

        System.out.println(">");
        int wybor = scanner.nextInt();

        while (wybor!=1){
            int i =0;
            System.out.println("Nic to nie da :(");
            System.out.println("Wybierz jeszcze raz");
            System.out.print(">");
            wybor = scanner.nextInt();
            if (wybor != 1){
            i ++;}
            if (i >0){
                System.out.println(nazwaGracza +  " To naprawdę nic to nie da, spróbuj sobie przepomnieć");
                System.out.println("1 - przypomnij sobie , \n 2 - spróbuj spać \"Wybierz jeszcze raz");
                System.out.print(">");
                if (wybor == 1 ){
                    wspomnienie();
                }
            }



        }if (wybor ==1){
            wspomnienie();
        }


    }

    public void exit() {
        System.out.println("exit");

    }

    public void wspomnienie (){



    }



    void changeRoom(){
        System.out.println("");
        if (pokoj == 1 ){
            System.out.println( "you are in room 1 " );

        } else if (pokoj ==2 ) {
            System.out.println ("you are in room 2 " );
        } else
        {
            System.out.println("Starter");
        }


    }




}
