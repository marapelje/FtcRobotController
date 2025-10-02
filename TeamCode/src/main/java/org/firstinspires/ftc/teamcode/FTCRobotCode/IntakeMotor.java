package org.firstinspires.ftc.teamcode.FTCRobotCode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class IntakeMotor {
    private DcMotorEx dcMotor;

    public void init(HardwareMap hwMap, String deviceName){
        dcMotor =  hwMap.get(DcMotorEx.class, deviceName);
        dcMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void SetMotorSpeed(double speed){
        dcMotor.setVelocity(speed);
    }
}
