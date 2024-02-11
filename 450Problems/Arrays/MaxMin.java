public class MaxMin {
    public static void main(String[] args) {
        int[] arr = { 3,5,6,7,1 };
        int min = arr[0] , max = arr[0]; 
        for(int i = 0 ; i < arr.length ; i++){
            if(min>arr[i])
             min=arr[i];
            if(max<arr[i])
             max=arr[i];
        }
        System.out.println(min + " " + max);
    }
}
