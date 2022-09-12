package dk.kea;
public class SuperHeroes {

    private String SuperHeroName;
    private String NormalName;
    private String SuperPower;
    private String FullSuperHero;

    public SuperHeroes(String SuperHeroName,String NormalName,String SuperPower){
    this.SuperHeroName = SuperHeroName;
    this.NormalName = NormalName;
    this.SuperPower = SuperPower;
    }
    public SuperHeroes(String SuperHeroName,String SuperPower){
    this.SuperHeroName = SuperHeroName;
    this.SuperPower = SuperPower;
    }

    @Override
    public String toString() {
        FullSuperHero = (SuperHeroName + ", " + NormalName+ ", " + SuperPower);
        return FullSuperHero;
    }

}
