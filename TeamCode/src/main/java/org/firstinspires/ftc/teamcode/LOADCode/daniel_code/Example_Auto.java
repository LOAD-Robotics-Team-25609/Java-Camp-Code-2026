package org.firstinspires.ftc.teamcode.LOADCode.daniel_code;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;

import dev.nextftc.core.commands.delays.Delay;
import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.extensions.pedro.FollowPath;
import dev.nextftc.extensions.pedro.PedroComponent;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import dev.nextftc.ftc.NextFTCOpMode;

@Autonomous(name = "Example_Auto")
public class Example_Auto extends NextFTCOpMode {
    @SuppressWarnings("unused")
    public Example_Auto() {
        addComponents(
                new PedroComponent(Constants::createFollower)
        );
    }

    Paths paths = null;

    @Override public void onInit() {
        follower().setStartingPose(new Pose(72, 72, Math.toRadians(90)));
        paths = new Paths(follower());
    }
    @Override public void onWaitForStart() {

    }
    @Override public void onStartButtonPressed() {
        new SequentialGroup(
            new FollowPath(paths.Path1),
                new Delay(2),
                new FollowPath(paths.Path2)
        ).schedule();
    }
    @Override public void onUpdate() {
        follower().update();
    }
    @Override public void onStop() {

    }
}
