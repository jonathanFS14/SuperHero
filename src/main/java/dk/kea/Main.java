package dk.kea;
import java.util.Scanner;
public class Main {
    private static Database database;
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Velkommen til superhelt Databasen");
    System.out.println("Indtast Superheltens navn");
    String reader1 = sc.nextLine();
    System.out.println("Indtast det borgerlige navn");
    String reader2 = sc.nextLine();
    System.out.println("Indtast superkræft");
    String reader3 = sc.nextLine();


        SuperHeroes SuperHero1 = new SuperHeroes(reader1,reader2,reader3);
        System.out.println(SuperHero1.getFullSuperHero());

        Database database1 = new Database();
        System.out.println(database1.getDatabase());


    }

}