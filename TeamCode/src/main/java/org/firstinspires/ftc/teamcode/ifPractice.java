package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class ifPractice extends OpMode {
    @Override
    public void init(){

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;  //press true, depress false
        double leftY = gamepad1.left_stick_y;
        double motorSpeed = gamepad1.left_stick_y;


        // 5.
        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick", "is in deadzone");
        }
        telemetry.addData("Left stick value", leftY);

        // 6.
        if (!aButton){
            motorSpeed *= 0.5;
            telemetry.addData("Turbo Speed", "disabled");
        }else {
            telemetry.addData("Turbo Speed", "enabled");
        }

        telemetry.addData("Left stick value", motorSpeed);
    }
        /*
        if (aButton){
            telemetry.addData("A Button", "Pressed!");
        }
        // 1.
        else {
            telemetry.addData("A Button", "Not Pressed");
        }
        telemetry.addData("A Button State", aButton);

        // 2.
        if(leftY < 0) {
            telemetry.addData("Left Stick", "is Negative");
        }
        // 4.
        else if (leftY > 0.5) {
            telemetry.addData("Left Stick", "is greater than 50%");
        }
        // 3.
        else if (leftY > 0) {
            telemetry.addData("Left Stick", "is greater than 0");
        }
         else{
            //telemetry.addData("Left Stick", "is Positive!");
            telemetry.addData("Left Stick", "is 0");
        }
        telemetry.addData("Left Stick Value", leftY);
    }
    */
    /*
        1. Else a not pressed
        2. If Else Y stick is positive/negative
        3. Else if Y > 0
        4. else if y > .5
        5. deadzone
        6. turbo button. if A not pressed then multiply motor speed by .05, else standard speed


        And - &&
        Or - ||
        Not - !
     */
    }
