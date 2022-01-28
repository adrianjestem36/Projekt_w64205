import java.util.InputMismatchException;
import java.util.Scanner;


public class Gra {
    public static void main(String[] args) {
        zagrajl();
    }
    public static void zagrajl() {
        int wybórGry;
        Scanner s = new Scanner(System.in);
        do {
                wybórGry = menuWyboru();
                switch (wybórGry) {
                    case 1:
                        GraZKomputerem graZKomputerem = new GraZKomputerem();
                        graZKomputerem.zagrajZkomputerem();
                        break;
                    case 2:
                        GrazUzytkownikiem grazUzytkownikiem = new GrazUzytkownikiem();
                        grazUzytkownikiem.zagrajZuzytkownikiem();
                         break;
                    case 3:
                        System.out.println("Gra wykonana przez: Adrian Sokołowski 64205 ");
                        System.out.println("-----------------------");
                        Gra.zagrajl();
                        break;
                    default:
                        System.out.println("Wybierz poprawny numer wyboru menu od 1-3!");
                        Gra.zagrajl();
                        break;
                }
            } while (wybórGry > 4);
    }

    public static int menuWyboru() {
        int wybor_gracza = 0;

        System.out.println("Witam Cię w grze Rock Paper Scissors");
        System.out.println("-------------------------------------");
        System.out.println("Menu gry");
        System.out.println("-------------------------------------");
        System.out.println("1. Gra z komputerem");
        System.out.println("-------------------------------------");
        System.out.println("2. Gra na dwoch graczy offline");
        System.out.println("-------------------------------------");
        System.out.println("3. Credits");
        System.out.println("-------------------------------------");
        System.out.println("Twoj wybor to:");
        while (wybor_gracza ==0) {
            wybor_gracza = pobieranieOdUzytkownika();
        }
        return wybor_gracza;

    }
    static int pobieranieOdUzytkownika() {
        Scanner scan2 = new Scanner(System.in);
        try {

            int wybor_gracza = scan2.nextInt();
            return wybor_gracza;
        } catch (InputMismatchException e) {
            System.out.println("Do wyboru masz (1 = Gra z komputerem, 2 = Gra na dwoch graczy offline, 3 = Credits)");
        }
        return 0;
    }
}