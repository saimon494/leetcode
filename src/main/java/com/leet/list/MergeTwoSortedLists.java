package com.leet.list;

public class MergeTwoSortedLists {
    public static class ListNode {
        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.printf("%d ", node.val);
            node = node.next;
        }
    }

    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }

        if (h1.val < h2.val) {
            h1.next = mergeTwoLists(h1.next, h2);
            return h1;
        } else {
            h2.next = mergeTwoLists(h1, h2.next);
            return h2;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        var rsl = new MergeTwoSortedLists();
        printList(rsl.mergeTwoLists(head1, head2));
    }
}
