package dk.kea;
import java.util.ArrayList;

public class Database {
    private ArrayList<SuperHero> superHeroesdata = new ArrayList<>();

    public void addSuperHero(String superHeroName,String normalName,String superPower, int originYear, double strenght, String isHuman) {
    SuperHero superHero = new SuperHero(superHeroName, normalName, superPower, originYear, strenght, isHuman);
    superHeroesdata.add(superHero);
    }

    public ArrayList<SuperHero> getSuperHeroesdata() {
        return superHeroesdata;
    }

    public ArrayList<SuperHero> searchForHeroDatabase(String superHeroName){
        ArrayList<SuperHero> searchForHeroDatabase = new ArrayList<>();
        if (searchForHeroDatabase != null){
        for (SuperHero object : superHeroesdata ) {
        if (object.getSuperHeroName().toLowerCase().contains(superHeroName.toLowerCase())){
            searchForHeroDatabase.add(object); }
        } }
        return searchForHeroDatabase;
    }

}
