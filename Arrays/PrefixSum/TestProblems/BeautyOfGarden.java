import java.util.*;

public class BeautyOfGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = sc.nextInt();
        }
        int length = flowers.length;
        int[] prefixSums = new int[length + 1];
        for (int i = 0; i < length; i++)
            prefixSums[i + 1] = prefixSums[i] + Math.max(0, flowers[i]);
        int maxBeauty = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            int beauty = flowers[i];
            if (map.containsKey(beauty)) {
                int firstIndex = map.get(beauty);
                int beautySum = beauty * 2 + prefixSums[i] - prefixSums[firstIndex + 1];
                maxBeauty = Math.max(maxBeauty, beautySum);
            } else
                map.put(beauty, i);
        }
        System.out.println(maxBeauty);
    }
}
// new