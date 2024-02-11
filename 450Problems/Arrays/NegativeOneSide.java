public class NegativeOneSide {
    public static void remove(int[] arr , int index){
        int last = arr[index];
        for(int i = index ; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=last;
    }
    public static void main(String[] args) {
        int[] arr = { 3,5,-1,6,7,1,-1 };
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                remove(arr,i);
            }
        }
        for(int e : arr){
            System.out.println(e);
        }
    }
}
