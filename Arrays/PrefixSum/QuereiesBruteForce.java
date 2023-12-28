import java.util.Scanner;

public class QuereiesBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[][] queries = {{ 0,3 },{2,5},{2,4}};
		
		for(int i = 0 ; i < n ; i++){
		    a[i] = sc.nextInt();
            
		}
        int limit = sc.nextInt();
       
		for(int i = 0 ; i < 3 ; i++){
		    int sum = 0 ;
		    for(int j = queries[i][0] ; j <= queries[i][1] ; j++){
		        sum += a[j];
		        // System.err.print(j+" ");
		    }
            // System.err.println(sum);
		    if(sum <= limit){
		            System.out.println(true);
		    }else{
		            System.out.println(false);
		    }
		}
    }
}
