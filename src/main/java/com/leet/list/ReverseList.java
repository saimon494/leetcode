package com.leet.list;
public class ReverseList {
    /**
     * 206. Reverse Linked List
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     */
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

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode currentList = head.next;
        ListNode reversedList = head;

        reversedList.next = null;

        while (currentList != null) {
            ListNode temp = currentList;
            currentList = currentList.next;

            temp.next = reversedList;
            reversedList = temp;
        }

        return reversedList;
    }

    public static void printList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5, 6};

        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }
        printList(head);
        head = reverseList(head);
        printList(head);
    }
}
