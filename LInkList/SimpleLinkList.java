

class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}

public class SimpleLinkList {

    public static void displayLinkList(Node head) {

        // Node temp = head;

        // while (temp != null) {
        // System.out.print(temp.val + " =||=>> ");
        // temp = temp.next;
        // }
        // System.out.println(temp);

        // for loop
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " =||=>> ");
        }

        System.out.println("null");

    }

    
     public static Node displayNodeByRec(Node head){
        //base condition
        if (head == null) {
            System.out.print("null");
            return null;
        }

        System.out.print(head.val + " =||=>> ");

        return displayNodeByRec(head.next);
     }


    public static void main(String[] args) {

        // creates nodes
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // links nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // display nodes
        //loops
        // displayLinkList(a);

        //recursive
        displayNodeByRec(a);

    }
}