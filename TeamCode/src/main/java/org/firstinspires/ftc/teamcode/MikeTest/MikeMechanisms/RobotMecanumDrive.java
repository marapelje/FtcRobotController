package org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp
public class RobotMecanumDrive {
    private DcMotorEx driveMotorLF, driveMotorLB, driveMotorRF, driveMotorRB;
    IMU imu;

    public void init(HardwareMap hwMap) {
        driveMotorLF = hwMap.get(DcMotorEx.class, "LeftFront");
        driveMotorLB = hwMap.get(DcMotorEx.class, "LeftBack");
        driveMotorRF = hwMap.get(DcMotorEx.class, "RightFront");
        driveMotorRB = hwMap.get(DcMotorEx.class, "RightBack");

        driveMotorLF.setDirection(DcMotorSimple.Direction.REVERSE);
        driveMotorLB.setDirection(DcMotorSimple.Direction.REVERSE);

        driveMotorLF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        driveMotorRF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        driveMotorLB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        driveMotorRB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        imu = hwMap.get(IMU.class, "imu");
    }

    public void  drive(double foward, double strafe, double rotate){
        double lFPower = foward + strafe + rotate;
        double lBPower = foward - strafe + rotate;
        double rFPower = foward - strafe - rotate;
        double rBPower = foward + strafe - rotate;

        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(lFPower));
        maxPower = Math.max(maxPower, Math.abs(lBPower));
        maxPower = Math.max(maxPower, Math.abs(rFPower));
        maxPower = Math.max(maxPower, Math.abs(rBPower));

        driveMotorLF.setPower(maxSpeed * (lFPower / maxPower));
        driveMotorLB.setPower(maxSpeed * (lBPower / maxPower));
        driveMotorRF.setPower(maxSpeed * (rFPower / maxPower));
        driveMotorRB.setPower(maxSpeed * (rBPower / maxPower));

    }

    public void  driveFieldRelative(double forward, double strafe, double rotate){
        double theta = Math.atan2(forward, strafe);
        double r = Math.hypot(strafe, forward);

        theta = AngleUnit.normalizeRadians(theta - imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS));
        double newForward = r * Math.sin(theta);
        double newStrafe = r * Math.cos(theta);

        this.drive(newForward, newStrafe, rotate);
    }
}
