package linkedlistinJava;

import jdk.jfr.MemoryAddress;

import java.lang.foreign.AddressLayout;
import java.util.LinkedList;

public class LinkedlistJava {
    public static void main(String[] args) {
        //every element in LinkedList is called node.
        //singly linkedList -> last node pointing to null.
        //doubly LinkedList -> one pointer for next and one for previous.
        //circular LinkedList -> forms a cycle . last pointing to first and first pointing to last.

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(32);
        linkedlist.add(43);
        linkedlist.add(5);


//        System.out.println(linkedlist.get(2));


    }
}


