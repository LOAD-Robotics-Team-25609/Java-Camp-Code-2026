package org.firstinspires.ftc.teamcode.LOADCode.juliet_code;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierCurve;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

public class paths_julietCode {
    public PathChain MainChain;

    public paths_julietCode(Follower follower) {
        MainChain = follower.pathBuilder()
                .addPath(
                        new BezierCurve(
                                new Pose(88.000, 7.100),
                                new Pose(80.000, 30.000),
                                new Pose(128.597, 36.742)
                        )
                )
                .setLinearHeadingInterpolation(Math.toRadians(90), Math.toRadians(180))
                .addPath(
                        new BezierCurve(
                                new Pose(128.597, 36.742),
                                new Pose(20.000, 100.000),
                                new Pose(85.731, 93.604)
                        )
                )
                .setTangentHeadingInterpolation()
                .build();
    }
}
