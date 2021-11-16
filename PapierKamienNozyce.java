import java.util.Random;
import java.util.Scanner;

public class PapierKamienNozyce {
    public static void main(String[] args) {
        // Drukujemy powitanie do gry
        System.out.println("Witam w grze papier kamień nożyce.");
        // tworzymy obiekt scanera
        Scanner scanner = new Scanner(System.in);


        // tworzymy obiekt random
        Random generator = new Random();
        // tworzymy pętle while


        while (true) {
            System.out.println("Wybierz ruch: " + "P = papier || " + "K = kamień || "
                    + "N = nożyce || " + "W = wyjście");
            // pobieramy ruch od użytkownika
            String ruchUżytkownika = scanner.nextLine();
            ruchUżytkownika = ruchUżytkownika.toUpperCase();
            // tworzymy ruch komputera
            int intKomputera = generator.nextInt(3);
            String ruchKomputera = "";
            if (intKomputera == 0) {
                ruchKomputera = "P";
            } else if ( intKomputera== 1) {
                ruchKomputera = "K";
            } else if ( intKomputera== 2) {
                ruchKomputera = "N";
            }
            drukowanieruchu(ruchUżytkownika, ruchKomputera);
            if (ruchUżytkownika.equals(ruchKomputera)) {

                System.out.println("Wynik: Remis");

            } else if (ruchUżytkownika.equals("K")) {
                if (ruchKomputera.equals("N"))
                    System.out.println("Wygrałeś!");
                else if (ruchKomputera.equals("P"))
                    System.out.println("Przegrałeś!");
            } else if (ruchUżytkownika.equals("P")) {
                if (ruchKomputera.equals("N"))
                    System.out.println("Przegrałeś!");
                else if (ruchKomputera.equals("K"))
                    System.out.println("Wygrałeś!");
            } else if (ruchUżytkownika.equals("N")) {
                if (ruchKomputera.equals("P"))
                    System.out.println("Wygrałeś");
                else if (ruchKomputera.equals("K"))
                    System.out.println("Przegrałeś");
            } else {
                System.out.println("Dzięki za gre !");
                break;
            }
        }


    }

    private static void drukowanieruchu(String ruchUżytkownika, String ruchKomputera) {
        System.out.println("Twój ruch: " + ruchUżytkownika + " || Ruch komputera: " + ruchKomputera);
    }
}
