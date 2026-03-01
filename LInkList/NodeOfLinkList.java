public class NodeOfLinkList {
    static class Node{
        int val;
        Node next; //by defult hold Null addresss
        
        Node(int val){
        this.val = val;
        this.next = null;//intail node not ponit any one
        }

    }
    
     static Node head;
     static Node tail;

    public static void main(String[] args) {
        
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50); 



        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);


        System.out.println("..............................");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("..............................");
       
        //liks
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);


        System.out.println(".....................");

        System.out.println(a.next.next.next.next);
        System.out.println(a.next.next.next.next.val);
        System.out.println(a.next.next.next.next.next);

        System.out.println("........................");



        //loop
        System.out.println("Loop..");
        Node temp = a;
        a.val = 100;
        
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

         
   



    }
}
