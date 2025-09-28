package leetcode;
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */
public class MergeLists {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); // dummy node for easier handling
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        // attach the remaining nodes
        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next; // skip dummy and return real head
    }

    // Helper to print linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeLists ml = new MergeLists();

        // Creating first list: [1,2,4]
        ListNode list1 = ml.new ListNode(1);
        list1.next = ml.new ListNode(2);
        list1.next.next = ml.new ListNode(4);

        // Creating second list: [1,3,4]
        ListNode list2 = ml.new ListNode(1);
        list2.next = ml.new ListNode(3);
        list2.next.next = ml.new ListNode(4);

        // Merge the lists
        ListNode mergedHead = ml.mergeTwoLists(list1, list2);

        // Print result
        ml.printList(mergedHead);
    }
}
