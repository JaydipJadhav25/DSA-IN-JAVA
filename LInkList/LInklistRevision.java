//node
class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

// linklist class
class Linklist {
    Node head;
    Node tail;

    //1 . addAtTail
    public void addAtTail(int val){
       //create node 
       Node temp = new Node(val);
       //check if no node exiting so head and tail point samne node
       if (this.head == null) {
           this.head = this.tail = temp;
           return;
       }
 
      //already list exisiting
       this.tail.next = temp;
       this.tail = temp;
    }


    //2 add at head
    public void addAtHead(int val){
        // base codition handl
        Node temp = new Node(val);

        temp.next = head;
        head = temp;
        
    }
     
    //3 deleteAtHead
    public void deleteAtHead(){
        //check not node
        if (head == null) {
            System.out.println("linklist in empty!");
            return;
        }

        if (head.next == null) {
            this.head = null;
            return;
        }

        //linklist has no of elements

        this.head = head.next;
    }


    //delete at tail
    public void deleteAtTail(){
        //of no node
        if (this.tail == null) {
            System.out.println("Empty linklist!");
            return;
        }

         //only one node

         if (this.head.next == null) {
            this.tail = null;
            return;
         }

         //mora than two node
         //access befor tail node
        Node temp = this.head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        
        System.out.println("temp :" + temp.data);
         
        //now temp is prev of tail node
        this.tail = temp;
        this.tail.next = null;
    }


   //print linklist
   public void printLinkList(){
    Node temp = this.head;
    while (temp != null) {
        System.out.print(temp.data+" -> ");
        temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
    System.out.println("head : " + (head != null ? head.data : head));
    System.out.println("tail : " + (tail != null ? tail.data : tail));
   }


}

public class LInklistRevision {
    public static void main(String[] args) {
    
        Linklist ll = new Linklist();
        // ll.printLinkList();

        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        

        ll.addAtHead(100);
        ll.addAtHead(300);
        ll.addAtHead(200);
        ll.printLinkList();


        //delet at head
        ll.deleteAtHead();
        ll.deleteAtHead();

        ll.printLinkList();


        //delte at tail
        ll.deleteAtTail();
        System.out.println("delete at tail");
        ll.printLinkList();


    }
}
