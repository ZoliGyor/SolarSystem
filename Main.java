public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1200, 800);
        Simulation simulationSol = new Simulation(solarSystem);

        ObjectInSolarSystem sun = new ObjectInSolarSystem(80, "YELLOW");
        simulationSol.addObjectInSolarSystem(sun);

        RevolvingObject earth = new RevolvingObject(150, 180, 20, "BLUE", 0, 0, true);
        simulationSol.addRevolvingObject(earth, true);

        RevolvingObject moon = new RevolvingObject(20, 180, 10, "WHITE", 150 , 180, false);
        simulationSol.addRevolvingObject(moon, true);

        simulationSol.startAnimation(sun); 
    }
}
