package org.firstinspires.ftc.teamcode.MikeTest;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles;
import org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms.RobotIMU;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchIMU;

@Autonomous
public class EmptyClass extends OpMode {
    RobotIMU myIMU = new RobotIMU();

    @Override
    public void init() {
        myIMU.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Starting Heading", myIMU.getStartingHeading());
    }
}
