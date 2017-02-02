package com.java.sample;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by akanksha on 7/1/17.
 */

public class ElevatorActivity extends Activity {

    private ArrayList<Floor> floors;
    private int floorCount = 5;
    private int startCount = -1;
    private Elevator elevatorObj;
    private int stopTimer = 100;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        elevator();
        elevatorObj = new Elevator(startCount, true);
        press(0, true);
        Timer timer = new Timer();
        while (true) {
            if (stopTimer == 0) {
                break;
            }
            timer.schedule(elevator, stopTimer);
        }
    }

    private void elevator() {
        floors = new ArrayList<>();
        for (int i = startCount; i < floorCount; i++) {
            floors.add(new Floor(i, false, false)); //startcount
        }
    }

    TimerTask elevator = new TimerTask() {
        @Override
        public void run() {
            if (elevatorObj.isUp()) {
                elevatorObj.setFloor(elevatorObj.getFloor() + 1);
                if (floors.get(elevatorObj.getFloor() - startCount).isPressedUp()) {
                    stopTimer = 300;
                } else {
                    stopTimer = 100;
                }
                if (elevatorObj.getFloor() == floorCount - startCount - 1) {
                    elevatorObj.setUp(false);
                }
            } else {
                elevatorObj.setFloor(elevatorObj.getFloor() - 1);
                if (floors.get(elevatorObj.getFloor() - startCount).isPressedDown()) {
                    stopTimer = 300;
                } else {
                    stopTimer = 100;
                }
                if (elevatorObj.getFloor() == startCount) {
                    elevatorObj.setUp(true);
                }
            }
        }
    };

    private void press(int floor, boolean isUp) {
        if (isUp) {
            floors.get(floor - startCount).setPressedUp(true);
        } else {
            floors.get(floor - startCount).setPressedUp(true);
        }
    }

}
