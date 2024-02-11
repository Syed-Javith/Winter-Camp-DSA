
public class CyclicRotate {
    public static void main(String[] args) {
        int[] arr = { 3,5,6,7,1 };
        int temp = arr[0],i;
        for( i = 1 ; i < arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[i-1] = temp;
        for(int e : arr) System.out.println(e);
    }    
}
