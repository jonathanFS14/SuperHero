package dk.kea;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final Scanner sc = new Scanner(System.in);

    public void StartProgram(){
        Database database = new Database();
        int brugerinput = 0;

            do {
                System.out.println(""" 
                        Velkommen til superhelt databasen
                                            
                        Tast 1 for et oprette en superhelt i databasen
                        Tast 2 for at se databasen
                        Tast 3 for at søge efter en superhelt
                        Tast 4 for ændre information for en eksisterende superhelt
                        Tast 5 eller et højere tal for at afslutte programmet
                        """);
                brugerinput = parseAsInt();
                if (brugerinput == 1) {createHero(database);}
                else if (brugerinput == 2) {showDatabase(database);}
                else if (brugerinput == 3) {searchForHero(database);}
                else if (brugerinput == 4) {editHero(database);}
                else {System.exit(0);}
            } while (brugerinput <= 5);
         }

        public void createHero (Database database){
        System.out.println("Indtast Superheltens navn");
        String superHeroName = sc.nextLine();
        System.out.println("Indtast det borgerlige navn");
        String normalName = sc.nextLine();
        System.out.println("Indtast superkræft");
        String superPower = sc.nextLine();
        System.out.println("Indtast oprindelses år");
        int originYear = parseAsInt();
        System.out.println("Indtast styrke 1-100");
        double strenght = parseAsDouble();
        System.out.println("Er superhelten et menneske? ja/nej");
        String isHuman = sc.nextLine();
        database.addSuperHero(superHeroName, normalName, superPower, originYear, strenght, isHuman); }

    public void showDatabase (Database database){
    System.out.println("Liste af superhelte: \n");
     for (SuperHero i : database.getSuperHeroesdata()) {
      System.out.println(i); } }
    public void searchForHero (Database database){
        System.out.println("Indtast superheltens navn");
        String searchForHero = sc.nextLine();
        chooseHero(database.searchForHeroDatabase(searchForHero)); }
    public void editHero (Database database){
        System.out.println("Indtast superheltens navn");
        String searchForHero = sc.nextLine();
        SuperHero superHero = chooseHero(database.searchForHeroDatabase(searchForHero));
        if (superHero != null){
        System.out.println("Skriv nyt data og tryk enter. tryk enter hvis data ikke skal redigeres");

        System.out.println("Superhelte navn: " + superHero.getSuperHeroName());
        String newSuperHeroName = sc.nextLine();
        if (!newSuperHeroName.isEmpty())
        superHero.setSuperHeroName(newSuperHeroName);

        System.out.println("Borgerlige navn: " + superHero.getNormalName());
        String newNormalName = sc.nextLine();
        if (!newNormalName.isEmpty())
            superHero.setNormalName(newNormalName);

        System.out.println("Superkræft: " + superHero.getSuperPower());
        String newSuperPower = sc.nextLine();
        if (!newSuperPower.isEmpty())
            superHero.setSuperPower(newSuperPower);

        System.out.println("Oprindelses år: " + superHero.getOriginYear());
        String newOriginYear = sc.nextLine();
        if (!newOriginYear.isEmpty())
            superHero.setOriginYear(Integer.parseInt(newOriginYear));

        System.out.println("Styrke 1-100: " + superHero.getStrenght());
        String newStrenght = sc.nextLine();
        if (!newStrenght.isEmpty())
            superHero.setStrenght(Double.parseDouble(newStrenght));

        System.out.println("Er superhelten et menneske? ja/nej: " + superHero.getIsHuman());
        String newIsHuman = sc.nextLine();
        if (!newIsHuman.isEmpty())
            superHero.setHuman(newIsHuman); } }

    public SuperHero chooseHero (ArrayList<SuperHero> herolist) {
        if (herolist.size() != 0) {
            if (herolist.size() == 1) {
                return herolist.get(0); }
            else {
            for (int i = 0; i < herolist.size(); i++){
                System.out.printf("%s: %s, %s \n", i+1 ,herolist.get(i).getSuperHeroName(), herolist.get(i).getNormalName()); }
            while (true){
                int heronumber = sc.nextInt();
                heronumber--;
                if(heronumber < herolist.size() && heronumber >= 0){
                    System.out.println(herolist.get(heronumber));
                    return herolist.get(heronumber); }
            else {
            System.out.println("dit søgekriterie er ude for databasen, skriv en ny værdi mellem 0 og " + (herolist.size() - 1)); }
            } } }
        System.out.println("ingen superhelte blev fundet \n");
        return null; }

    public int parseAsInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du indtastede ikke et hel-tal");
            }
        }
    }
    public double parseAsDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du indtastede ikke et komma-tal");
            }
        }
    }



}
