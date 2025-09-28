package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;
    double x;
    double y;

    // constructor method
    public  RobotLocationPractice(double angle){
        this.angle = angle;
    }

    public double getHeading(){
        // This method normalized robot heading between -180 to 180
        // useful for calculating turn angles when crossing 0, 360 boundary
        double angle = this.angle; // copy angle of imu

        while (angle > 180){
            angle -= 360; // subtract until in target range
        }

        while (angle <= -180){
            angle += 360; // add until in target range
        }
        return angle; //return normalized vale
    }

    public void turnRobot(double angleChange){
        angle += angleChange;
    }

    public void setAngle(double angle){
        this.angle = angle;
    }

    // 2.
    public double getAngle(){
        return this.angle;
    }

    // 3.
     public void changeX(double changeAmout){
        x += changeAmout;
     }

     public void setX(double x){
        this.x = x;
     }

     public double getX(){
        return this.x;
     }

    // 5.
    public void changeY(double changeAmout){
        y += changeAmout;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY() {
        return this.y;
    }
}
