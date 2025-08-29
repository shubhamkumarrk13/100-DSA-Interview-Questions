// Problem Link : https://leetcode.com/problems/reverse-linked-list/description/

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode temp = head;

        ListNode prev = null;

        ListNode newHead = null;

        while(temp != null) {

            if(temp.next == null) newHead = temp;

            ListNode front = temp.next;

            temp.next = prev;

            prev = temp;

            temp = front;
        }

        return newHead;
        
    }
}
