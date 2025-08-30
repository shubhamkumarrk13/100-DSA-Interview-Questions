// Problem Link : https://leetcode.com/problems/sort-list/description/

class Solution {

    public ListNode merge(ListNode head1 , ListNode head2) {

        ListNode temp1 = head1;

        ListNode temp2 = head2;

        ListNode newHead = new ListNode(-1);

        ListNode mover = newHead;

        while(temp1 != null && temp2 != null) {

            if(temp1.val < temp2.val) {

                mover.next = temp1;

                mover = mover.next;

                temp1 = temp1.next;
            }

            else {

                mover.next = temp2;

                mover = mover.next;

                temp2 = temp2.next;
            }
        }

        if(temp1 != null) mover.next = temp1;

        if(temp2 != null) mover.next = temp2;

        return newHead.next;
    }

    public ListNode findMiddle(ListNode head) {

        ListNode slow = head;

        ListNode fast = head.next;

        while(fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode leftNode = head;

        ListNode middleNode = findMiddle(head);

        ListNode rightNode = middleNode.next;

        middleNode.next = null;

        leftNode = sortList(leftNode);

        rightNode = sortList(rightNode);

        return merge(leftNode , rightNode);



    }
}
