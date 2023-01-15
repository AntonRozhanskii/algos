package org.example.service;

import org.example.ListNode;

import java.util.ArrayList;
import java.util.List;

public final class ListNodeProvider {

    private ListNodeProvider() {
    }

    public static ListNode generate(int... values) {
        ListNode head = new ListNode();
        ListNode body = head;

        for(int i : values) {
            body.next = new ListNode();
            body.next.val = i;
            body = body.next;
        }

        return head.next;
    }

    public static void print(ListNode node) {
        List<String> values = new ArrayList<>();
        while (node != null) {
            values.add(String.valueOf(node.val));
            node = node.next;
        }
        String result = String.join(", ", values);
        System.out.println(result);
    }
}
