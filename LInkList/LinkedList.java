public class LinkedList {

    // Node blueprint
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail
    public Node head;
    public Node tail;

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
   

        ll.tail = ll.head.next; // update tail //tail point on next of head

    // 👉 add value 3 at end
    ll.tail.next = new Node(3); //tail update

     //update tail 
     ll.tail = ll.tail.next;

    // ll.tail = ll.tail.next;
    ll.tail.next = new Node(4);

    ll.tail = ll.tail.next;



        // Print to verify
        Node temp = ll.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}