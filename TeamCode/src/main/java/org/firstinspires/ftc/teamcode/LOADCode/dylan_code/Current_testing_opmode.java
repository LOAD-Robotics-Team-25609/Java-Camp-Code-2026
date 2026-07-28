package org.firstinspires.ftc.teamcode.LOADCode.dylan_code;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;
import org.firstinspires.ftc.teamcode.mechanisms.Dylan_current_testing_pro_board;
@TeleOp()
public class Current_testing_opmode extends OpMode {
    Dylan_current_testing_pro_board board = new Dylan_current_testing_pro_board();
    private CurrentUnit CurrentUnit;


    public void init(){
        board.init(hardwareMap);
}

public void loop(){
        if(gamepad1.a) {
            board.setMotorSpeed(1);
        }
        else{
            board.setMotorSpeed(0.0);
        }
        telemetry.addData("Motor rotations", board.getMotorRotations());

    telemetry.addData("Motor Amps", board.getCurrentAmps(CurrentUnit));
    telemetry.update();
    }
}

