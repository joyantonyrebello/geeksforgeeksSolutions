// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Swap {
    static Node head;
    static Node last;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);

            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }

            GfG gfg = new GfG();
            head = gfg.pairwiseSwap(head);
            printList(head);
            System.out.println();
            t--;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            last=head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;
            last.next = node;
            last=last.next;
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class GfG {
    public static Node pairwiseSwap(Node node) {

        Node head = node;
        if(head==null || head.next==null)
            return head;
            
        //before swapping,store the head as 2nd node in LL
        head = head.next;
        
        Node prevPair = null;
        Node nextPair = null;
        Node temp = node;//start the swapping process from 1st node
        do {//swap the pairs while tracking prev pairs and next pairs
           if(temp.next != null){
               nextPair = temp.next.next;
           } else {//LL size is odd, just exit the loop
               break;
           }
           nextPair = temp.next.next;
           temp.next.next = temp;//pair swap
           if(prevPair != null)
                prevPair.next = temp.next;//prevpair should hold swapped 2nd node
           temp.next = nextPair;//pair swap
           prevPair = temp;
           temp = nextPair;
           
        }while(nextPair != null);
        //end of do while loop
        
        return head;
    }
}
