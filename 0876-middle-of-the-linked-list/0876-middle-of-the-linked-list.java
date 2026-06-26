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
        int size = size(head);
        ListNode temp = head ;
        int mid = size /2;
        while(mid-->0){
            temp = temp.next;
        }
        return temp ;
    }
    int size(ListNode head){
        ListNode temp = head;
        int count = 0 ;
        while(temp!=null){
            count+=1;
            temp=temp.next;

        }
        return count;
    }
}