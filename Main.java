public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1600, 1000);
        Simulation simulationSol = new Simulation(solarSystem);

        ObjectInSolarSystem sun = new ObjectInSolarSystem(80, "YELLOW");
        simulationSol.addObjectInSolarSystem(sun);

        RevolvingObject earth = new RevolvingObject(150, 180, 20, "BLUE", 0, 0);
        simulationSol.addRevolvingObject(earth);

        RevolvingObject moon = new RevolvingObject(20, 180, 10, "WHITE", 150 , 180);
        simulationSol.addRevolvingObject(moon);

        
        /*for(int i = 0; i < 720; i++){
            solarSystem.drawSolarObject(0, 0, 80, "YELLOW");
            solarSystem.drawSolarObjectAbout(150, i, 20, "BLUE", 0, 0);
            solarSystem.drawSolarObjectAbout(200, i-50, 15, "RED", 0, 0);
            solarSystem.drawSolarObjectAbout(20, -i, 10, "WHITE", 150, i);
            solarSystem.finishedDrawing();
        }*/
        
    }
}
