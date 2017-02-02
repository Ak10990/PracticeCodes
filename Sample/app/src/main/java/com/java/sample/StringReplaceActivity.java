package com.java.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by akanksha on 9/1/17.
 */

public class StringReplaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String str = "aaabcccdee";//bdee
        function(str);
        str = "abcdeeeeddcddcbfgf";//abccbfgf
        function(str);
        str = "aaabcccdee";
        function(str);
        str = "aaabcccdee";
        function(str);
    }

    private void function(String str) {
        Log.d("msnjjsnjjsn", "input     " + str);
        int i = 0;
        while (i < str.length() - 2) {
//            while(str.charAt(i)==)
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                str=str.replace(str.substring(i, i + 3), "");
            } else {
                i++;
            }
        }
        Log.d("msnjjsnjjsn", "result    " + str);
    }
}
