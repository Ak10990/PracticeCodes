package com.java.sample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by akanksha on 22/1/17.
 */

public class CompareSample {


    @Test
    public void input() throws Exception {
       /* SparseArray<Integer> map = new SparseArray<>();
        if(map.get(0)!=null){
            map.setValueAt(0,0);
        }else {
            map.setValueAt();
        }*/

//        anagram(Arrays.asList("antler", "robed", "bored", "dormitory", "dirty room", "races", "cares"));
//        jersey(3, 4, new long[][]{{1, 2}, {3, 4}, {2, 1}});
        TypesTree typesTree = new TypesTree();


    }

    private void jersey(int N, long m, long a[][]) {
        long count;
        for (int j = 0; j < N; j++) {
            count = N - 1;
            for (int i = 0; i < N; i = i == j - 1 ? (i + 2) : (i + 1)) {
                if (a[j][1] == a[i][0]) {
                    count++;
                }
            }
            System.out.println(count + " " + (m - count));
        }
    }

    private void anagram(List<String> strs) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        int count;
        Collections.sort(strs);
        ArrayList<String> tSet;
        for (String str : strs) {
            System.out.print(str + "  ");
        }
        for (String str : strs) {
            count = count(str);
            if (map.containsKey(count)) {
                map.get(count).add(0, str);
            } else {
                tSet = new ArrayList<>();
                tSet.add(str);
                map.put(count, tSet);
            }
        }
        for (Integer e : map.keySet()) {
            tSet = map.get(e);
            for (int i = 0; i < tSet.size(); i++) {
                System.out.print(tSet.get(i));
                if (i != tSet.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }

    private int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count += str.charAt(i);
            }
        }
        return count;
    }


    private Stack stack1 = null;

    private class TypesTree {
        private Tree bst;
    }

    private class Tree {
        private char element;
        private int count;
        private Tree left;
        private Tree right;

        Tree(char element, Tree left, Tree right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

        Tree(char element) {
            this.element = element;
        }

        Tree copy() {
            Tree left = null;
            Tree right = null;
            if (this.left != null) {
                left = this.left.copy();
            }
            if (this.right != null) {
                right = this.right.copy();
            }
            return new Tree(this.element, left, right);
        }
    }

    private void push(Tree a) {
        Stack ele = new Stack(a);
        if (stack1 != null) {
            stack1.next = ele;
            ele.back = stack1;
        }
        //Overflow condition is possible on LL. No
        stack1 = ele;
    }

    private Tree pop() {
        Tree ele = null;
        if (stack1 != null) {
            ele = stack1.element;
            if (stack1.back == null) {
                stack1 = null;
            } else {
                stack1 = stack1.back;
                stack1.next = null;
            }
        } else {
            System.out.println("I think you trying to pop from empty stack1");
        }
        return ele;
    }

    private boolean isEmpty() {
        return stack1 == null;
    }

    private class Stack {
        private Tree element;
        private Stack next;
        private Stack back;

        Stack(Tree element) {
            this.element = element;
        }
    }

}