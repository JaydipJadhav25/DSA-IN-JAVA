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
    public boolean isPalindrome(ListNode head) {
          
          //finde middle
          ListNode slow = head;
          ListNode fast = head;

          while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
          }

          //found midd -> revers
          ListNode prev = null;

          while(slow != null){
          ListNode next = slow.next;
          slow.next = prev;
          prev = slow;
          slow = next;
          }

          //revrsed linklist
         //now travel in linklist
        ListNode second = prev;
        ListNode first = head;

        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;



     


    
      



    }
}