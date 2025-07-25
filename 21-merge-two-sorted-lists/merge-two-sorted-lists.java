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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode newnode=new ListNode(0);
        ListNode jump=newnode;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                jump.next=temp1;
                temp1=temp1.next;
            }
            else{
                jump.next=temp2;
                temp2=temp2.next;
            }
            jump=jump.next;
        }
        if(temp1!=null){
            jump.next=temp1;
        }
        else{
            jump.next=temp2;
        }
        return newnode.next;
    }
}