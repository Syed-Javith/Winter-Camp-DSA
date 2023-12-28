public class QuickSort
{
    public static void quickSort(int[] a , int l , int h){
        if(l<h){
            
            int pivot = l;
            int i = l + 1;
            int j = h;
            while(i<j){
                while(a[i]<=a[pivot])
                 i++;
                while(a[j]>=a[pivot])
                 j--;
                if(i<j){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            int temp = a[pivot];
            a[pivot] = a[j];
            a[j] = temp;
            quickSort(a,l,j-1);
            quickSort(a,j+1,h);
        }
    }
	public static void main(String[] args) {
		int[] a = {3,4,5,9,1};
		quickSort(a,0,4);
		for(int e : a){
		    System.out.println(e);
		}
	}
}