package org.firstinspires.ftc.teamcode.LOADCode.juliet_code;

import org.firstinspires.ftc.teamcode.pedroPathing.Constants;

import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.extensions.pedro.FollowPath;
import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.ftc.NextFTCOpMode;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


@Autonomous (name = "julilet_Auto_1" )
public class juliet_auto extends NextFTCOpMode {
    {
        addComponents(new PedroComponent(Constants:: createFollower));
    }

    paths_julietCode paths;

    @Override public void onInit() {
        follower().setStartingPose(new Pose( 88, 7.1, Math.toRadians(90)));
        paths = new paths_julietCode(follower());
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