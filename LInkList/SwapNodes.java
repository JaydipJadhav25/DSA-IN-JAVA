/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
   
   //first find last to k 
   ListNode temp = head;
   ListNode start  = head;
   // loop to position on k 
   for(int i = 1 ; i < k ; i++){
    temp = temp.next;
    start = start.next;
   }

   // point on k poistion node
   int startVal = start.val;


   //now finde last fron k => perfrom slow and fast mwthod
   ListNode end = head;
   while(temp != null){
    temp = temp.next;
    //problem => temp is null that case end id goes in one next node
    //check  temp is null so that case temp is not update
    if(temp == null){
            end = end;
    }else{
        end = end.next;
    }
   }

   //now end point on k from last node
   int endVal = end.val;


   //swapping values not node
   end.val = startVal;
   start.val = endVal;

   //return
   return head;





    }
}