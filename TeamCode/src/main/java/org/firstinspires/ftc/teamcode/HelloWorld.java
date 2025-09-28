package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// 3. Instead of running at TeleOp run at Auto
//@TeleOp

@Disabled
@Autonomous
public class HelloWorld extends OpMode {
    @Override
    public void init(){
        // 1. Hello: World
        //telemetry.addData("Hello", "World");

        // 2. Hello: <Your Name>
        telemetry.addData("Hello", "Mike");
    }

    @Override
    public void loop(){

    }
}
