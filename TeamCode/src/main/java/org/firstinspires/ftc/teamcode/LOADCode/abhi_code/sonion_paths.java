package org.firstinspires.ftc.teamcode.LOADCode.abhi_code;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierCurve;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

public class sonion_paths {
    public PathChain MainChain;

    public sonion_paths(Follower follower) {
        MainChain = follower.pathBuilder()
                .addPath(
                        new BezierCurve(
                                new Pose(88.000, 7.100),
                                new Pose(97.113, 39.973),
                                new Pose(133.003, 34.283)
                        )
                )
                .setLinearHeadingInterpolation(Math.toRadians(90), Math.toRadians(0))
                .addPath(
                        new BezierCurve(
                                new Pose(133.003, 34.283),
                                new Pose(73.325, 62.289),
                                new Pose(73.570, 101.527)
                        )
                )
                .setConstantHeadingInterpolation(Math.toRadians(0))
                .build();
    }
}
