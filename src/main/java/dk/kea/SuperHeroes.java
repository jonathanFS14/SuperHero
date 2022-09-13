package dk.kea;
public class SuperHeroes {

    private String superHeroName;
    private String normalName;
    private String superPower;

    public SuperHeroes(String superHeroName,String normalName,String superPower){
    this.superHeroName = superHeroName;
    this.normalName = normalName;
    this.superPower = superPower;
    }

    public String toString(){
        String FullSuperHero = "Superhelte navn: " + superHeroName + "\n" + "Borgerlige navn: " + normalName + "\n" + "Super kræft: " + superPower + "\n" + "\n";
        return FullSuperHero;
    }

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
