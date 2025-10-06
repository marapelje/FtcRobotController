package org.firstinspires.ftc.teamcode.MikeTest.MikeMechanisms;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class TeleOpPoseInit {
    public static void initPose(SampleMecanumDrive drive){
        drive.setPoseEstimate(PoseStorage.currentPose);
    }
}
