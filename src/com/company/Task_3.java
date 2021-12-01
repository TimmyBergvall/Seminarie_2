package com.company;

public class Task_3 {
    // https://www.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
    Node head;

    class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void addNode(String new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Given a reference (pointer to pointer) to the head of a list
       and a position, deletes the node at the given position */
    void removeNode(int position) {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }

    void printIndex(int position) {


    }

    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    /* Driver program to test above functions. Ideally this function
       should be in a separate user class.  It is kept here to keep
       code compact */
    public static void main(String[] args)
    {
        /* Start with the empty list */
        Task_3 myLinkedList = new Task_3();

        myLinkedList.addNode("HELLO");
        myLinkedList.addNode("1");
        myLinkedList.addNode("OMG");
        myLinkedList.addNode("TJOOO");

        System.out.println("\nCreated Linked list is: ");
        myLinkedList.printList();

        myLinkedList.removeNode(2);  // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4: ");
        myLinkedList.printList();

        System.out.println("HELLO \n");
    }
}