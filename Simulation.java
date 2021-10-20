public class Simulation {
    private SolarSystem solarSystem;

    public Simulation(SolarSystem solarSystem){
        this.solarSystem = solarSystem;
    }

    public void addSunToSolarSystem(Sun sun){
        solarSystem.drawSolarObject(0, 0, sun.getDiameter(), sun.getColour());
    }
}
