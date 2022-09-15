package dk.kea;
import java.util.ArrayList;

public class Database {

    private String searchresult;
    private ArrayList<SuperHero> superHeroesdata = new ArrayList<>();

    public void addSuperHero(String superHeroName,String normalName,String superPower, String originYear, String strenght, String isHuman) {
    SuperHero superHero = new SuperHero(superHeroName, normalName, superPower, originYear, strenght, isHuman);
    superHeroesdata.add(superHero);
    }

    public ArrayList<SuperHero> getSuperHeroesdata() {
        return superHeroesdata;
    }

    /*public void editSuperHero() {
    superHeroesdata.set();
    this.superHeroesdata = superHeroesdata;
    }*/

    public SuperHero SearchForHero(String superHeroName){
        for (SuperHero object : superHeroesdata ) {
        if (object.getSuperHeroName().toLowerCase().contains(superHeroName.toLowerCase())){
            return object; }
        }
    return null;
    }

    public ArrayList<SuperHero> searchForHeroDatabase(String superHeroName){
        ArrayList<SuperHero> searchForHeroDatabase = new ArrayList<>();
        for (SuperHero object : superHeroesdata ) {
        if (object.getSuperHeroName().toLowerCase().contains(superHeroName.toLowerCase())){
            searchForHeroDatabase.add(object); }
        }
        return searchForHeroDatabase;
    }
}
