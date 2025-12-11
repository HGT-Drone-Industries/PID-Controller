// Open python repl
// Input:
// exec(open("C:/Users/KrutzlingerJakob/OneDrive - Hertzhaimer Gymnasium Trostberg/11a/P-Seminar Informatik/PID Controller Github Connection/PID-Controller/run.py").read())

public class Drone {
    static double xMovement;
    static double zMovement;
    static double setPoint;
    public Drone(){
        double xMovement = 0;
        double zMovement = 0;
        double setPoint = 0;
    }


    public static void main(String[] args) {
        System.out.println("Starting.");
        setPoint = returnSetpoint(setPoint);
        System.out.println("Setpoint: " + setPoint);
    }


    public static double returnSetpoint(double newSetpoint){
        newSetpoint = Math.round(Math.random() * 1000);
        //the following sets the range of the random number starting at 0, e. g 0 to 255 
        while (newSetpoint > 255){
            newSetpoint = newSetpoint - 255;
        }
        return newSetpoint;
    }

}