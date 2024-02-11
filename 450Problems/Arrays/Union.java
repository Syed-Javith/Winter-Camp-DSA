import java.util.ArrayList;

public class Union {
    public static void union(int [] a1 , int[] a2 , ArrayList<Integer> al){
        int i = 0 , j = 0 ;
        while(i<a1.length && j<a2.length){
            if(a1[i]!=a2[j]){
                al.add(a1[i]);
                al.add(a2[j]);
            }else{
                al.add(a1[i]);
            }
            i++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[] a1 = { 3,5,6,7,10 };
        int[] a2 = { 4,10,12,18 };
        ArrayList<Integer> al = new ArrayList<>();
        union(a1,a2,al);
        for(int e : al){
            System.out.println(e);
        }
        // System.out.println("abc".charAt(0) - 'a');
    }    
}
