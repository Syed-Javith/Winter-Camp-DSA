public class Reverse{
    public static void main(String[] args){
        int[] arr = { 3,5,6,7,1 };
        int i  = 0, j  = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int e : arr){
            System.out.println(e);
        }
    }
}