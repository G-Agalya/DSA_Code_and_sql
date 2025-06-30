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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        ListNode newnode=new ListNode(0);
        ListNode temp3=newnode;
        int c=0;
        while(l1!=null && l2!=null){
            sum=c+l1.val+l2.val;
            temp3.next=new ListNode(sum%10);
            c=sum/10;
            l1=l1.next;
            l2=l2.next;
            temp3=temp3.next;
        }
        while(l1!=null){
            sum=c+l1.val;
            temp3.next=new ListNode(sum%10);
            c=sum/10;
            l1=l1.next;
            temp3=temp3.next;
        }
        while(l2!=null){
            sum=c+l2.val;
            temp3.next=new ListNode(sum%10);
            c=sum/10;
            l2=l2.next;
            temp3=temp3.next;
        }
        if(c>0){
            temp3.next=new ListNode(c);
        }
        return newnode.next;
    }
}