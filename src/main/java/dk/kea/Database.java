package dk.kea;
public class Database {

    private String database;
    private SuperHeroes[] superHeroes = new SuperHeroes[5];
    public Database(){
    superHeroes[0] = new SuperHeroes(" "," "," ");
    superHeroes[1] = new SuperHeroes(" "," "," ");
    superHeroes[2] = new SuperHeroes(" "," "," ");
    superHeroes[3] = new SuperHeroes(" "," "," ");
    superHeroes[4] = new SuperHeroes(" "," "," ");
    }

    public String getDatabase() {
        return database;
    }
}
