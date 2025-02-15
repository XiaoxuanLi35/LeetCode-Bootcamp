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
    public ListNode removeElements(ListNode head, int val) {
        // set a dummy node to replace the real head node
        ListNode dummy = new ListNode();
        dummy.next = head; // now dummy becomes the "new head"
        // Traverse the linked list from dummy
        ListNode curr = dummy;
        while(curr.next != null){// traverse until the end
            if(curr.next.val == val){
                curr.next = curr.next.next; // replace curr.next with next node
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;// dummy.next represents the real head

    }
}
