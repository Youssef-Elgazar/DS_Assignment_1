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


    public void delete(){


    }
}


