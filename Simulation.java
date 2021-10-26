public class Simulation {
    private SolarSystem solarSystem;

    public Simulation(SolarSystem solarSystem){
        this.solarSystem = solarSystem;
    }

    public void addObjectInSolarSystem(ObjectInSolarSystem objectInSolarSystem){
        solarSystem.drawSolarObject(0, 0, objectInSolarSystem.getDiameter(), objectInSolarSystem.getColour());
    }

    public void addRevolvingObject(RevolvingObject revolvingObject){
        solarSystem.drawSolarObjectAbout(revolvingObject.getDistance(), revolvingObject.getAngle(), revolvingObject.getDiameter(), revolvingObject.getColour(), revolvingObject.getCentreOfRotationDistance(), revolvingObject.getCentreOfRotationAngle());
    }
}
