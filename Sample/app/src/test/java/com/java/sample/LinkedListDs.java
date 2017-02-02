package com.java.sample;

import org.junit.Test;

/**
 * Created by akanksha on 14/1/17.
 */

public class LinkedListDs {

    @Test
    public void input() throws Exception {
        TypesLL typesLL = new TypesLL();

        /*typesLL.linear = createLLinkedList(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'b', 9);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'c', 11);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'd', 0);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'e', 1);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'h', 4);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'm', 20);
        printList(true, typesLL.linear);

        typesLL.linear = delete(typesLL.linear, 0);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 1);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 20);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 8);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 7);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 3);
        printList(true, typesLL.linear);

        typesLL.linear = delete(typesLL.linear, 'k');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'a');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'j');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 't');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'f');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'x');
        printList(true, typesLL.linear);*/

        /*typesLL.linearSort = createSortedLinkedList(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printList(true, typesLL.linearSort);-----------------------------------------------------------------------*/

        /*typesLL.linear = insert(typesLL.linear, 'b', 9);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'c', 11);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'd', 0);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'e', 1);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'h', 4);
        printList(true, typesLL.linear);
        typesLL.linear = insert(typesLL.linear, 'm', 20);
        printList(true, typesLL.linear);

        typesLL.linear = delete(typesLL.linear, 0);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 1);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 20);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 8);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 7);
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 3);
        printList(true, typesLL.linear);

        typesLL.linear = delete(typesLL.linear, 'k');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'a');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'j');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 't');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'f');
        printList(true, typesLL.linear);
        typesLL.linear = delete(typesLL.linear, 'x');
        printList(true, typesLL.linear);
        */

        /*typesLL.doubly = createDLinkedList(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();

        typesLL.doubly = insert(typesLL.doubly, 'b', 9);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = insert(typesLL.doubly, 'c', 11);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = insert(typesLL.doubly, 'd', 0);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = insert(typesLL.doubly, 'e', 1);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = insert(typesLL.doubly, 'h', 4);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = insert(typesLL.doubly, 'm', 20);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();

        typesLL.doubly = delete(typesLL.doubly, 0);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 1);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 20);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 8);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 7);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 3);
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();

        typesLL.doubly = delete(typesLL.doubly, 'k');
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 'a');
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 'j');
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 't');
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 'f');
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();
        typesLL.doubly = delete(typesLL.doubly, 'x');
        printList(true, typesLL.doubly.start);
        printList(false, typesLL.doubly.end);
        System.out.println();*/

        /*typesLL.circularDoubly = createCDLinkedList(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();

        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'b', 9);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'c', 11);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'd', 0);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'e', 1);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'h', 4);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'm', 20);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();

        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 0);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 1);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 20);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 8);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 7);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 3);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();

        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 'k');
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 'a');
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 'j');
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 't');
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 'f');
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 'x');
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();*/
        /**
         * Special corner cases
         */
        /*typesLL.circularDoubly = createCDLinkedList(new char[]{'a'});
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println("\n-------------------------------------------------------------------------------");
        typesLL.circularDoubly = deleteCD(typesLL.circularDoubly, 0);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println("\n-------------------------------------------------------------------------------");
        typesLL.circularDoubly = insertCD(typesLL.circularDoubly, 'b', 1);
        printCList(true, typesLL.circularDoubly);
        printCList(false, typesLL.circularDoubly);
        System.out.println();*/

        typesLL.linear = createLLinkedList(new char[]{'b', 'c', 'd', 'f', 'h', 'i', 'k', 'o', 'u'});
//        typesLL.linearSort = createLLinkedList(new char[]{'d', 'e', 'g', 'j', 'l', 'm'});
        printList(true, typesLL.linear);
//        isCycle(typesLL.linear);
//        printList(true, typesLL.linearSort);
//        printList(true, merge(typesLL.linear, typesLL.linearSort));
//        intersectAt(typesLL.linear, typesLL.linearSort);
        typesLL.linear = sortedInsert(typesLL.linear, 'v');
        printList(true, typesLL.linear);
        /**
         * Other Questions
         * Memory efficient DLL
         * nth node from end, middle of list
         * check if list is linear or circular Flloyd algo
         * intersection of 2 list
         */

    }

    private LinkedList sortedInsert(LinkedList head, char data) {
        LinkedList ele = new LinkedList(data);
        if (head == null) {
            return ele;
        }
        if (data < head.element) {
            ele.next = head;
            head.back = ele;
            return ele;
        }
        LinkedList temp = head;
        while (temp.next != null) {
            if (temp.next.element > data && temp.element <= data) {
                break;
            }
            temp = temp.next;
        }
        ele.next = temp.next;
        ele.back = temp;
        if (ele.next != null) {
            ele.next.back = ele;
        }
        temp.next = ele;
        return head;
    }

    private void intersectAt(LinkedList headA, LinkedList headB) {
        if (headA == null || headB == null) return;
        LinkedList temp = headA, temp1 = headB;
        int c1 = 0, c2 = 0;
        while (temp != null || temp1 != null) {
            if (temp != null) {
                c1++;
                temp = temp.next;
            }
            if (temp1 != null) {
                c2++;
                temp1 = temp1.next;
            }
        }
        int c = c2 > c1 ? (c2 - c1) : (c1 - c2);
        if (c2 > c1) {
            while (c != 0) {
                c--;
                headB = headB.next;
            }
        } else {
            while (c != 0) {
                c--;
                headA = headA.next;
            }
        }
        while (headA != null) {
            if (headA == headB) {
                return;
            }
            headA = headA.next;
            headB = headB.next;
        }
    }

    private void isCycle(LinkedList head) {
        if (head == null) return;
        LinkedList temp = head, temp1 = head;
        do {
            temp = temp.next;
            temp1 = temp1.next;
            if (temp1 != null) {
                temp1 = temp1.next;
            }
        } while (temp != null && temp1 != null && temp != temp1);
        if (temp == temp1) {
            System.out.print("true");
        }
        System.out.print("false");
    }

    private void nthNodeFromEnd(LinkedList head, int pos) {
        LinkedList temp = head, temp1 = head;
        int i = 0;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        while (temp.next != null) {
            temp = temp.next;
            temp1 = temp1.next;
        }
        System.out.print(temp1.element);
    }

    private LinkedList merge(LinkedList headA, LinkedList headB) {
        LinkedList headM = null, temp = null, temp1;
        char c;
        while (headA != null && headB != null) {
            if (headA.element < headB.element) {
                c = headA.element;
                headA = headA.next;
            } else if (headA.element > headB.element) {
                c = headB.element;
                headB = headB.next;
            } else {
                c = headA.element;
                headA = headA.next;
                headB = headB.next;
            }
            temp1 = new LinkedList(c);
            if (temp == null) {
                temp = temp1;
                headM = temp;
            } else {
                temp.next = temp1;
                temp = temp.next;
            }
        }
        while (headA != null) {
            c = headA.element;
            headA = headA.next;
            temp1 = new LinkedList(c);
            if (temp == null) {
                temp = temp1;
                headM = temp;
            } else {
                temp.next = temp1;
                temp = temp.next;
            }
        }
        while (headB != null) {
            c = headB.element;
            headB = headB.next;
            temp1 = new LinkedList(c);
            if (temp == null) {
                temp = temp1;
                headM = temp;
            } else {
                temp.next = temp1;
                temp = temp.next;
            }
        }
        return headM;
    }

    private LinkedList reverse(LinkedList head) {
        if (head == null) {
            return null;
        }
        LinkedList reverseLL, temp = head.next;
        reverseLL = head;
        reverseLL.next = null;
        while (temp != null) {
            head = temp;
            temp = temp.next;
            head.next = reverseLL;
            reverseLL = head;
        }

        return reverseLL;
    }

    private LinkedList createLLinkedList(char[] a) {
        LinkedList start = null;
        if (a.length > 0) {
            start = new LinkedList(a[0]);
            LinkedList temp = start, ele;
            for (int i = 1; i < a.length; i++) {
                ele = new LinkedList(a[i]);
                temp.next = ele;
                temp = ele;
            }
        }
        return start;
    }

    private DoublyLL createDLinkedList(char[] a) {
        DoublyLL doublyLL = new DoublyLL();

        if (a.length > 0) {
            doublyLL.start = new LinkedList(a[0]);
            LinkedList temp = doublyLL.start, ele;
            for (int i = 1; i < a.length; i++) {
                ele = new LinkedList(a[i]);
                temp.next = ele;
                ele.back = temp;
                temp = ele;
            }
            doublyLL.end = temp;
        }
        return doublyLL;
    }

    private LinkedList createCDLinkedList(char[] a) {
        LinkedList start = null;
        if (a.length > 0) {
            start = new LinkedList(a[0]);
            LinkedList temp = start, ele;
            for (int i = 1; i < a.length; i++) {
                ele = new LinkedList(a[i]);
                temp.next = ele;
                ele.back = temp;
                temp = ele;
            }
            start.back = temp;
            temp.next = start;
        }
        return start;
    }

    private LinkedList createSortedLinkedList(char[] a) {
        return null;
    }

    private LinkedList insert(LinkedList node, char element, int position) {
        LinkedList ele = new LinkedList(element);
        if (position != 0) {
            int i = 0;
            LinkedList temp = node;
            while (temp.next != null) {
                if ((i + 1) == position) {
                    break;
                }
                i++;
                temp = temp.next;
            }
            ele.next = temp.next;
            temp.next = ele;
        } else {
            ele.next = node;
            node = ele;
        }
        return node;
    }

    private DoublyLL insert(DoublyLL node, char element, int position) {
        LinkedList ele = new LinkedList(element);
        if (position != 0) {
            int i = 0;
            LinkedList temp = node.start;
            while (temp.next != null) {
                if ((i + 1) == position) {
                    break;
                }
                i++;
                temp = temp.next;
            }

            ele.next = temp.next;
            if (temp.next != null) {
                temp.next.back = ele;
            } else {
                node.end = ele;
            }
            ele.back = temp;
            temp.next = ele;
        } else {
            ele.next = node.start;
            node.start.back = ele;
            node.start = ele;
        }
        return node;
    }

    private LinkedList insertCD(LinkedList node, char element, int position) {
        LinkedList ele = new LinkedList(element);
        if (position != 0) {
            if (node != null) {
                int i = 0;
                LinkedList temp = node;
                while (temp.next != node) {
                    if ((i + 1) == position) {
                        break;
                    }
                    i++;
                    temp = temp.next;
                }
                if (i + 1 == position) {//For no position extreme insertion
                    ele.back = temp;
                    temp.next.back = ele;
                    ele.next = temp.next;
                    temp.next = ele;
                }
            } else {
                return null;
            }
        } else {
            if (node == null) {
                node = ele;
                ele.next = ele;
                ele.back = ele;
            } else {
                ele.next = node;
                ele.back = node.back;
                node.back.next = ele;
                node.back = ele;
                node = ele;
            }
        }
        return node;
    }

    private LinkedList delete(LinkedList node, int position) {
        if (position != 0) {
            int i = 0;
            LinkedList temp = node;
            while (temp.next != null) {
                if ((i + 1) == position) {
                    break;
                }
                i++;
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        } else {
            node = node.next;
        }
        return node;
    }

    private DoublyLL delete(DoublyLL node, int position) {
        if (position != 0) {
            int i = 0;
            LinkedList temp = node.start;
            while (temp.next != null) {
                if ((i + 1) == position) {
                    break;
                }
                i++;
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            if (temp.next == null) {
                node.end = temp;
            } else {
                temp.next.back = temp;
            }
        } else {
            node.start = node.start.next;
            node.start.back = null;
        }
        return node;
    }

    private LinkedList deleteCD(LinkedList node, int position) {
        if (position != 0) {
            int i = 0;
            LinkedList temp = node;
            while (temp.next != node) {
                if ((i + 1) == position) {
                    break;
                }
                i++;
                temp = temp.next;
            }
            if (temp.next != node) {
                temp.next.next.back = temp;
                temp.next = temp.next.next;
                temp.next.back = temp;
            }
        } else {
            if (node.next == node) {
                node = null;
            } else {
                node.back.next = node.next;
                node.next.back = node.back;
                node = node.next;
            }
        }

        return node;
    }

    private LinkedList delete(LinkedList node, char element) {
        if (node.element != element) {
            LinkedList temp = node;
            while (temp.next != null) {
                if (temp.next.element == element) {
                    break;
                }
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        } else {
            node = node.next;
        }
        return node;
    }

    private LinkedList deleteCD(LinkedList node, char element) {
        if (node.element != element) {
            LinkedList temp = node;
            while (temp.next != node) {
                if (temp.next.element == element) {
                    break;
                }
                temp = temp.next;
            }
            if (temp.next != node) {
                temp.next.next.back = temp;
                temp.next = temp.next.next;
                temp.next.back = temp;
            }
        } else {
            node.back.next = node.next;
            node.next.back = node.back;
            node = node.next;
        }
        return node;
    }

    private DoublyLL delete(DoublyLL node, char element) {
        if (node.start.element != element) {
            LinkedList temp = node.start;
            while (temp.next != null) {
                if (temp.next.element == element) {
                    break;
                }
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            if (temp.next == null) {
                node.end = temp;
            } else {
                temp.next.back = temp;
            }
        } else {
            node.start = node.start.next;
            node.start.back = null;
        }
        return node;
    }

    private void printList(boolean isForward, LinkedList node) {
        while (node != null) {
            System.out.print(node.element + "\t");
            if (isForward) {
                node = node.next;
            } else {
                node = node.back;
            }
        }
        System.out.println();
    }

    private void printCList(boolean isForward, LinkedList node) {
        if (node != null) {
            LinkedList temp = node;
            do {
                if (isForward) {
                    System.out.print(temp.element + "\t");
                    temp = temp.next;
                } else {
                    temp = temp.back;
                    System.out.print(temp.element + "\t");
                }
            } while (temp != node);
        }
        System.out.println();
    }


    private class TypesLL {
        private LinkedList linear;
        private LinkedList linearSort;
        private DoublyLL doubly;
        private DoublyLL doublySort;
        private LinkedList circularLl;
        private LinkedList circularLlSort;
        private LinkedList circularDoubly;
        private LinkedList circularDoublySort;
    }

    private class DoublyLL {
        private LinkedList start;
        private LinkedList end;
    }

    private class LinkedList {
        private char element;
        private LinkedList next;
        private LinkedList back;

        LinkedList(char element) {
            this.element = element;
        }

    }

}
