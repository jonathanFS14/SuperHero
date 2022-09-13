package dk.kea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database database = new Database();
        int brugerinput = 0;
        do {
            System.out.println(""" 
                    Velkommen til superhelt Databasen 
                    tast 1 for et oprette en superhelt
                    tast 9 for at afslutte programmet
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
            } else {
                System.exit(0);
            }
        } while (brugerinput != 9);


    }

}