
public class SortBinary {
    public static void main(String[] args) {
        int[] arr = { 0,2,1,0,2 };
        int c0=0,c1=0,c2=0;
        for(int e : arr){
            if(e==0)
             c0++;
            if(e==1)
             c1++;
            else
             c2++;
        }
        int i = 0 ;
        while(i<c0){
            arr[i] = 0;
            i++;
        }
        while(i<c0+c1){
            arr[i]=1;
            i++;
        }
        while(i<arr.length){
            arr[i]=2;
            i++;
        }
        for(int e : arr)
         System.out.println(e);
    }
}
