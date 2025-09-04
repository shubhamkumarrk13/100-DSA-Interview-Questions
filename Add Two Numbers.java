// Problem Link : https://leetcode.com/problems/add-two-numbers/description/

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newHead = new ListNode(-1);

        ListNode temp = newHead;

        ListNode first = l1;

        ListNode second = l2;

        int sum = 0;

        int carry = 0;

        while(first != null || second != null) {

            if(first != null && second != null) sum = first.val + second.val + carry;

            else if(first == null) sum = second.val + carry;

            else if(second == null) sum = first.val + carry;

            ListNode node = new ListNode(-1);

            if(sum >= 10) {

                carry = 1;

                sum = sum % 10;

                node.val = sum;

                temp.next = node;

            }

            else {

                carry = 0;

                node.val = sum;

                temp.next = node;
            }

            if(first != null) first = first.next;

            if(second != null) second = second.next;

            temp = temp.next;
        }

        if(carry == 1) {

            ListNode node = new ListNode(1);

            temp.next = node;
        }

        return newHead.next;
        
    }
}
