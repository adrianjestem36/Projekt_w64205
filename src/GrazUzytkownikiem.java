import java.util.InputMismatchException;
import java.util.Scanner;

public class GrazUzytkownikiem {

    public void zagrajZuzytkownikiem() {


        int punkty_gracza = 0;
        int punkty_gracza2= 0;
        while (true) {
            System.out.println("***********************");
            System.out.println("Wybiera użytkownik 1: Wybierz Kamień, Papier lub nożyce. (1 = Kamień, 2 = Papier, 3 = Nożyce)");
            System.out.println("***********************");
            int wybor_gracza = 0;

            while (wybor_gracza ==0) {
                wybor_gracza = pobieranieOdUzytkownika();
            }


            System.out.println("***********************");
            System.out.println("Wybiera użytkownik 2: Wybierz Kamień, Papier lub nożyce. (1 = Kamień, 2 = Papier, 3 = Nożyce)");
            System.out.println("***********************");
            int wybor_gracza2 = 0;

            while (wybor_gracza2 ==0) {
                wybor_gracza2 = pobieranieOdUzytkownika();
            }

            if (wybor_gracza2 == wybor_gracza) {
                System.out.println("-----------------------");
                System.out.println("Remis, nikomu nie przyznaje się punktu");
                System.out.println("-----------------------");
                System.out.println();
                System.out.println();
            } else if (wybor_gracza == 1) {
                if (wybor_gracza2 == 2) {
                    System.out.println("Gracz 1 wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wybrał papier.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wygrał rudne:)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza2++;
                } else if (wybor_gracza2 == 3) {
                    System.out.println("Gracz 1 wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wybrał nożyce.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 1 wygrał rudne:)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza++;

                }

            } else if (wybor_gracza == 2) {
                if (wybor_gracza2 == 1) {
                    System.out.println("Gracz 1 wybrał papier.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 1 wygrał runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza++;
                } else if (wybor_gracza2 == 3) {
                    System.out.println("Gracz 1 wybrał papier.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wybrał nożyce.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wygrał runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza2++;

                }

            } else if (wybor_gracza == 3) {
                if (wybor_gracza2 == 1) {
                    System.out.println("Gracz 1 wybrał nożyce.");
                    System.out.println("Gracz 2 wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wygrał runde :(");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza2++;
                } else if (wybor_gracza2 == 2) {
                    System.out.println("Gracz 1 wybrał kamień.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 2 wybrał nożyce.");
                    System.out.println("-----------------------");
                    System.out.println("Gracz 1 wygrał runde :)");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println();
                    punkty_gracza++;

                }

            }
            if (punkty_gracza2 == 3) {
                System.out.println("Gracz 2 wygrał 3 rundy");
                System.out.printf("Punkty Gracza 2: %d Punkty Gracza 1: %d ", punkty_gracza2, punkty_gracza);
                System.out.println();
                System.out.println("Czy chcesz rozpocząć nową grę? --1 Czy chcesz powrócić do menu głównego --2?");
                int grax;
                Scanner s1 = new Scanner(System.in);
                grax = s1.nextInt();
                switch (grax) {
                    case 1:
                        zagrajZuzytkownikiem();
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
                System.out.println("Gracz 1 wygrał 3 rundy");
                System.out.printf("Punkty Gracza 2: %d Punkty Gracza 1: %d ", punkty_gracza2, punkty_gracza);
                System.out.println();
                System.out.println("Czy chcesz rozpocząć nową grę? --1 Czy chcesz powrócić do menu głównego --2?");
                int grax;
                Scanner s1 = new Scanner(System.in);
                grax = s1.nextInt();
                switch (grax) {
                    case 1:
                        zagrajZuzytkownikiem();
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
            if (wybor_gracza>3) {
                System.out.println("Niepoprawny klawisz.");
                return 0;
            }
            return wybor_gracza;
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny klawisz. Wybierz odpowiedni.");
        }

        return 0;
    }
}