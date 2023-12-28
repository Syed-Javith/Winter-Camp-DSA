public class SortZerosToRight
{
	public static void main(String[] args) {
		int[] a = { 0 , 8 , 0 , 2 , 4 };
		int n = 5;
		
		int i = 0 , j = 1;
		while(j<n-1){
		    if(a[i] == 0 && a[j] != 0 ){
		        int temp = a[i];
		        a[i] = a[j];
		        a[j] = temp;
		        
		    }
		    else if(a[i] == 0 && a[j] == 0 ){
		        int temp = a[i];
		        a[i] = a[j+1];
		        a[j+1] = temp;
		    }
		    i++;
		    j++;
		}
		for(int e: a){
		    System.out.println(e);
		}
	}
}