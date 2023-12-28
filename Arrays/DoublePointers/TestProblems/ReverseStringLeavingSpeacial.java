public class ReverseStringLeavingSpeacial {
	public static void main(String[] args) {
		String str = "Hello-wo-rld";
		char[] a = str.toCharArray();
		int i = 0 , j = str.length() -1;
		while(i<j){
		    if(!Character.isAlphabetic(a[i])){
		        i++;
		    }
		    else if(!Character.isAlphabetic(a[j])){
		        j--;
		    }else{
		        char temp = a[i];
		        a[i] = a[j];
		        a[j] = temp;
		        i++;
		        j--;
		    }
		}
		for(char e : a){
		    System.out.print(e);
		}
	}
}