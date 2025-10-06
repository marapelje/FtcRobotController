package org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;



public class AutoPoseSaver {
    public static void savePose(SampleMecanumDrive drive){
        PoseStorage.currentPose = drive.getPoseEstimate();
    }
}
