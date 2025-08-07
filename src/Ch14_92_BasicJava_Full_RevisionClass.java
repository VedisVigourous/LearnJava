import java.util.Scanner;

class Planet {
    String name;
    String galaxy;
    long population;
    double distancefromSun;
    static int NoofPlanetsDiscovered;

    Planet(String name , String galaxy , long population , double distancefromSun){ // All info related to Planets
        this.name = name;
        this.galaxy = name;
        this.population = population;
        this.distancefromSun = distancefromSun;
        NoofPlanetsDiscovered++;
    }

    void displayInfo(){
            System.out.println("~~ Welcome to Planet Desk ~~");
            System.out.println("Name of the Planet is: " + this.name);
            System.out.println("Galaxy of the Planet is: " + this.galaxy);
            System.out.println("Population of the Planet is: " + this.population);
            System.out.println("Distance of the Planet from the Sun is: " + this.distancefromSun);
            System.out.println("No of Plantes Discovered: " + NoofPlanetsDiscovered);
    }

    void isHabitable(){
        boolean Habitable = false;
        if (this.population > 0){
            Habitable = true;
        }
        if (Habitable){
            System.out.println("Is Planet Habitable?: " + Habitable);
        }
        else {
            System.out.println("Is Planet Habitable?: " + Habitable);
        }
    }
}

class SolarSystem {
    Scanner input = new Scanner(System.in);
    private Planet [] planets; // Creating a planets array of type Planet which is created above
    SolarSystem(){
        this.planets = new Planet[5]; // Memory Allocating the planets array.

        this.planets[0] = new Planet("Dozi59B" , "Dozi Ray" , 0 , 324.64);
        this.planets[1] = new Planet("Raymond" , "Milky Way" , 78929831l , 849.23);
        this.planets[2] = new Planet("Atomic59" , "Rock Sore" , 0 , 120.89);
        this.planets[3] = new Planet("Atomic60" , "Rock Sore" , 30498543 , 145.90);
    }

    Planet [] getPlanets(){ // Important Step: Used to access the array
        return planets;
    }

    void displayClassification(){
        System.out.println("Welcome to Planet Classificator: ");
        System.out.print("Enter the Name of Planet in Milky Way: "); String planetName = input.nextLine();
        switch (planetName){
            case "Mercury" -> System.out.println("Terrestrial planet and the smallest planet in our solar system");
            case "Venus" -> System.out.println("Terrestrial planet, known for its thick, toxic atmosphere and scorching surface temperatures");
            case "Earth" -> System.out.println("Unique, life-supporting, terrestrial planet in our solar system");
            case "Mars" -> System.out.println("Known as the Red Planet, known for its reddish appearance due to iron oxide");
            case "Jupiter" -> System.out.println("Gas giant planet, the largest in our solar system");
            case "Saturn" -> System.out.println("Famous for its prominent ring system made of ice and rock");
            case "Uranus" -> System.out.println("Ice giant, blue-green color and unique sideways rotation");
            case "Neptune" -> System.out.println("Farthest planet from the Sun in our solar system");
            default -> System.out.println("Enter a Planet present in Milky Way");
        }
    }
}
public class Ch14_92_BasicJava_Full_RevisionClass {

    static void calculateTravelTime(double distanceinLightYears){ // TypeCasting Practice
        double SpeedinKMperSec = 40000;
        double KMperLightYear = 9.461e12;

        double distanceInKM = distanceinLightYears*KMperLightYear;
        double timeINSecond = distanceInKM/SpeedinKMperSec;

        int timeInDays = (int) timeINSecond/(60*60*24);

        System.out.println("Days to Travel " + distanceinLightYears + " LightYears in Days: " + timeInDays);
    }

    static void scanPlanet(String planetName){ // String Methods
        if (planetName.contains("Alpha")){
            System.out.println("~" + planetName);
            System.out.println("This Planet is from Alpha Series , NEEDS EXCESSIVE RESEARCH");
            System.out.println();
        }
        else if (planetName.endsWith("S11")){
            System.out.println("~" + planetName);
            System.out.println("This is a SuperPlanet Series 11");
            System.out.println();
        }
        else {
            System.out.println("~~ No additional info for " + planetName + "~~");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();

        // Starting from the Very Beginning - LET'S REVISE
        SolarSystem solarSystemInfo = new SolarSystem();
        Planet[] planetInfo = solarSystemInfo.getPlanets(); // Accessing the planets defined in SolarSystem class in planetInfo array
        for (Planet planet : planetInfo){
            if (planet != null) {
                planet.displayInfo();
                planet.isHabitable();
                System.out.println();
            }
        }

        System.out.println("******************");
        calculateTravelTime(4.3);
        System.out.println("******************");

        System.out.println();

        System.out.println("******************");
        scanPlanet("Alpha8976");     // String Method practice -
        scanPlanet("Jupiter");
        scanPlanet("ZooniS11");
        System.out.println("******************");

        System.out.println("******************");
        solarSystemInfo.displayClassification();
        System.out.println("******************");
    }
}
