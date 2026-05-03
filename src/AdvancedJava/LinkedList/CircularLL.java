package AdvancedJava.LinkedList;

public class CircularLL {
    /* Node of a Circular LinkedList comprises:
       - Similar to a singly linked list : 1. value
                                           2. reference to next
       - But things here are not null!  */

    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    /* And the linked list consists:
       1. head
       2. tail and ofc! size
       - tail and head are connected together both initially pointing to null ! */

    Node head;
    Node tail;
    int size;

    public CircularLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    void insert(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            size++;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    void delete(int value){
        Node temp = head;

        if(head == null){
            return;
        }

        if (head.value == value){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        do {
            Node tempNext = temp.next;

            if(tempNext.value == value){
                temp.next = tempNext.next;
                size--;
                break;
            }

            temp = temp.next;
        } while (temp != head);
    }

    public void displayCLL(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("HEAD -> ");
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while(temp != head);

        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CircularLL obj = new CircularLL();
        obj.insert(10);
        obj.insert(20);
        obj.insert(43);
        obj.insert(24);
        obj.insert(30);
        obj.displayCLL();
        System.out.println("Size: " + obj.size);

        obj.delete(24);
        obj.displayCLL();
        System.out.println("Size: " + obj.size);
    }
}
