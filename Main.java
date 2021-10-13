public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(1600, 1000);
        
        //solarSystem.drawSolarObject(240, 210, 20, "BLUE"); // this and the below line are basically doing the same thing
        
        for(int i = 0; i < 720; i++){
            solarSystem.drawSolarObject(0, 0, 80, "YELLOW");
            solarSystem.drawSolarObjectAbout(150, i, 20, "BLUE", 0, 0);
            solarSystem.finishedDrawing();
        }
        
    }
}
