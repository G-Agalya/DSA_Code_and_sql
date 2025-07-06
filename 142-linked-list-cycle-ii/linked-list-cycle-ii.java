/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> arr=new HashSet<>();
        while(head!=null){
            arr.add(head);
            head=head.next;
            if(arr.contains(head)){
                return head;
            }
        }
        return null;
    }
}