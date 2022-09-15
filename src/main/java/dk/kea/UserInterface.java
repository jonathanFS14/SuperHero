package dk.kea;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public void StartProgram(){
        Scanner sc = new Scanner(System.in);
        Database database = new Database();
        int brugerinput = 0;

        do {
            System.out.println(""" 
                    Velkommen til superhelt databasen
                    
                    Tast 1 for et oprette en superhelt i databasen
                    Tast 2 for at se databasen
                    Tast 3 for at søge efter en superhelt
                    Tast 4 for ændre information for en eksisterende superhelt
                    Tast 5 for at afslutte programmet
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
                for (SuperHero i : database.getSuperHeroesdata()) {
                    System.out.println(i); }
            }

            else if (brugerinput == 3) {
                System.out.println("Indtast superheltens navn");
                String searchForHero = sc.nextLine();
                searchForHeroLenght(database.searchForHeroDatabase(searchForHero));
                }

            else if (brugerinput == 4){

            }

            else {
                System.exit(0); }

        } while (brugerinput <= 5);

    }


    public void searchForHeroLenght(ArrayList<SuperHero> heroList){
        if (heroList != null){
        for (SuperHero superHero: heroList){
            System.out.println(superHero); }
        }
        else {
            System.out.println("Jeg kunne ikke finde nogen superhelt ud fra dit søgekriterie"); }
    }
}
