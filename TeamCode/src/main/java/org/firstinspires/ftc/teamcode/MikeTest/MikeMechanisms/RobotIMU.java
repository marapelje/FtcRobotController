package org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles;

public class RobotIMU {
    private IMU imu;
    //private static double initHeading;
    private YawPitchRollAngles orientation;
    private double finalYaw;

    public void init(HardwareMap hwMap){
        imu = hwMap.get(IMU.class, "imu");

        RevHubOrientationOnRobot RevOrientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.RIGHT,
                RevHubOrientationOnRobot.UsbFacingDirection.UP
        );

        imu.initialize(new IMU.Parameters(RevOrientation));
        //initHeading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS);
    }


}
