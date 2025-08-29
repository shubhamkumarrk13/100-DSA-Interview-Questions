// Problem Link : https://leetcode.com/problems/merge-two-sorted-lists/description/

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;

        ListNode temp2 = list2;

        ListNode newHead = new ListNode(-1);

        ListNode mover = newHead;

        while(temp1 != null && temp2 != null) {

            if(temp1.val < temp2.val) {

                mover.next = temp1;

                temp1 = temp1.next;

                mover = mover.next;
            }

            else {

                mover.next = temp2;

                temp2 = temp2.next;

                mover = mover.next;
            }
        }

        if(temp1 != null) mover.next = temp1;

        if(temp2 != null) mover.next = temp2;

        return newHead.next;
        
    }
}
