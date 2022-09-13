package dk.kea;
public class Database {


    public SuperHeroes[] superHeroesdata = new SuperHeroes[5];
    int n = 0;
    public void TilføjSuperHero(String superHeroName, String normalName, String superPower) {

    SuperHeroes superHeroes = new SuperHeroes(superHeroName, normalName, superPower);

    superHeroesdata[n] = superHeroes;

    n++;
    }

}
