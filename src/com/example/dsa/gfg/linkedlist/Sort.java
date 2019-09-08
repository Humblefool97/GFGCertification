package com.example.dsa.gfg.linkedlist;

/**
 * Sort 1's 0's & 2's
 * Created by rajeevranganathan
 */
public class Sort {

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    void linksort(Node head) {
        int count0 = 0, count1 = 0, count2 = 0;
        Node tempNode = head;
        while (tempNode != null) {
            switch (tempNode.value) {
                case 0:
                    count0++;
                case 1:
                    count1++;
                case 2:
                    count2++;
            }
            tempNode = tempNode.next;
        }

        tempNode = head;
        while (tempNode != null && count0 >= 1) {
            tempNode.value = 0;
            tempNode = tempNode.next;
            count0--;
        }
        while (tempNode != null && count1 >= 1) {
            tempNode.value = 1;
            count1--;
            tempNode = tempNode.next;
        }
        while (tempNode != null && count2 >= 1) {
            tempNode.value = 2;
            count2--;
            tempNode = tempNode.next;
        }
    }


}
