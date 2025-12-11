// Open python repl
// Input:
// exec(open("C:/Users/KrutzlingerJakob/OneDrive - Hertzhaimer Gymnasium Trostberg/11a/P-Seminar Informatik/PID Controller Github Connection/PID-Controller/run.py").read())

public class Drone {
    static double xRotation; //actual rotation
    static double setPoint; //desired rotation
    static int error; //difference between desired and actual rotation
    static int looptime; //in ms

    public Drone(){
        xRotation = 0;
        setPoint = 0;
        error = 0; 
        looptime = 1000;
    }

    public static void main(String[] args) {
        System.out.println("Starting.");
        setPoint = returnSetpoint(setPoint);
        System.out.println("Setpoint: " + setPoint);
    }

    public static double returnSetpoint(double newSetpoint){
        newSetpoint = Math.round(Math.random() * 1000);
        //the following sets the range of the random number starting at 0, e. g 0 to 255
        //at most 1000!
        while (newSetpoint > 255){
            newSetpoint = newSetpoint - 255;
        }
        return newSetpoint;
    }

}