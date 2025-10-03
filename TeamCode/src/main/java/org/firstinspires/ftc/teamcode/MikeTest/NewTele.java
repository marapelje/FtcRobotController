package org.firstinspires.ftc.teamcode.MikeTest;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms.RobotIMU;
import org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms.RobotMecanumDrive;
import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

@TeleOp
public class NewTele  extends OpMode {
    RobotMecanumDrive drive = new RobotMecanumDrive();
    double forward, strafe, rotate;

    @Override
    public void init(){
        drive.init(hardwareMap);
        telemetry.addData("mike","me");
    }

    @Override
    public void loop(){
        forward = gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x * -1;
        rotate = gamepad1.right_stick_x * -1;


        drive.driveFieldRelative(forward, strafe, rotate);

    }
}
