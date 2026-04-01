/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //firest define varibles
        //initail tempa and tempb on persent on first node
        int lenA = 1;
        int lenB = 1;
        ListNode tempA = headA;
        ListNode tempB = headB;
        int diff = 0;

        //for finde lenght both of linklists
        // for A
        while(tempA != null){
            tempA = tempA.next;
            lenA++;
        }

           // for B
        while(tempB != null){
            tempB = tempB.next;
            lenB++;
        }

        //redinde valuse agin
        tempA = headA;
        tempB = headB;

        //then check which is grater 
        if(lenA > lenB){
            // linklist A is Grater
            //so update temp A , and place as comper to smaas tempB
            diff = lenA -lenB;
            //llop
            for(int i = 1 ; i<= diff ; i++){
                tempA = tempA.next;
            }
        }else{
            //b linklist is long update tempB
             diff = lenB -lenA;

            //llop 
            for(int j= 1; j<= diff; j++){
                tempB = tempB.next;
            }
        }


        //now temp a and b corrent and same location . now finde interscation
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }


         return tempA;






    }
}