package com.leet.list;

// Write a function to delete a node in a singly-linked list.
// You will not be given access to the head of the list,
// instead you will be given access to the node to be deleted directly.
// It is guaranteed that the node to be deleted is not a tail node in the list.

public class DeleteNode {

    public static class ListNode {

        private int val;
        private ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if (node.next == null) {
            node = null;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
