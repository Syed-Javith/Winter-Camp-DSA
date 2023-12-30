package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SumToHalf {
    public static void main(String[] args) {
        int[] nums = { 5, 19, 8, 1 };
        PriorityQueue<Float> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        float sum = 0;
        for (int e : nums) {
            float f = e;
            maxHeap.add((float) e);
            sum += e;
        }
        float target = sum / 2;
        int count = 0;
        while (target > 0) {
            float max = maxHeap.remove();
            maxHeap.add(max / 2);
            System.out.println(max + " " + sum + " " + target);
            target -= max / 2;
            count++;
        }
        System.out.println(count);
    }
}
