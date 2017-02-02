package com.java.sample;

import org.junit.Test;

/**
 * Created by akanksha on 14/1/17.
 */

public class StackDs {

    @Test
    public void input() throws Exception {
        Stack stack = createStack(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printStack(stack);
        stack = deleteStack(stack, 2);
        printStack(stack);
        stack = deleteStack(stack, 7);
        printStack(stack);
        stack = deleteStack(stack, 2);
        printStack(stack);
        /**
         * Balancing symbols [{}, xml/html tags]
         * infix prefix postfix
         * find min. O(1)
         * Palindrome
         * reverse
         * 2,3...n stacks in one array
         * permutation stack possible 123456 ->325641->X154623
         * Android (saving undo's, back, recursive func, activities A->B->C->A(singleTop without clear???))
         */
    }

    private Stack createStack(char[] a) {
        Stack stack = null;
        if (a.length > 0) {
            for (char arr : a) {
                stack = push(stack, arr);
            }
        }
        return stack;
    }

    private Stack deleteStack(Stack stack, int noEle) {
        for (int i = 0; i < noEle; i++) {
            stack = pop(stack);
        }
        return stack;
    }

    private Stack push(Stack stack, char a) {
        Stack ele = new Stack(a);
        if (stack != null) {
            stack.next = ele;
            ele.back = stack;
        }
        //Overflow condition is possible on LL. No
        stack = ele;
        return stack;
    }

    private Stack pop(Stack stack) {
        if (stack != null) {
            if (stack.back == null) {
                stack = null;
            } else {
                stack = stack.back;
                stack.next = null;
            }
        } else {
            System.out.println("I think you trying to pop from empty stack");
        }
        return stack;
    }

    private boolean isEmpty(Stack stack) {
        return stack == null;
    }

    private void printStack(Stack stack) {
        while (stack != null) {
            System.out.print(stack.element + "\t");
            stack = stack.back;
        }
        System.out.println("\n----------------------------------------------------------------------------");
    }

    private class Stack {
        private char element;
        private Stack next;
        private Stack back;

        Stack(char element) {
            this.element = element;
        }
    }

}
