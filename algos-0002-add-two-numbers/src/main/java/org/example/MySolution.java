package org.example;

public class MySolution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        int nextFigure = 0;

        while (l1 != null || l2 != null) {
            int currentSum = nextFigure;
            if (l1 != null) {
                currentSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentSum += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(currentSum % 10);
            nextFigure = currentSum / 10;
            current = current.next;
        }
        if (nextFigure > 0) {
            current.next = new ListNode(nextFigure);
        }
        return head.next;
    }
}
