package dk.kea;
public class SuperHero {

    private String superHeroName;
    private String normalName;
    private String superPower;
    private int originYear;
    private double strenght;
    private String isHuman;

    public SuperHero(String superHeroName, String normalName, String superPower, int originYear, double strenght, String isHuman){
    this.superHeroName = superHeroName;
    this.normalName = normalName;
    this.superPower = superPower;
    this.originYear = originYear;
    this.strenght = strenght;
    this.isHuman = isHuman;
    }

    public String toString(){
        String FullSuperHero = "Superhelte navn: " + superHeroName + "\n" + "Borgerlige navn: " + normalName + "\n" + "Super kræft: " + superPower + "\n" + "Oprindelses år: " + originYear + "\n" + "Styrke 1-100: " + strenght + "\n" + "Er et menneske: " + isHuman + "\n";
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

    public int getOriginYear() {
        return originYear;
    }
    public void setOriginYear(int originYear) {
        this.originYear = originYear;
    }

    public double getStrenght() {
        return strenght;
    }
    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }

    public String getIsHuman() {
        return isHuman;
    }
    public void setHuman(String human) {
        isHuman = human;
    }
}
