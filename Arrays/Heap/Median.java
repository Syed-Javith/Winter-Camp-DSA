package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Median {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 7, 13, 36, 100 };
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int e : nums) {
            maxHeap.add(e);
            minHeap.add(maxHeap.remove());
            if (minHeap.size() != maxHeap.size()) {
                maxHeap.add(minHeap.remove());
            }
        }
        if (minHeap.size() == maxHeap.size()) {
            System.out.println((minHeap.remove() + maxHeap.remove()) / 2);
        } else {
            System.out.println(maxHeap.remove());
        }
    }
}
