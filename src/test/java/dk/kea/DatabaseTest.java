package dk.kea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database;
    @org.junit.jupiter.api.BeforeEach
     void setup() {
        database = new Database();
        SuperHero superhero1 = new SuperHero("Superman", "Clark kent", "Flyve", 1939, 100, "nej");
        SuperHero superhero2 = new SuperHero("Spiderman", "Peter Parker", "Spider-sense", 1956, 45, "ja");
        SuperHero superhero3 = new SuperHero("Batman", "Bruce Wayne", "batmobile", 1976, 4, "ja");
        database.getSuperHeroesdata().add(superhero1);
        database.getSuperHeroesdata().add(superhero2);
        database.getSuperHeroesdata().add(superhero3); }
    @org.junit.jupiter.api.Test
    void addSuperHero() {
    assertEquals(database.getSize(), 3);
    }
    @org.junit.jupiter.api.Test
    void searchForHeroDatabase() {
    assertEquals(database.searchForHeroDatabase("Superman").get(0).getSuperHeroName(),"Superman");
    }

    @Test
    void deleteHero (){

    }


}
