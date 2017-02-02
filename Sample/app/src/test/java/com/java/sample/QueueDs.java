package com.java.sample;

import org.junit.Test;

/**
 * Created by akanksha on 14/1/17.
 */

public class QueueDs {

    @Test
    public void input() throws Exception {
        Queue queue = createQueue(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printQueue(queue);
        queue = deleteQueue(queue, 2);
        printQueue(queue);
        queue = deleteQueue(queue, 7);
        printQueue(queue);
        queue = deleteQueue(queue, 2);
        printQueue(queue);
        /**
         * priority queue
         * n-1 length in circular is max. else replace
         * reverse queue
         * Queue from 2 stacks
         * Stack from 2 queues
         * 1 Queue to 1 stack front as top
         * Max sum in sliding window
         */
    }

    private Queue createQueue(char[] a) {
        Queue queue = null;
        if (a.length > 0) {
            for (char arr : a) {
                queue = enQueue(queue, arr);
            }
        }
        return queue;
    }

    private Queue deleteQueue(Queue queue, int noEle) {
        for (int i = 0; i < noEle; i++) {
            queue = deQueue(queue);
        }
        return queue;
    }

    private Queue enQueue(Queue queue, char a) {
        Queue ele = new Queue(a);
        if (queue != null) {
            ele.back = queue.back;
            queue.back.next = ele;
            queue.back = ele;
            ele.next = queue;
        } else {
            queue = ele;
            ele.back = ele;
            ele.next = ele;
        }
        //Overflow condition is possible on LL. No
        return queue;
    }

    private Queue deQueue(Queue queue) {
        if (queue != null) {
            if (queue.next == queue) {
                queue = null;
            } else {
                queue.next.back = queue.back;
                queue.back.next = queue.next;
                queue = queue.next;
            }
        } else {
            System.out.println("I think you trying to delete from empty queue");
        }
        return queue;
    }

    private void printQueue(Queue queue) {
        if (queue != null) {
            Queue temp = queue;
            do {
                System.out.print(temp.element + "\t");
                temp = temp.next;
            } while (temp != queue);
        }
        System.out.println("\n----------------------------------------------------------------------------");
    }

    private class Queue {
        private char element;
        private Queue next;
        private Queue back;

        Queue(char element) {
            this.element = element;
        }
    }
}
