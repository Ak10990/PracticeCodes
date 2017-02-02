package com.java.sample;

/**
 * Created by akanksha on 7/1/17.
 */
public class Elevator {

    private int floor;
    private boolean isUp;

    public Elevator(int floor, boolean isUp) {
        this.floor = floor;
        this.isUp = isUp;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setUp(boolean up) {
        isUp = up;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isUp() {
        return isUp;
    }
}
