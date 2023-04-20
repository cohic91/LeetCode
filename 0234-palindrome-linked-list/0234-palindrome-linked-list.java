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
    public boolean isPalindrome(ListNode head) {
        List<Integer> valList = new ArrayList<>();
        ListNode tail = head;
        while (tail != null) {
            valList.add(tail.val);
            tail = tail.next;
        }
        
        int valListSize = valList.size();
        for(int i = 0; i < valListSize / 2; i++) {
            if(valList.get(i) != valList.get(valListSize - 1 - i)) return false;
        }
        return true;
    }
}