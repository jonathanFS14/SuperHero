package dk.kea;
public class SuperHeroes {

    private String superHeroName;
    private String normalName;
    private String superPower;
    //private String FullSuperHero;

    public SuperHeroes(String superHeroName,String normalName,String superPower){
    this.superHeroName = superHeroName;
    this.normalName = normalName;
    this.superPower = superPower;
    }

    public SuperHeroes(){

    }

    /*public String getFullSuperHero() {
        FullSuperHero = (superHeroName + ", " + normalName + ", " + superPower);
        return FullSuperHero;
    }*/

    public String getSuperHeroName(){
        return superHeroName;
    }
    public void setSuperHeroName(String superHeroName){
        this.superHeroName = superHeroName;
    }

    public String getNormalName(){
        return normalName;
    }
    public void setNormalName(String normalName){
        this.normalName = normalName;
    }

    public String getSuperPower(){
        return superPower;
    }
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }

}
