package org.example;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public int hashCode() {
        int hashCode = val;
        if (next != null) {
            hashCode += next.hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ListNode)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ListNode that = (ListNode) obj;
        return this.val == that.val
                && areNextsEqual(this.next, that.next);
    }

    private boolean areNextsEqual(ListNode thisNext, ListNode thatNext) {
        if (thisNext != null ^ thatNext != null) {
            return false;
        }
        return thisNext == null || thisNext.equals(thatNext);
    }
}
