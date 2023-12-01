package org.example;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode head = new ListNode();
        ListNode body = head;
        while(list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                body.next = list2;
                list2 = list2.next;
            } else {
                body.next = list1;
                list1 = list1.next;
            }
            body = body.next;
        }
        body.next = list1 != null ? list1 : list2;
        return head.next;
    }
}
