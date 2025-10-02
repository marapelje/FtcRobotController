package org.firstinspires.ftc.teamcode.FTCRobotCode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestSpin {
    private DcMotorEx motor1, motor2;
    private double ticksPerRev1;
    private double ticksPerRev2;

    public void init(HardwareMap hwMap){
        motor1 = hwMap.get(DcMotorEx.class, "LeftFront");
        motor2 = hwMap.get(DcMotorEx.class, "LeftBack");
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev1 = motor1.getMotorType().getTicksPerRev();
        ticksPerRev2 = motor1.getMotorType().getTicksPerRev();

    }

    public void SetMotorSpeed(double speed){
        //motor1.setPower(speed);
        //motor2.setPower(speed);
        motor1.setVelocity(speed);
        motor2.setVelocity(speed);

    }

    public double getMotorRevs1(){
        return motor1.getCurrentPosition() / ticksPerRev1;
    }

    public double getMotorRevs2(){
        return motor2.getCurrentPosition() / ticksPerRev2;
    }
}
