public class Intersection {
    public static void intersection(int[] a1 , int[] a2){
        int i = 0 , j = 0;
        while(i< a1.length - 1 && j < a2.length - 1){
            if(a1[i] > a2[j]){
                j++;
            }
            if (a1[i] < a2[j]) {
                i++;
            }
            if(a1[i] == a2[j]){
                System.out.println(a1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] a1 = { 1 , 3 , 4 , 9  };
        int[] a2 = { 2 , 4 ,5 };
        intersection(a1, a2);
    }
}
