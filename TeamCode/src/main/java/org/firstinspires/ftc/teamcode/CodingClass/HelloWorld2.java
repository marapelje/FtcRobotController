package org.firstinspires.ftc.teamcode.CodingClass;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
 //@Autonomous
@TeleOp
public class HelloWorld2 extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello ","Harrison" );
    }

    @Override
    public void loop() {

    }
}
