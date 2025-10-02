package org.firstinspires.ftc.teamcode.FTCRobotCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.FTCRobotCode.TestSpin;


@TeleOp
public class MikeSpin extends OpMode {
    TestSpin spin = new TestSpin();

    @Override
    public void init() {
        spin.init(hardwareMap);

    }

    @Override
    public void loop() {

        if(gamepad1.a) {
            //spin.SetMotorSpeed(1);
            //spin.SetMotorSpeed(2688);
            spin.SetMotorSpeed(6000);
        } else {
            //spin.SetMotorSpeed(0);
            spin.SetMotorSpeed(0);
        }
        telemetry.addData("Motor1 Revs", spin.getMotorRevs1());
        telemetry.addData("Motor2 Revs", spin.getMotorRevs2());
    }
}
