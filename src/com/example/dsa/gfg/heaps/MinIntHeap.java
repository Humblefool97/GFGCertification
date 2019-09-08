package com.example.dsa.gfg.heaps;

import java.util.Arrays;

public class MinIntHeap {
    private int capacity = 10;
    private int size = 0;
    private int[] items = new int[capacity];

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int parentIndex) {
        return getLeftChildIndex(parentIndex) < size;
    }

    private boolean hasRightChild(int parentIndex) {
        return getRightChildIndex(parentIndex) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int getLeftChild(int parentIndex) {
        return items[getLeftChildIndex(parentIndex)];
    }

    private int getRightChild(int parentIndex) {
        return items[getRightChildIndex(parentIndex)];
    }

    private int getParent(int index) {
        return items[getParentIndex(index)];
    }

    private void swap(int iOne, int iTwo) {
        int temp = items[iOne];
        items[iOne] = items[iTwo];
        items[iTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll(){
        if (size == 0) throw new IllegalStateException();
        int element = items[0];
        items[0]=items[size-1];
        size = size - 1;
        heapifyDown(0);
        return element;
    }

    public void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp(size-1);
    }

    private void heapifyUp(int i) {
        int parent = (i-1)/2;
        if(parent >= 0 && items[i] < items[parent]){
            swap(i,parent);
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int i) {
        int smallest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l<size && items[l] < items[smallest])
            smallest = l;
        if(r < size && items[r] < items[smallest])
            smallest = r;
        if(smallest != i){
            swap(smallest,i);
            heapifyDown(smallest);
        }
    }
}
