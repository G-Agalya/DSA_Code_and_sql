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
    public int getDecimalValue(ListNode head) {
        String str="";
        ListNode temp=head;
        while(temp!=null){
            str+=temp.val+"";
            temp=temp.next;
        }
        int res=Integer.parseInt(str,2);
        return res;
    }
}