package easy.MergeTwoSortedLists;

import com.blankj.structure.ListNode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode root = new ListNode(0);
        ListNode head = root;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                root.next = l1;
                l1 = l1.next;
            } else {
                root.next = l2;
                l2 = l2.next;
            }
            root = root.next;
        }
        if (l1 != null) root.next = l1;
        if (l2 != null) root.next = l2;
        return head.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode0 = ListNode.createTestData("[1,3,5,7,9]");
        ListNode listNode1 = ListNode.createTestData("[2,4,6,8,10]");
        ListNode.print(listNode0);
        ListNode.print(listNode1);
        ListNode.print(solution.mergeTwoLists(listNode0, listNode1));
    }
}
