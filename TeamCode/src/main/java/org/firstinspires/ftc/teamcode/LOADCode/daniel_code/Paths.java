package org.firstinspires.ftc.teamcode.LOADCode.daniel_code;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

public class Paths {

    public Pose pose1 = new Pose(54, 20, 1);

    public PathChain Path1;
    public PathChain Path2;

    public Paths(Follower follower) {
        Path1 = follower.pathBuilder().addPath(
                        new BezierLine(
                                new Pose(72.000, 72.000),

                                new Pose(72.000, 100.000)
                        )
                ).setLinearHeadingInterpolation(Math.toRadians(90), Math.toRadians(180))

                .build();

        Path2 = follower.pathBuilder().addPath(
                        new BezierLine(
                                new Pose(72.000, 100.000),

                                new Pose(100.000, 72.000)
                        )
                ).setTangentHeadingInterpolation()

                .build();
    }
}
