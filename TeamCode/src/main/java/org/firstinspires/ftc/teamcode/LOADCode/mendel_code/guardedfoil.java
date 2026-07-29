package org.firstinspires.ftc.teamcode.LOADCode.mendel_code;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierCurve;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

public  class guardedfoil {
    public PathChain MainChain;

    public guardedfoil(Follower follower) {
        MainChain = follower.pathBuilder()
                .addPath(
                        new BezierCurve(
                                new Pose(88.000, 7.100),
                                new Pose(98.476, 45.892),
                                new Pose(132.322, 30.786)
                        )
                )
                .setLinearHeadingInterpolation(Math.toRadians(90), Math.toRadians(0))
                .addPath(
                        new BezierCurve(
                                new Pose(132.322, 30.786),
                                new Pose(124.084, 96.060),
                                new Pose(55.409, 43.241),
                                new Pose(38.029, 130.479),
                                new Pose(99.632, 46.551),
                                new Pose(87.753, 119.680)
                        )
                )
                .setLinearHeadingInterpolation(Math.toRadians(0), Math.toRadians(0))
                .build();
    }
}
