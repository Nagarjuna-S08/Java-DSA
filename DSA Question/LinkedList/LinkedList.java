import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Function to add a new node at the end
    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    // Driver code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        // Adding nodes from 1 to 10
        for (int i = 1; i <= 14; i++) {
            list.append(i);
        }

        System.out.println("Original Linked List:");
        list.printList(list.head);

        // Reverse nodes in groups of 3
        // Alternate Reverse of Alternate k elements in an list
        list.head = list.reverseKGroup(list.head, 3);
        System.out.println("Reversed Linked List (k = 3):");
        list.printList(list.head);

        // Continue Reverse of k elements in an list
        list.head = list.reverseKGroupContinues(list.head, 3);
        System.out.println("Reversed Linked List (k = 3):");
        list.printList(list.head);
    }

    // 1->2->3->4->5->6->7->8->9->10
    public Node reverseKGroup(Node head, int k){

        // To find the length of the linked List
        Node f = head;
        int cnt=0;
        while(f!=null && f.next!=null){
            f = f.next.next;
            cnt++;
        }
        int len = f==null?cnt*2:cnt*2+1;
        System.out.println(len);

        // Declaration of the Objects to use
        Node prev = null ;
        Node cur = head ;
        if(head==null || head.next==null){
            return head ;
        }
        Node next = cur ;
        Node copy=cur ;
        Node poin = null ;

        while(len-k>=0){

            // revcerse the List of k elements
            int a=0;
            copy = cur;
            while(cur!=null && a<k){
                next = next.next;
                cur.next = prev;
                prev = cur;
                cur = next;
                a++;
                len--;
            }

            // joining the Broken link
            copy.next = cur;
            if(poin==null){
                head = prev;
            }
            else{
                poin.next=prev;
            }

            //Skip the next k Terms
            Node nodePrev = cur;
            int b=0;
            while(cur!=null && b<k){
                nodePrev=cur;
                cur=cur.next;
                b++;
                len--;
            }

            // Reassign for the next Iteration
            poin = nodePrev;
            prev = null;
            next=cur;

        }


        return head;
    }


    public Node reverseKGroupContinues(Node head, int k){

        // To find the length of the linked List
        Node f = head;
        int cnt=0;
        while(f!=null && f.next!=null){
            f = f.next.next;
            cnt++;
        }
        int len = f==null?cnt*2:cnt*2+1;
        System.out.println(len);

        // Declaration of the Objects to use
        Node prev = null ;
        Node cur = head ;
        if(head==null || head.next==null){
            return head ;
        }
        Node next = cur ;
        Node copy=cur ;
        Node poin = null ;

        while(len-k>=0){

            // revcerse the List of k elements
            int a=0;
            copy = cur;
            while(cur!=null && a<k){
                next = next.next;
                cur.next = prev;
                prev = cur;
                cur = next;
                a++;
                len--;
            }

            // joining the Broken link
            copy.next = cur;
            if(poin==null){
                head = prev;
            }
            else{
                poin.next=prev;
            }

            // Reassign for the next Iteration
            poin = copy;
            prev = null;
            next=cur;
        }


        return head;
    }


}
