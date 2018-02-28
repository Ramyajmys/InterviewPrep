
public class PatternMatcher {
	public static<A extends Comparable<A>> void subStringSearch(A[] arr, A[] pat){
		int n = arr.length;
		int m = pat.length;
		for(int i =0; i< n-m; i++){
			int j = 0;
			while(j< m && arr[j].equals(pat[j])){
				j++;
			}
			if(j == m) System.out.println("Pattern found at index" + i+1);
		}
		System.out.println("Pattern not found");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
