package com.java.sample;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by akanksha on 7/1/17.
 */

public class StringActivity extends Activity {

    private String s1;
    private String s2;
    private ArrayList<Integer> arr = new ArrayList<>();
    private ArrayList<ArrayType> s2Arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStrings();
        initRotation();
        detectRotation();
    }

    private void initStrings() {
        s1 = "";
        s2 = "";
    }

    private void initRotation() {
        arr.add(0);
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(0) == s1.charAt(i)) {
                arr.add(i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                s2Arr.add(new ArrayType(i, true));
            }
        }
    }

    private boolean detectRotation() {
        if (s2Arr.size() == 0) {
            return false;
        }
        for (int i = 1; i < arr.size(); i++) {
            setS2Char(i);
        }
        for (int i = 0; i < s2Arr.size(); i++) {
            if (s2Arr.get(i).isFurther())
                return true;
        }
        return false;
    }

    private void setS2Char(int inc) {
        int x;
        for (int i = 0; i < s2Arr.size(); i++) {
            if (s2Arr.get(i).isFurther()) {
                x = s2Arr.get(i).getPosition() + inc;
                if (s2.length() <= x) {
                    x = x - s2.length();
                }
                if (s2.charAt(x) == s1.charAt(i)) {
                    s2Arr.get(i).setFurther(false);
                }
            }
        }
    }

}
