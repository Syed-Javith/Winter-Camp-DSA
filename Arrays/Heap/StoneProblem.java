package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StoneProblem {
    public static void main(String[] args) {
        int[] stones = { 2, 7, 4, 1, 8, 1 };
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int e : stones) {
            maxHeap.add(e);
        }
        while (maxHeap.size() > 1) {
            int first = maxHeap.remove();
            int second = maxHeap.remove();
            if (first != second) {
                maxHeap.add(Math.abs(first - second));
            }
        }
        if (maxHeap.isEmpty()) {
            System.out.println("-1");
        } else
            System.out.println(maxHeap.remove());
    }
}
