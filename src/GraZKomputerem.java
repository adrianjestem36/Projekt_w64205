import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GraZKomputerem {

    public void zagrajZkomputerem() {


        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int punkty_gracza = 0;
        int punkty_komputera = 0;
        while (true) {
            System.out.println("***********************");
            System.out.println("Wybierz Kamień, Papier lub nożyce. (1 = Kamień, 2 = Papier, 3 = Nożyce)");
            System.out.println("***********************");
            int wybor_gracza = 0;

            while (wybor_gracza == 0) {
                wybor_gracza = pobieranieOdUzytkownika();
            }
            int Wybor_komputera = rand.nextInt(3) + 1; // Wybor random komputera od 1 do 3 (KPN)

            if (Wybor_komputera == wybor_gracza) {
                System.out.println("-----------------------");
                System.out.println("Remis, nikomu nie przyznaje się punktu");
                System.out.println("-----------------------");
                System.out.println(" ");
                System.out.println(" ");
            } else if (wybor_gracza == 1) {
                if (Wybor_komputera == 2) {
                    System.out.println("Komputer wybrał papier.");
                    System.out.println("-----------------------");
                    System.out.println("Przegrales runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_komputera++;
                } else if (Wybor_komputera == 3) {
                    System.out.println("Komputer wybrał nożyce.");
                    System.out.println("-----------------------");
                    System.out.println("Wygrales runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza++;

                }

            } else if (wybor_gracza == 2) {
                if (Wybor_komputera == 1) {
                    System.out.println("Komputer wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Wygrales runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza++;
                } else if (Wybor_komputera == 3) {
                    System.out.println("Komputer wybrał nożyce.");
                    System.out.println("-----------------------");
                    System.out.println("Przegrales runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_komputera++;

                }

            } else if (wybor_gracza == 3) {
                if (Wybor_komputera == 1) {
                    System.out.println("Komputer wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Przegrales runde :(");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_komputera++;
                } else if (Wybor_komputera == 2) {
                    System.out.println("Komputer wybrał nożyce.");
                    System.out.println("-----------------------");
                    System.out.println("Wygrales runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza++;

                }

            } else {
                System.out.println("Niepoprawny klawisz.");
            }
            if (punkty_komputera == 3) {
                System.out.println("Przykro mi przegrales");
                System.out.printf("Punkty komputera: %d Punkty użytkownika: %d ", punkty_komputera, punkty_gracza);
                System.out.println();
                System.out.println("Czy chcesz rozpocząć nową grę? --1 Czy chcesz powrócić do menu głównego --2?");
                int grax;
                Scanner s1 = new Scanner(System.in);
                grax = s1.nextInt();
                switch (grax) {
                    case 1:
                        zagrajZkomputerem();
                        break;
                    case 2:
                        Gra.zagrajl();
                        break;
                    default:
                        break;

                }
                break;


            }
            if (punkty_gracza == 3) {
                System.out.println("Wygrałeś z komputerem");
                System.out.printf("Punkty komputera: %d Punkty użytkownika: %d ", punkty_komputera, punkty_gracza);
                System.out.println();
                System.out.println("Czy chcesz rozpocząć nową grę? --1 Czy chcesz powrócić do menu głównego --2?");
                int grax;
                Scanner s1 = new Scanner(System.in);
                grax = s1.nextInt();
                switch (grax) {
                    case 1:
                        zagrajZkomputerem();
                        break;
                    case 2:
                        Gra.zagrajl();
                        break;
                    default:
                        break;

                }
                break;
            }

        }
    }

    private int pobieranieOdUzytkownika() {
        Scanner scan2 = new Scanner(System.in);
        try {

            int wybor_gracza = scan2.nextInt();
            return wybor_gracza;
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny klawisz. Wybierz odpowiedni.");
        }
        return 0;
    }
}