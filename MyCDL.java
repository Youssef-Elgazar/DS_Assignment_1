package com.company;

public class MyCDL {
    static Node start;

    static class Node {
        int data;
        Node prev;
        Node next;
    }

    public void insertEnd(int value) {
        if (start == null)
        {
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = newNode.prev = newNode;
            start = newNode;
            return;
        }
        // if list is not empty

        // find last node
        Node last = (start).prev;

        // create new node
        Node newNode = new Node();
        newNode.data = value;

        // start is next for newNode
        start = newNode.next;

        // newNode is prev of start
        start.prev = newNode;

        // last is prev of newNode
        newNode.prev = last;

        // newNode is next of last
        last.next = newNode;
    }


    public void compare(MyCDL cdl, MyCDL cdl2){
        if (cdl.equals(cdl2)){
            System.out.println("1");

        }else{
            System.out.println("0");
        }
    }


    public Node delete(Node start, int key){
        if(start == null){
            return null;
        }

        // declaring two pointers
        Node curr = start;
        Node prev1 = null;
        while(curr.data != key){
            if (curr.next == start){
                System.out.println("Node not found in the list");
                return start;
            }
            prev1 = curr;
            curr = curr.next;



        // cheking if node is the only node in the list
        if (start == curr.next && prev1 == null){
            start = null;
            return start;
        }

        // if list has more than one node
            // check if its the first node
            if (curr == start){
                //make prev1 points to last node
                prev1 = start.prev;

                // move start ahead
                start = start.next;

                // adjusting pointers
                prev1.next = start;
                start.prev = prev1;

            }

            // checking if it's the last node
            else if (curr.next == start) {
                prev1 = curr.prev;
                start.prev = prev1;
                prev1.next = start;
            } else {
                // create new pointer, points to curr.next
                // the plan is that we free curr by using temp and prev1
                Node temp = curr.next;
                temp.prev = prev1;
                prev1.next = temp;


            }

        }


        return start;
    }
}


