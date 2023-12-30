import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // for max heap ==> PriorityQueue<Integer> minHeap = new
        // PriorityQueue<>(Comparator.reverseOrder());
        minHeap.add(2);
        minHeap.add(1);
        minHeap.add(9);
        minHeap.add(4);
        minHeap.add(0);
        for (int i : minHeap) {
            System.out.println(i);
        }
        minHeap.remove();
        for (int i : minHeap) {
            System.out.println(i);
        }
    }
}
