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
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode dummy = new ListNode(0);

        ListNode nam=dummy;
        while(head1 != null && head2 != null)
        {
            if(head1.val<head2.val)
            {
                nam.next=head1;
                head1=head1.next;
            }
            else
            {
                nam.next=head2;
                head2=head2.next;
            }
            nam=nam.next;
        }
        if(head1!=null)
        {
            nam.next=head1;
        }
         else
        {
            nam.next=head2;
        }
        return dummy.next;
    }
}