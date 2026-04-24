package AdvancedJava.LinkedList;

public class LList {

    /*  LinkedList Properties: It has a
        1. 'head' which marks the starting of a LinkedList
        2. 'count' which is the serial no of how many nodes are there in the LL. */
    Node head;
    Node tail;
    int size;

    // Constructor 1: Default constructor sets the size to 0.
    public LList(){
        this.size = 0;
    }


    // Methods
    // 1. Insert Value at FistIndex
    /* What all will we do?
       Ans: 1. We will initialize a node using the value
            2. For the first position - the value will be the head so the next pointer will be the current head
            3. Then we will update the head to the new node as only one value is there for now
            4. Now since one value is their tail will be null
            5. Hence, update the tail as well to the head as both will be pointing to the same node.
            6. Finally, we will increase the size by 1 as we have added a new node.  */
    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        // Explanations: Since only one element is their both the tail and head will be pointing to the same node
        size++;
    }


    // 2. Now to display the linkedList :
    public void displayLL(){
        /* We need to traverse the LL we can do so by:
           1. Making head start from the head only and then print the value of it , and new head = head.next
           -- but this changes the entire structure of the LL as we changed the head position itself.
           2. Hence, we create a temp Node which will initially point to head and then traverse */
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // 3. Adding a value to the Last of LL
    /* What all will we do?
         Ans: 1. We will initialize a node using the value
                2. Now the tail's next value will be the node we have just created
                3. Then we will update the tail to the new node as only one value is there for now
                4. Now, if tail is already null, that is List is empty so we will directly use the addFirst Method
                5. Finally, we will increase the size by 1 as we have added a new node.
     */
    public void addLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            addFirst(val);
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }


    // 4. Adding a value at any index of the LL
    /* What all will we do?
       Ans: 1. We will initialize a node using the value
            2. If index provided is:
                2.1 0 - we will directly use the addFirst Method
                2.2 size - we will directly use the addLast Method
            3. Otherwise, we will traverse the LL to reach the index where we want to add the value
            4. Then we will update the next pointer of the node at that index to the new node and the next pointer of the new node to the next node of the current node
            5. Finally, we will increase the size by 1 as we have added a new node. */
    public void addAtIndex(int val , int index){
        if(index==0){
            addFirst(val);
            size++;
        }
        else if(index==size){
            addLast(val);
            size++;
        }
        else {
            Node temp = head;
            for(int ind = 0 ; ind < index-1 ; ind++){
                temp = temp.next;
            }

            Node node = new Node(val , temp.next);
            /* Explanation: We have made a constructor in node where the next pointer is directly initialized to the next node. Hence, here we can directly pass the next node of the current node which is temp.next here as the current node is temp */
            temp.next = node;
            /* Explanation: Now we need to update the next pointer of the current node to the new node we have just created. Hence, we will directly point it to the new node. */
             size++;

             // If we didn't have the constructor in node where the next pointer is directly initialized to the next node, then we would have done it like this:
                /* Node node = new Node(val);
                   node.next = temp.next;
                   temp.next = node;

                That is both the node and temp will point the same and then temp will point the new node. */
        }
    }


    /* To delete the first element: Just shifting head does the job
       1. check if the list is empty just return the method
       2. If the head and tail are both on the same position that is only one element is present hence both should be now pointing to null
          - Giving an empty linked list
       3. Else just shift the head to next by head = head.next;   */
    public void deleteFirst (){
        if(head == null){
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }
        size--;
    }

    public static void main(String[] args) {
        LList list = new LList();
        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(81);
        list.addFirst(80);
        list.addLast(13); // Should be displayed at the last of the LL
        list.addAtIndex(8 , 4); // Should be displayed at the 4th index of the LL
        list.displayLL();
        System.out.println("The Size of the LinkedList is : " + list.size);

        System.out.println();

        list.deleteFirst();
        list.displayLL();
        System.out.println("The Size of the LinkedList is : " + list.size);
    }
}