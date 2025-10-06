package org.firstinspires.ftc.teamcode.MikeTest;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms.AutoPoseSaver;
import org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms.RobotIMU;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;


@Autonomous(group = "drive")
public class EmptyClass extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d startPose = new Pose2d(-36, 60, Math.toRadians(270));

        telemetry.addLine("Ready to run");
        telemetry.update();
        waitForStart();

        telemetry.addData("Final Pose", drive.getPoseEstimate());
        telemetry.update();
        sleep(2000);

        if(isStopRequested()) return;



        drive.followTrajectory(
                drive.trajectoryBuilder(startPose)
                        .strafeLeft(12)
                        .build()
        );

        drive.turn(Math.toRadians(90));



        AutoPoseSaver.savePose(drive);
        telemetry.addData("Final Pose", drive.getPoseEstimate());
        telemetry.update();
        sleep(2000);

    }
}
