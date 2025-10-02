package org.firstinspires.ftc.teamcode.FTCRobotCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IntakeTest extends OpMode {
    IntakeMotor intakeMotor = new IntakeMotor();

    @Override
    public void init() {
        intakeMotor.init(hardwareMap, "Extend");

    }

    @Override
    public void loop() {

        if(gamepad1.a) {
            intakeMotor.SetMotorSpeed(200);
        } else {
            intakeMotor.SetMotorSpeed(0);
        }
    }
}
