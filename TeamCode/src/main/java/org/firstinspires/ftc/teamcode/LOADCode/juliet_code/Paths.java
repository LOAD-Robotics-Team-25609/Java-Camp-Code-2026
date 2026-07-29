package org.firstinspires.ftc.teamcode.LOADCode.juliet_code;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierCurve;
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

public  class Paths {
    public PathChain MainChain;

    public Paths(Follower follower) {
        MainChain = follower.pathBuilder()
                .addPath(
                        new BezierCurve(
                                new Pose(88.000, 7.100),
                                new Pose(90.000, 90.000),
                                new Pose(123.348, 83.107)
                        )
                )
                .setLinearHeadingInterpolation(Math.toRadians(90), Math.toRadians(0))
                .addPath(
                        new BezierCurve(
                                new Pose(123.348, 83.107),
                                new Pose(102.469, 81.467),
                                new Pose(87.590, 87.827)
                        )
                )
                .setConstantHeadingInterpolation(Math.toRadians(0))
                .addPath(
                        new BezierCurve(
                                new Pose(87.590, 87.827),
                                new Pose(50.000, 71.807),
                                new Pose(123.720, 58.037)
                        )
                )
                .setConstantHeadingInterpolation(Math.toRadians(0))
                .addPath(
                        new BezierLine(
                                new Pose(123.720, 58.037),
                                new Pose(70.859, 86.606)
                        )
                )
                .setTangentHeadingInterpolation()
                .addPath(
                        new BezierCurve(
                                new Pose(70.859, 86.606),
                                new Pose(81.764, 30.000),
                                new Pose(125.566, 34.630)
                        )
                )
                .setConstantHeadingInterpolation(Math.toRadians(0))
                .addPath(
                        new BezierLine(
                                new Pose(125.566, 34.630),
                                new Pose(74.140, 100.821)
                        )
                )
                .setTangentHeadingInterpolation()
                .build();
    }
}