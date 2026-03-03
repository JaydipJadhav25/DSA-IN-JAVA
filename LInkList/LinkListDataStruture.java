//this is node
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// this is linkList of nodes
class Linklist {
    Node head;
    Node tail;

    // add tail at Linklist
    public void addTailNode(int val) {

        // create new node
        Node temp = new Node(val);

        ////// handle linklist empty
        if (this.tail == null) {
            // create node
            tail = head = temp;
        }

        // link with tail
        this.tail.next = temp;
        // update tail on last node
        this.tail = temp;
    }

    // add node at head in linklist
    public void addHeadNode(int val) {
        // flow :
        // 1 create node with val
        // 2 check linklist empty create node and point both
        // 3. new node point to head
        // 4 and head points to new node

        Node temp = new Node(val);

        // check empty
        if (head == null) {
            head = tail = temp;
        }

        // if not empty
        // so new node ponts to head
        temp.next = head;
        // thne come on new node
        head = temp;
    }

    // ptint LinkList
    public void printLinkList() {
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

        System.out.println("head : " + this.head.val);
        System.out.println("tail : " + this.tail.val);
    }

}

public class LinkListDataStruture {

    public static void main(String[] args) {

        // create linklist
        Linklist ll = new Linklist();

        // create first node
        // Node a = new Node(10);

        // first time both points on same node
        // ll.head = a;
        // ll.tail = a;

        // add tail new Node
        ll.addTailNode(20);
        ll.addTailNode(30);
        ll.addTailNode(50);
        ll.addTailNode(70);
        ll.addTailNode(90);

        ll.printLinkList();



        //add at head
        ll.addHeadNode(100);
        ll.addHeadNode(200);

        ll.printLinkList();

    }

}