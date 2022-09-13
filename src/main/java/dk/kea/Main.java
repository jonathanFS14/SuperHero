package dk.kea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    SuperHeroes superHero1 = new SuperHeroes();
    Database database = new Database();
    database.superHeroesdata[0] = superHero1;

    System.out.println("Velkommen til superhelt Databasen");
    System.out.println("Indtast Superheltens navn");
    String superHeroName = sc.nextLine();
    superHero1.setSuperHeroName(superHeroName);
    //System.out.println(superHero1.getSuperHeroName());

    System.out.println("Indtast det borgerlige navn");
    String normalName = sc.nextLine();
    superHero1.setNormalName(normalName);
    //System.out.println(superHero1.getNormalName());

    System.out.println("Indtast superkræft");
    String superPower = sc.nextLine();
    superHero1.setSuperPower(superPower);
    //System.out.println(superHero1.getSuperPower());


    }

}