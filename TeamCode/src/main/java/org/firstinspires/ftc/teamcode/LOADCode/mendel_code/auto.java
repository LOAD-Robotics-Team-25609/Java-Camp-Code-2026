package org.firstinspires.ftc.teamcode.LOADCode.mendel_code;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

import com.pedropathing.geometry.Pose;

import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.ftc.NextFTCOpMode;

public class auto extends NextFTCOpMode {
    {
        addComponents(
                new PedroComponent(Constants::createFollower)
        );
    }

    guardedfoil guardedfoil;

    @Override public void onInit() {
        follower().setStartingPose(new Pose(88,7.1, Math.toRadians(90)));
        guardedfoil = new guardedfoil(follower());
    }
    @Override public void onWaitForStart() { }
    @Override public void onStartButtonPressed() {
        new SequentialGroup(

        ).schedule();
    }
    @Override public void onUpdate() { }
    @Override public void onStop() { }
}
