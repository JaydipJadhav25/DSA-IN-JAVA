public class NodeOfLinkList {
    static class Node{
        int val;
        Node next;
    }
    
     static Node head;
     static Node tail;

    public static void main(String[] args) {
        
        Node a = new Node(); 
        Node b = new Node(); 
        Node c = new Node(); 
        Node d = new Node(); 
        Node e = new Node(); 
         
        //value of nodes
        a.val = 10;
        b.val = 20;
        c.val = 30;
        d.val = 40;
        e.val = 50;

        //next of Node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        //point head to first node
        head = a;
        //point to tail to last
        tail = e;

        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(tail.val);
         
        //node 
        Node temp = a; //a return refers / look like node that why take Node
        while (temp != null) {
            System.out.println(temp.val);
            temp  = temp.next;
        }



    }
}
