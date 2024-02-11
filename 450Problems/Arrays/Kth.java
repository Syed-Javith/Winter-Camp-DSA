import java.util.PriorityQueue;

public class Kth {
    public static void main(String[] args) {
        int[] arr = { 3,5,6,7,1 };
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int e : arr){
            heap.add(e);
        }
        int k = 3;
        while(k-->1){
            heap.poll();
        }
        System.out.println(heap.poll());
    }
}
