package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocationPractice robotLocationPractice = new RobotLocationPractice(0);

    @Override
    public void init(){
        robotLocationPractice.setAngle(0);
        robotLocationPractice.setX(0);

    }

    @Override
    public void loop(){
        if(gamepad1.a){
            robotLocationPractice.turnRobot(0.1);
        } else if (gamepad1.b) {
            robotLocationPractice.turnRobot(-0.1);
        }

        // 4.
        if(gamepad1.dpad_left){
            robotLocationPractice.changeX(0.1);
        } else if (gamepad1.dpad_right){
            robotLocationPractice.changeX(-0.1);
        }

        // 5.
        if(gamepad1.dpad_up){
            robotLocationPractice.changeY(-0.1);
        } else if (gamepad1.dpad_up){
            robotLocationPractice.changeY(0.1);
        }

        telemetry.addData("Heading", robotLocationPractice.getHeading());
        // 2.
        telemetry.addData("Angle", robotLocationPractice.getAngle());
        // 4.
        telemetry.addData("X value", robotLocationPractice.getX());
        // 5.
        telemetry.addData("Y value", robotLocationPractice.getY());
    }
}

/*
1. Use class to change angle pressing a & b buttons.a
2. add double getAngle to RobotLocationPractice and display in opmode
3. in RobotLocationPractice class, create double x, double getX, double setX, method changeX(changeAmount), setX
4. in Opmode when ldpad pressed + 0.1 to x, rdpad pressed -0.1 to x, telemetry x value
5. in opmode when udpad pressed -0.1 to x, ddpad pressed 0.1 to x, telemetry y vale
 */