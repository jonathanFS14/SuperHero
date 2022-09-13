package dk.kea;
import java.util.ArrayList;
public class Database {
    private ArrayList<SuperHeroes> superHeroesdata = new ArrayList<>();
    public void addSuperHero(String superHeroName, String normalName, String superPower) {
    SuperHeroes superHeroes = new SuperHeroes(superHeroName, normalName, superPower);
    superHeroesdata.add(superHeroes);
    }

    public ArrayList<SuperHeroes> getSuperHeroesdata() {
        return superHeroesdata;
    }
}
