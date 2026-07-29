package org.firstinspires.ftc.teamcode.LOADCode.mr_morton_code;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.extensions.pedro.FollowPath;
import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.ftc.NextFTCOpMode;

@Autonomous(name ="Wayne's_Test")
public class Autowm extends NextFTCOpMode {
        {
            addComponents(
                    new PedroComponent(Constants::createFollower)
            );

        }
        Paths paths;

        @Override public void onInit() {
            follower().setStartingPose(new Pose(88, 7.1, Math.toRadians(90)));
            paths = new Paths(follower());
        }
        @Override public void onWaitForStart() { }
        @Override public void onStartButtonPressed() {
            new SequentialGroup(
                    new FollowPath(paths.MainChain)
            ).schedule();
        }
        @Override public void onUpdate() { }
        @Override public void onStop() { }
}
