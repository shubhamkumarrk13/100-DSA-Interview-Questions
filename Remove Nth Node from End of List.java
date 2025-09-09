// Problem Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class Solution {

    public int findLength(ListNode head) {

        ListNode temp = head;

        int cnt = 0;

        while(temp != null) {

            cnt++;

            temp = temp.next;
        }

        return cnt;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = findLength(head);

        int position = length - n;

        if(position == 0) return head.next;

        int currentPos = 1;

        ListNode temp = head;

        while(temp != null) {

            if(currentPos == position) break;

            temp = temp.next;

            currentPos++;
        }

        temp.next = temp.next.next;

        return head;
        
    }
}
