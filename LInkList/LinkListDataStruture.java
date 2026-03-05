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
    int size;

    // add tail at Linklist
    public void addTailNode(int val) {

        // create new node
        Node temp = new Node(val);

        ////// handle linklist empty
        if (this.tail == null) {
            // create node
            // size ++;
            tail = head = temp;

        } else {

            // link with tail
            this.tail.next = temp;
            // update tail on last node
            this.tail = temp;

        }

        size++;
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
            // size++;
            head = tail = temp;
        } else {
            // if not empty
            // so new node ponts to head
            temp.next = head;
            // thne come on new node
            head = temp;
        }

        size++;
    }

    // delete at head
    public void deleteAtHead() {

        // linklist is emty
        if (this.head == null) {
            return;
        }

        // 1
        /// hold head
        // Node temp = head.next;
        // // this.head.next = null;
        // this.head = null;
        // this.head = temp;

        // 2
        // smart way
        this.head = head.next;
        size--;

    }

    public void deleteAtTail() {

        // finde seond last
        Node temp = this.head;

        // if only one node persent
        if (temp.next == null) {
            head = tail = null;
            size = 0;
            return;
        }

        // Node last = this.tail;
        // loop

        while (temp.next.next != null) {
            temp = temp.next;
        }
        // found second last
        this.tail = temp;
        this.tail.next = null;
        size--;
        System.out.println("delete Last Node !");
        // this.tail.next = null;
        // this.tail.next = null;
    }

    //add new node at index
    public void addNodeAtIndex(int idx , int val){
        //create new node
        Node newNode = new Node(val);
        
        Node temp = this.head;
        //go to index
        for (int i = 0; i < idx -1 ; i++) {
            
             if (temp == null) {
                System.out.println("index is outof LinkList");
                return;
            }
            temp = temp.next;
            //also check temp is null so no need to go next
            // if (temp == null) {
            //     System.out.println("index is outof LinkList");
            //     return;
            // }
        }

        // now check node
        if (temp == null) {
          System.out.println("index is outof LinkList");
            return;
        }

        //now on cuurent node is idx -1
        //add new node 
        // Node holdCurret = temp;
        // temp.next = newNode;
        // newNode.next  = holdCurret.next;
        // size++;
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

       System.out.println("add new ad Idx : " + idx + " valuse : "+ val);
       
    }

    //delete at indec
    public void deleteAtIndexInLinkList(int idx){

          //check index overflow the size
          if (idx > size) {
            System.out.println("idx outof the linklist!");
            return;
        }
        //find indx -1 
        Node temp = this.head;
        for (int i = 0; i < idx -1; i++) {
            temp = temp.next;
        }

        Node target = temp.next;
        
        //last node delete
        if (target.next == null) {
            temp.next = null;
            return;
        }else if (target == this.head) {
            //index is first element
            this.head = this.head.next;
            return;
        }


        temp.next = target.next;
        size--;

         System.out.println("delete Node at index : "+ idx + " valuse : "+ target.val);
        // temp.next = temp.next.next;


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

        System.out.println("head : " + (this.head == null ? "null" : this.head.val));
        System.out.println("tail : " + (this.tail == null ? "null" : this.tail.val));
    }

    //finde node and return index
    public int getNodeOnVal(int val){
       int idx = 0;
       Node temp = this.head;
       while (temp != null) {
         if (temp.val == val) {
            return idx;
         }
         temp = temp.next;
         idx++;
       }

        return -1;
    };



    //get middle of link list 
   public int getMiddleNode(){
    Node temp = this.head;
    int total = 0;
    while (temp != null) {
        temp = temp.next;
        total++;
    };

    System.out.println("total : " + total);

    //now  check even or odd
    // int mid = total % 2 == 0 ? total/2 : (total/2)+1;
    //zero based index
    int mid = total /2;
      temp = this.head;
    //loop
    for (int i = 0; i < mid; i++) {
       temp  = temp.next;
    }

    return temp.val;

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

        // ll.printLinkList();

        // add at head
        ll.addHeadNode(100);
        ll.addHeadNode(200);

        ll.printLinkList();

        System.out.println("size of linklist : " + ll.size);

        // delete at heaf
        // ll.deleteAtHead();

        // ll.printLinkList();
        // System.out.println("size of linklist : " + ll.size);

        // ll.deleteAtTail();
        // ll.printLinkList();
        // System.out.println("size of linklist : " + ll.size);

        // ll.printLinkList();

        // ll.deleteAtTail();

        // ll.printLinkList();
        System.out.println("size of linklist : " + ll.size);

        // ll.addHeadNode(200);
        // ll.addHeadNode(300);
        // ll.addTailNode(500);
        ll.printLinkList();

        // System.out.println("node find : "+ ll.getNodeOnVal(30));

        ll.addNodeAtIndex(3, 300);
        
        ll.printLinkList();

        ll.deleteAtIndexInLinkList(1);

        ll.printLinkList();

        System.out.println(5/2);

        System.out.println("get middle node : " + ll.getMiddleNode());
    

    }

}