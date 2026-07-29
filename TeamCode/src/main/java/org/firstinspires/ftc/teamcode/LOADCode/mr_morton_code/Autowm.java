package org.firstinspires.ftc.teamcode.LOADCode.mr_morton_code;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

import com.pedropathing.geometry.Pose;

import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.ftc.NextFTCOpMode;

public class Autowm extends NextFTCOpMode {
        {
            addComponents(
                    new PedroComponent(Constants::createFollower)
            );

        }

        @Override public void onInit() {
            follower().setStartingPose(new Pose(88, 7.1, Math.toRadians(90)));
        }
        @Override public void onWaitForStart() { }
        @Override public void onStartButtonPressed() { }
        @Override public void onUpdate() { }
        @Override public void onStop() { }
}
