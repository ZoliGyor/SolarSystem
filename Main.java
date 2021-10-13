public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1600, 1000);
        solarSystem.drawSolarObject(0, 0, 80, "YELLOW");
        solarSystem.drawSolarObject(240, 210, 20, "BLUE"); // this and the below line are basically doing the same thing
        //solarSystem.drawSolarObjectAbout(240, 180, 20, "BLUE", 180, 30);
        
    }
}
