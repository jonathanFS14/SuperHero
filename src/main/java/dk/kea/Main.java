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
                database.addSuperHero(superHeroName, normalName, superPower);
            }
            else if (brugerinput == 2) {
                System.out.println("Liste af superhelte:");
                System.out.println(" ");
                System.out.println(database.getSuperHeroesdata());
                // TODO: lav loop der løber igennem alle og udskriver
                System.out.println(" ");
            }
            else {
            System.exit(0);
            }
        } while (brugerinput != 9);
    }

}