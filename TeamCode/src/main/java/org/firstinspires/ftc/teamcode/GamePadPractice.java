package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init(){

    }

    @Override
    public void loop(){
        //runs 50x per second.
        double speedFoward = -gamepad1.left_stick_y / 2.0;
        double diffXJoystick = gamepad1.left_stick_x - gamepad1.right_stick_y;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("Left X", gamepad1.left_stick_x);
        // 1.
        //telemetry.addData("Y", gamepad1.left_stick_y);
        telemetry.addData("Left Y", speedFoward);
        // 2.
        telemetry.addData("Right X", gamepad1.right_stick_x);
        telemetry.addData("Right Y", gamepad1.right_stick_y);

        // 4.
        telemetry.addData("Difference in X", diffXJoystick);

        telemetry.addData("A Button", gamepad1.a);

        // 3.
        telemetry.addData("B", gamepad1.b);

        // 5.
        telemetry.addData("Sum of Triggers", sumTriggers);



        /*
            1. Change y to new speed.
            2. Add telemetry for right jotystick
            3. add telemetry for b button
            4. add telemetry data to report difference between x left and x right
            5. add telemetry data to add sum of both rear triggers.
         */
    }
}
