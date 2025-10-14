package leetcode;
/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Example 4:
Input: head = [1,2,3]
Output: [2,1,3]
 */
public class SwapNodesPairs {
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, null))));

        System.out.println("Original list:");
        printList(head);

        SwapNodesPairs obj = new SwapNodesPairs();
        ListNode result = obj.swapPairs(head);

        System.out.println("After swapping in pairs:");
        printList(result);
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, cur = head;

        while (cur != null && cur.next != null) {
            ListNode npn = cur.next.next;
            ListNode second = cur.next;

            // Perform the swap
            second.next = cur;
            cur.next = npn;
            prev.next = second;

            // Move forward
            prev = cur;
            cur = npn;
        }

        return dummy.next;
    }

    // Helper to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}