package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init(){
        int teamNumber = 10698;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        // 1.
        //String name = "Coach Mike";
        String teamName = "Mad Mechanics";

        // 2.
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        // 1.
        //telemetry.addData("Name", name);
        telemetry.addData("Team Name", teamName);
        // 2.
        telemetry.addData("Motor Angle", motorAngle);
    }
    @Override
    public void  loop(){
    /*
    1. Change string variable "name" to team name
    2. Create an int called "MotorAngle" and store an angle between 0-180.
     */
    }
}
