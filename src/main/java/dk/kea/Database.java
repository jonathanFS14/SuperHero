package dk.kea;
import java.util.ArrayList;
public class Database {
    private ArrayList<SuperHeroes> superHeroesdata = new ArrayList<>();
    public void addSuperHero(String superHeroName,String normalName,String superPower, String originYear, String strenght, String isHuman) {
    SuperHeroes superHeroes = new SuperHeroes(superHeroName, normalName, superPower, originYear, strenght, isHuman);
    superHeroesdata.add(superHeroes);
    }

    public ArrayList<SuperHeroes> getSuperHeroesdata() {
        return superHeroesdata;
    }

    public SuperHeroes SearchForHero(String superHeroName){
        for (SuperHeroes object : superHeroesdata ) {
        if (object.getSuperHeroName().contains(superHeroName)){
            return object;}
        }
    return null;
    }
}
