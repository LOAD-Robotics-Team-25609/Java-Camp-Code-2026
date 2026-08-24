package org.firstinspires.ftc.teamcode.LOADCode;

import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;

import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.ftc.NextFTCOpMode;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

@Autonomous(name = "julietauto")
public class Juliet_auto extends NextFTCOpMode {
    {
        addComponents(
                new PedroComponent(Constants::createFollower)
        );
    }

    @Override public void onInit() {
        follower().setStartingPose(new Pose(72,72, Math.toRadians(90)));
    }
    @Override public void onWaitForStart() { }
    @Override public void onStartButtonPressed() {
        new SequentialGroup();
    }
    @Override public void onUpdate() { }
    @Override public void onStop() { }
}
