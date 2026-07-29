package org.firstinspires.ftc.teamcode.LOADCode.juliet_code;

import org.firstinspires.ftc.teamcode.Devices;
import org.firstinspires.ftc.teamcode.pedroPathing.Constants;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.commands.groups.SequentialGroup;
import dev.nextftc.core.commands.utility.InstantCommand;
import dev.nextftc.core.commands.utility.LambdaCommand;
import dev.nextftc.extensions.pedro.FollowPath;
import dev.nextftc.extensions.pedro.PedroComponent;
import dev.nextftc.ftc.NextFTCOpMode;
import static dev.nextftc.extensions.pedro.PedroComponent.follower;

import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@Autonomous (name = "julilet_Auto_1" )
public class juliet_auto extends NextFTCOpMode {
    {
        addComponents(new PedroComponent(Constants:: createFollower));
    }

    Devices.DcMotorExClass intake= new Devices.DcMotorExClass();

    Command setIntakeMode(boolean on){
        return new InstantCommand(new LambdaCommand("setIntake")
                .setStart(()-> {
                    if (on) {
                        intake.setPower(1);
                    }else{
                        intake.setPower(0);
                    }
                })
        );
    }
    paths_julietCode paths;

    @Override public void onInit() {
        follower().setStartingPose(new Pose( 88, 7.1, Math.toRadians(90)));
        paths = new paths_julietCode(follower());
        intake.init(this, "intake");
        intake.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    @Override public void onWaitForStart() { }
    @Override public void onStartButtonPressed() {
        new SequentialGroup(
                setIntakeMode(true),
                new FollowPath(paths.MainChain),
                setIntakeMode(false)

        ).schedule();
    }
    @Override public void onUpdate() { }
    @Override public void onStop() { }
}