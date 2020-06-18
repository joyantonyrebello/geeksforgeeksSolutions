// { Driver Code Starts


import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}*/

class Solution {
    Node deleteMid(Node head) {
        if(head==null || head.next==null){
            return null;
        }
        Node mid=head;
        Node temp=head;
        Node prev=null;
        int count=1;
        //loop until end of linked list, at this time mid will 
        //be pointing to mid and prev to mid-1th node
        while(temp.next!=null){
            temp=temp.next;
            count++;
            if(count%2==0){//point prev to mid and increment mid
                prev=mid;
                mid=mid.next;
            }
        }//end while loop
        //delete the mid
        prev.next = mid.next;
        mid.next=null;//set mid's next to null(dereference)
        return head;
    }
}
