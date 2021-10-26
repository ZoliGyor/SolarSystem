public class RevolvingObject extends ObjectInSolarSystem {
    private double distance;
    private double angle;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;

    public RevolvingObject(double distance, double angle, double diameter, String colour, double centreOfRotationDistance, double centreOfRotationAngle){ 
        super(diameter, colour); // do I need diameter and colour there???
        this.distance = distance;
        this.angle = angle;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
    }

    public double getDistance(){
        return distance;
    }

    public double getAngle(){
        return angle;
    } 

    public double getCentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    public double getCentreOfRotationAngle(){
        return centreOfRotationAngle;
    }

    public void setAngle(double value){
        angle += value; 
    }
}
