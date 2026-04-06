package AdvancedJava.LinkedList;

/* Node is the basic building block of a LinkedList.
    * It contains two main components:
    * 1. Data: This is the value or information that the node holds. It can be of any data type (e.g., integer, string, object).
    * 2. Next: This is a reference (or pointer) to the next node in the linked list. It allows the nodes to be connected together, forming a chain-like structure. */


public class Node {

    // Defining our Node {Properties} :
    int data; // It is the data that the node holds
    Node next; // It is the reference to the next node


    /* Constructor 1 - to initialize the node with data and set next to null
       - Setting null here because the node doesn't point to any other node yet. */
    public Node(int data) {
        this.data = data; // Initialize the data
        this.next = null; // Initialize next to null
    }


    /* Constructor 2 - to initialize the node with data and a reference to the next node
       - This allows us to create a node that already points to another node when we create it. */
    public Node(int data, Node next) {
        this.data = data; // Initialize the data
        this.next = next; // Initialize next with the provided reference
    }


    // Getters and Setters for the properties:
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}