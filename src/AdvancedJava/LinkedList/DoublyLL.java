package AdvancedJava.LinkedList;

public class DoublyLL {
    /* A node in Doubly Linked list has these default parameters:
     * A integral value - the data it holds
     * Node next - pointer to the next node
     * Node previous - a pointer to the previous node  */
    private static class Node {
        // Parameters
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // **************************
    //   Doubly LinkedList
    // **************************

    Node head;
    int size;

    public DoublyLL(){
        this.head = null;
        this.size = 0;
    }


    /* InsertFront - Mental Approach:
       1. Creating a new node with certain value and constructor next , prev as null
       2. It points to head (front)
       3. And, null at (back)
       4. Now, if head is already null that is LinkedList doesn't exist yet
          4.1. Assign head directly to the new node, and we get newNode as head - with next & prev as null
       5. If head is not null - that is existing linkedList
          5.1. The node which is currently head should point backwards to the newNode
          5.2. Hence, head.prev = newNode so that double links maintain!
       6. And we finally receive, [ null <-> newNode(head) <-> oldNode <-> null ] */
    void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

        size++;
    }


    /* These are the two ways to Print our doubly linked-list */
    void displayDLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void displayDLLReversed(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }

        System.out.println("Reversed Printing: ");
        while(last != null){
            System.out.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    /* InsertLast - Mental Approach:
       1. Check if the LinkedList is empty (head == null)
          1.1. If empty, resort to insertFirst() as we need to create the first node
       2. If LinkedList is not empty, traverse to the last node
          2.1. Start from head and keep moving until we find a node whose next is null
       3. Create a new node with the given value
       4. Link the last node to the new node (last.next = newNode)
       5. Link the new node back to the last node (newNode.prev = last) - maintaining doubly links
       6. Increment size by 1 as we have added a new node
       Result: [...previous nodes...] <-> lastNode <-> newNode(last) */
    void insertLast(int val){
        if(head == null){
            insertFirst(val);
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }

            Node newNode = new Node(val);
            last.next = newNode;
            newNode.prev = last;

            size++;
        }
    }

    /* InsertAtIndex - Mental Approach:
       1. If index is 0, use insertFirst()
       2. If index is size, use insertLast()
       3. Otherwise, traverse to the node at (index-1)
       4. Create a new node with the given value
       5. Update forward link: newNode.next = currentNode.next
       6. Update backward link: newNode.prev = currentNode
       7. If there's a node after the new node, update its prev pointer
       8. Update current node's next pointer: currentNode.next = newNode
       9. Increment size by 1
       Result: The new node is inserted in the middle, maintaining doubly links in both directions */
    void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 0; i < index-1 ; i++){
            temp = temp.next;
        }

        Node newNode = new Node(val , temp.next , temp);
        temp.next = newNode;
        temp.next.next.prev = newNode;

        size++;
    }


    /* DeleteFirst - Mental Approach:
       1. First check whether the LinkedList exists or not
          1.1. If head is null, there is nothing to delete
       2. If there is only one node in the list
          2.1. Set head to null so the list becomes empty
          2.2. Decrease size by 1
       3. If there are multiple nodes
          3.1. Move head to the next node
          3.2. Make the new head's prev pointer null because it is now the first node
          3.3. Decrease size by 1
       Result: The first node is removed and the doubly links stay valid */
    void deleteFirst(){
        if(head == null){
            System.out.println("Linked List doesn't exist!");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    /* DeleteLast - Mental Approach:
       1. First check whether the LinkedList exists or not
          1.1. If head is null, there is nothing to delete
       2. If there is only one node in the list
          2.1. Set head to null so the list becomes empty
          2.2. Decrease size by 1
       3. If there are multiple nodes
          3.1. Traverse till the node just before the last node
          3.2. Disconnect the last node by setting temp.next = null
          3.3. Decrease size by 1
       Result: The last node is removed and the doubly links stay valid */
    void deleteLast(){
        if(head == null){
            System.out.println("Linked List doesn't exist!");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }


    /* DeleteAtIndex - Mental Approach:
       1. First check whether the given index is valid or not
          1.1. If index is less than 0 or greater than/equal to size, it is invalid
       2. If index is 0, directly use deleteFirst()
       3. If index is size - 1, directly use deleteLast()
       4. For any middle index, traverse till the node at that exact index
       5. Keep references of the previous and next nodes around the node to be deleted
       6. Reconnect previous node to next node using previous.next = next
       7. Reconnect next node back to previous node using next.prev = previous
       8. Decrease size by 1
       Result: The node at the given index is removed and the doubly links remain valid */
    void deleteAtIndex(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index!");
            return;
        }

        if(index == 0){
            deleteFirst();
            return;
        }

        if(index == size-1){
            deleteLast();
            return;
        }

        Node temp = head;
        for(int i = 0 ; i < index; i++){
            temp = temp.next;
        }

        Node previous = temp.prev;
        Node next = temp.next;

        previous.next = next;
        next.prev = previous;

        size--;
    }

    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        obj.insertFirst(30);
        obj.insertFirst(40);
        obj.insertFirst(50);
        obj.insertLast(60);
        obj.insertLast(70);

        obj.insertAtIndex(65 , 2);
        obj.insertAtIndex(75 , 6);

        obj.displayDLL();
        System.out.println();

        obj.displayDLLReversed();
        System.out.println();

        System.out.println("Size of LinkedList: " + obj.size);

        // ****************** //
        System.out.println("\n****************\nDeletions\n****************\n");

        obj.deleteFirst();
        obj.deleteLast();
        obj.deleteAtIndex(2);

        obj.displayDLL();
        System.out.println();

        obj.displayDLLReversed();
        System.out.println();

        System.out.println("Size of LinkedList: " + obj.size);
    }
}
