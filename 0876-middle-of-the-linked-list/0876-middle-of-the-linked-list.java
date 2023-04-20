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
    public ListNode middleNode(ListNode head) {
        int nodeLength = 1;
        int headVal = head.val;
        
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            nodeLength += 1;
        }
        int tailVal = tail.val;
        
        int middleIndex = nodeLength / 2 + 1;
        
        ListNode middleNode = head;
        for(int i = 1; i < middleIndex; i++) {
            middleNode = middleNode.next;
        }
        return middleNode;
    }
}