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
        Stack<Integer> a = new Stack<>();
        ListNode curr = head;
        ListNode size = head;
        int length = 0;
        while (size != null) {
            size = size.next;
            length++;                              
        }
        int solution = length / 2;   
        int j = 0;                               
        while (curr != null) {
            if (length % 2 != 0 && j == solution) {
                curr = curr.next;
                j++;
                continue;
            }
            if (j >= solution) {
                if (a.pop() != curr.val) {
                    return false;
                }
                curr = curr.next;
                continue;
            }
            a.push(curr.val);
            curr = curr.next;
            j++;
        }
        return true;
    }
}