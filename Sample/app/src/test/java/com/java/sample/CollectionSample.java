package com.java.sample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by akanksha on 19/1/17.
 */

public class CollectionSample {
    @Test
    public void input() throws Exception {
        sort(new String[][]{{"c", "b"}, {"a", "b"}});
    }

    private String[] sort(String[][] sets) {
        Set<String> set = new HashSet<>();
        for (String[] set1 : sets) {
            Collections.addAll(set, set1);
        }

        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(set);
        Collections.sort(sortedList);
        String[] result = new String[sortedList.size()];
        sortedList.toArray(result);

        for (String aResult : result) {
            System.out.print(aResult + "\t");
        }

        return result;
    }
}
