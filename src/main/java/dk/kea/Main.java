package dk.kea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database database = new Database();
        int brugerinput = 0;
        do {
            System.out.println(""" 
                    Velkommen til superhelt databasen 
                    Tast 1 for et oprette en superhelt
                    Tast 2 for at se databasen
                    Tast 3 for at søge efter en superhelt
                    Tast 9 for at afslutte programmet
                    """);

            brugerinput = sc.nextInt();
            sc.nextLine();

            if (brugerinput == 1) {
                System.out.println("Indtast Superheltens navn");
                String superHeroName = sc.nextLine();
                System.out.println("Indtast det borgerlige navn");
                String normalName = sc.nextLine();
                System.out.println("Indtast superkræft");
                String superPower = sc.nextLine();
                System.out.println("Indtast oprindelses år");
                String originYear = sc.nextLine();
                System.out.println("Indtast styrke 1-100");
                String strenght = sc.nextLine();
                System.out.println("Er superhelten et menneske? ja/nej");
                String isHuman = sc.nextLine();
                database.addSuperHero(superHeroName, normalName, superPower, originYear, strenght, isHuman);
            }
            else if (brugerinput == 2) {
                System.out.println("Liste af superhelte: \n");
                for (SuperHeroes i : database.getSuperHeroesdata()) {
                    System.out.println(i);
                }
            }
            else if (brugerinput == 3) {
                System.out.println("Indtast superheltens navn");
            String searchForHero = sc.nextLine();
            database.SearchForHero(searchForHero);
                System.out.println(database.SearchForHero(searchForHero));

            }
            else {
            System.exit(0);
            }
        } while (brugerinput != 9);
    }

}