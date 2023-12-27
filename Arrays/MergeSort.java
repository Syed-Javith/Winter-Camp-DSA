public class MergeSort {
    public static void merge(int[] a , int l , int h , int m){
        int n1 = m - l + 1;
        int n2 = h - m ;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0 ; i < n1 ; i++)
         L[i] = a[l+i];
        for(int j = 0 ; j < n2 ; j++)
         R[j] = a[m + 1 + j];
         
        int lptr = 0 , rptr = 0 , k = l ;
        
        while(lptr < n1 && rptr < n2 ){
            if(L[lptr] < R[rptr]){
                a[k] = L[lptr];
                lptr++;
            }else{
                a[k] = R[rptr];
                rptr++;
            }
            k++;
        }
        
        while(lptr < n1){
            a[k] = L[lptr];
            lptr++;
            k++;
        }
        while(rptr < n2){
            a[k] = R[rptr];
            rptr++;
            k++;
        }
        
        
    }
    
    public static void printArray(int[] a){
        for(int i = 0 ; i < a.length ; i++ ){
            System.out.print(a[i] + " ");
        }
    }
    
    
    public static void mergeSort(int[] a , int l , int h){
        if(l<h){
            int m = (l+h)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,h);
            merge(a,l,h,m);
        }
    }
    
	public static void main(String[] args) {
		int[] a = {1,5,0,2,6,9};
		int n = a.length;
		mergeSort(a,0,n-1);
		printArray(a);
	}
}