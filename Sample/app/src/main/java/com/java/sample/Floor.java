package com.java.sample;

/**
 * Created by akanksha on 7/1/17.
 */
public class Floor {

    private int id;
    private boolean isPressedUp;
    private boolean isPressedDown;


    public Floor(int id, boolean isPressedUp, boolean isPressedDown) {
        this.id = id;
        this.isPressedUp = isPressedUp;
        this.isPressedDown = isPressedDown;
    }

    public void setPressedUp(boolean pressedUp) {
        isPressedUp = pressedUp;
    }

    public void setPressedDown(boolean pressedDown) {
        isPressedDown = pressedDown;
    }

    public boolean isPressedUp() {
        return isPressedUp;
    }

    public boolean isPressedDown() {
        return isPressedDown;
    }
}
