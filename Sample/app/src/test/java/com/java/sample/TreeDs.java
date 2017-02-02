package com.java.sample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by akanksha on 14/1/17.
 */

public class TreeDs {

    private Stack stack1 = null;

    @Test
    public void input() throws Exception {
        TypesTree typesTree = new TypesTree();
        typesTree.bst = createBST(new char[]{'a', 'z', 't', 'u', 'k', 'l', 'i', 'f', 'g', 'j'});
        printTree(typesTree.bst, 1);
        printTree(typesTree.bst, 2);
        printTree(typesTree.bst.copy(), 3);
        printTree(typesTree.bst, 6);
        /**
         * Edges, leaf, siblings, ancestor, descendant,full nodes, half nodes, compare 2 trees
         * level, level of max sum, depth,height, is skew(left/right), size, diameter/width
         * max/min, deepest node, existence of path wth a sum, mirror of tree make n check, least common ancestor
         * construct tree from inorder and preorder, inorder and postorder, inorder and level order, preorder of strict
         * next sibling 34?
         * Strict binary tree(2/0),full binary tree, complete binary tree
         */


    }

    private Tree createBST(char[] a) {
        Tree root = null;
        for (char c : a) {
            root = insert(root, c);
        }
        return root;
    }

    private Tree insert(Tree root, char a) {
        Tree ele = new Tree(a), temp;
        if (root == null) {
            root = ele;
        } else {
            temp = root;
            while ((temp.left != null && a <= temp.element) || (temp.right != null && a >= temp.element)) {
                if (temp.left != null && a <= temp.element) {
                    temp = temp.left;
                } else if (temp.right != null && a >= temp.element) {
                    temp = temp.right;
                }
            }
            if (temp.left == null && a <= temp.element) {
                temp.left = ele;
            } else if (temp.right == null && a >= temp.element) {
                temp.right = ele;
            }
        }
        return root;
    }

    /**
     * @param order 1=PreOrder, 2=PostOrder 3=InOrder 4=Level order 5=zigzag order 6=vertical traverse
     */
    private void printTree(Tree bst, int order) {
        Tree temp;
        if (order == 1) {
            while (!isEmpty() || bst != null) {
                assert bst != null;
                System.out.print(bst.element + "\t");
                if (bst.right != null) {
                    push(bst.right);
                }
                if (bst.left != null) {
                    bst = bst.left;
                } else {
                    if (!isEmpty()) {
                        bst = pop();
                    } else {
                        bst = null;
                    }
                }
            }
        } else if (order == 2) {
            while (!isEmpty() || bst != null) {
                if (bst != null) {
                    push(bst);
                    bst = bst.left;
                } else {
                    if (!isEmpty()) {
                        bst = pop();
                        System.out.print(bst.element + "\t");
                        if (bst.right != null) {
                            bst = bst.right;
                        } else {
                            bst = null;
                        }
                    }
                }
            }
        } else if (order == 3) {
            while (!isEmpty() || bst != null) {
                if (bst != null && bst.left == null && bst.right == null) {
                    System.out.print(bst.element + "\t");
                } else if (bst != null) {
                    push(bst);
                    bst = bst.left;
                    continue;
                }
                if (!isEmpty()) {
                    bst = pop();
                    bst.left = null;
                    if (bst.right != null) {
                        push(bst);
                        temp = bst;
                        bst = temp.right;
                        temp.right = null;
                    } else {
                        System.out.print(bst.element + "\t");
                        bst = null;
                    }
                }
            }
        } else if (order == 4) {
        } else if (order == 5) {
//            while (!isEmpty() || bst != null) {}
        } else if (order == 6) {
            HashMap<Integer, List<Character>> verticalMap = new HashMap<>();
            int vertical = 0;
            while (!isEmpty() || bst != null) {
                assert bst != null;
                if (verticalMap.get(vertical) != null) {
                    verticalMap.get(vertical).add(bst.element);
                } else {
                    List<Character> chars = new ArrayList<>();
                    chars.add(bst.element);
                    verticalMap.put(vertical, chars);
                }

                if (bst.right != null) {
                    push(bst.right);
                }
                if (bst.left != null) {
                    bst = bst.left;
                    vertical--;
                } else {
                    if (!isEmpty()) {
                        bst = pop();
                    } else {
                        bst = null;
                    }
                }
            }



            for (Integer mapKey : verticalMap.keySet()) {
                System.out.print(mapKey + ":\t\t");
                for (Character value : verticalMap.get(mapKey)) {
                    System.out.print(value + "\t");
                }
            }
        }
        System.out.println();
    }

    private class TypesTree {
        private Tree bst;
    }

    private class Tree {
        private char element;
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
