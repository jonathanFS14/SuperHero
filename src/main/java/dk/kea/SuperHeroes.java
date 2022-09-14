package dk.kea;
public class SuperHeroes {

    private String superHeroName;
    private String normalName;
    private String superPower;
    private String originYear;
    private String strenght;
    private String isHuman;

    public SuperHeroes(String superHeroName,String normalName,String superPower, String originYear, String strenght, String isHuman){
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

    public String getOriginYear() {
        return originYear;
    }
    public void setOriginYear(String originYear) {
        this.originYear = originYear;
    }

    public String getStrenght() {
        return strenght;
    }
    public void setStrenght(String strenght) {
        this.strenght = strenght;
    }

    public String getIsHuman() {
        return isHuman;
    }
    public void setHuman(String human) {
        isHuman = human;
    }
}
