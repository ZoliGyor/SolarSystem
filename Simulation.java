public class Simulation {
    private SolarSystem solarSystem;

    public Simulation(SolarSystem solarSystem){
        this.solarSystem = solarSystem;
    }

    public void addSunToSolarSystem(Sun sun){
        solarSystem.drawSolarObject(0, 0, sun.getDiameter(), sun.getColour());
    }

    public void addPlanetToSolarSystem(Planet planet){
        solarSystem.drawSolarObjectAbout(planet.getDistance(), planet.getAngle(), planet.getDiameter(), planet.getColour(), planet.getCentreOfRotationDistance(), planet.getCentreOfRotationAngle());
    }
}
