package com.leet.code.reverseList;

import com.leet.code.addTwoNumbers.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
class Solution {

    /**
     * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。
     * 由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。
     * 在更改引用之前，还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
     */
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currentNode = head;//初始化当前节点
        while (currentNode != null) {
            //预存下一个节点
            ListNode temp = currentNode.next;
            //将当前节点的next指针改为指向前一个元素
            currentNode.next = preNode;
            //前节点重置为当前节点
            preNode = currentNode;
            //当前节点重置为预存的下个节点
            currentNode = temp;
        }
        return preNode;
    }


}