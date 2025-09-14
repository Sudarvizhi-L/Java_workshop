package leetcode;

/*
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example 1:
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

Example 2:
Input: head = [2,1], x = 2
Output: [1,2]
 */
public class partitionList {
    public static void main(String[] args) {
        // Example: head = [1,4,3,2,5,2], x = 3
        ListNode head = new ListNode(1,
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(2))))));

        int x = 3;

        partitionList obj = new partitionList();
        ListNode result = obj.partition(head, x);

        // Print result
        printList(result); // Expected: 1 -> 2 -> 2 -> 4 -> 3 -> 5
    }

    public ListNode partition(ListNode head, int x) {
        // Dummy heads
        ListNode smallHead = new ListNode(0);
        ListNode bigHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode big = bigHead;

        // Traverse and split nodes
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }

        // Connect two lists
        small.next = bigHead.next;
        big.next = null;

        return smallHead.next;
    }

    // Utility method to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
