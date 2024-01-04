import java.util.HashMap;

class ArrayObject {
    int freq;
    int row;

    ArrayObject(int freq, int row) {
        this.freq = freq;
        this.row = row;
    }
}

public class InstersectionUsingDuplicates {
    public static void main(String[] args) {
        HashMap<Integer, ArrayObject> map = new HashMap<>();
        int[][] arr = { { 1, 2, 3, 4 }, { 3, 5, 6, 7 }, { 1, 3, 5, 9, 0 } };
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                ArrayObject obj = map.getOrDefault(arr[i][j], null);
                if(obj==null)
            }
        }
    }
}
