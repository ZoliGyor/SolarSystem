public class Planet {
    private double distance;
    private double angle;
    private double diameter;
    private String colour;
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;

    public Planet(double distance, double angle, double diameter, String colour, double centreOfRotationDistance, double centreOfRotationAngle){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
    }

    public double getDistance(){
        return distance;
    }

    public double getAngle(){
        return angle;
    } 

    public double getDiameter(){
        return diameter;
    }

    public String getColour(){
        return colour;
    }

    public double getCentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    public double getCentreOfRotationAngle(){
        return centreOfRotationAngle;
    }

}
