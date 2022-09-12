package dk.kea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Velkommen til superhelt Databasen");

    Scanner sc = new Scanner (System.in);
        System.out.println("Indtast Superheltens navn");
    String reader1 = sc.nextLine();
        System.out.println("Indtast det rigtige navn");
    String reader2 = sc.nextLine();
        System.out.println("Indtast superkræft");
        String reader3 = sc.nextLine();

        SuperHeroes SuperHero1 = new SuperHeroes(reader1,reader2,reader3);

        System.out.println(SuperHero1.toString());


    }

}