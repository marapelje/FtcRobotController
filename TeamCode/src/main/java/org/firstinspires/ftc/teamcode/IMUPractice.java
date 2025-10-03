package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchIMU;

//@Disabled
@TeleOp
public class IMUPractice extends OpMode {
    TestBenchIMU bench = new TestBenchIMU();
    double heading;

    @Override
    public void init(){
        bench.init(hardwareMap);
        //telemetry.addData("Heading", bench.getHeading(AngleUnit.DEGREES));
        //telemetry.addData("Heading Radians", bench.getHeading(AngleUnit.RADIANS));
    }

    @Override
    public void loop(){
        telemetry.addData("Heading", bench.getHeading(AngleUnit.DEGREES));
        // 1.
        telemetry.addData("Heading Radians", bench.getHeading(AngleUnit.RADIANS));
        // 2.
        heading = bench.getHeading(AngleUnit.DEGREES);
        if (heading < 0.5 && heading > -0.5){
            bench.setMotor(0);
        } else if (heading > 0.5) {
            bench.setMotor(0.5);
            
        }else{
            bench.setMotor(-0.5);
        }



    }
}

/*
1. return heading in radians
2. when heading is <0.5  && > 0.5, stop motor. If < -0.5 make motor positive, if > 0.5 make motor negative
 */
