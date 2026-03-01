public class NodeOfLinkList {
    static class Node{
        int val;
        Node next;
    }
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
    }
}
