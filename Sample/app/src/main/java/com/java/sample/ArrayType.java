package com.java.sample;

/**
 * Created by akanksha on 7/1/17.
 */
public class ArrayType {

    private int position;
    private boolean isFurther;

    public ArrayType(int position, boolean isFurther) {
        this.position = position;
        this.isFurther = isFurther;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFurther() {
        return isFurther;
    }

    public void setFurther(boolean further) {
        isFurther = further;
    }
}
