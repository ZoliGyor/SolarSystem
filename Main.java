public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1600, 1000);
        Simulation simulationSol = new Simulation(solarSystem);
        simulationSol.addSunToSolarSystem(new Sun(80, "YELLOW"));
        simulationSol.addPlanetToSolarSystem(new Planet(150, 180, 20, "BLUE", 0, 0));
        

        /*for(int i = 0; i < 720; i++){
            solarSystem.drawSolarObject(0, 0, 80, "YELLOW");
            solarSystem.drawSolarObjectAbout(150, i, 20, "BLUE", 0, 0);
            solarSystem.drawSolarObjectAbout(200, i-50, 15, "RED", 0, 0);
            solarSystem.drawSolarObjectAbout(20, -i, 10, "WHITE", 150, i);
            solarSystem.finishedDrawing();
        }*/
        
    }
}
