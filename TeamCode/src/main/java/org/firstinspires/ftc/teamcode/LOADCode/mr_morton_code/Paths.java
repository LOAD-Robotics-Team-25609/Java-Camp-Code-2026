package org.firstinspires.ftc.teamcode.LOADCode.mr_morton_code;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierCurve;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

public class Paths {
    public PathChain MainChain;

    public Paths(Follower follower) {
        MainChain = follower.pathBuilder()
                .addPath(
                        new BezierCurve(
                                new Pose(88.000, 7.100),
                                new Pose(96.029, 40.706),
                                new Pose(127.052, 34.188)
                        )
                )
                .setLinearHeadingInterpolation(Math.toRadians(90), Math.toRadians(0))
                .addPath(
                        new BezierCurve(
                                new Pose(127.052, 34.188),
                                new Pose(48.106, 79.103),
                                new Pose(127.127, 81.791)
                        )
                )
                .setConstantHeadingInterpolation(Math.toRadians(0))
                .build();
    }
}