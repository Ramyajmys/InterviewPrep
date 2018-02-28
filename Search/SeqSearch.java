// Time complexity O(n) for all values of n

public class SeqSearch {
	public static <A extends Comparable<A>> Boolean search(A[] arr, A elem){
		int len = arr.length;
		for(int i =0;i<len;i++){
			if(elem.equals(arr[i])){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Integer arr[] = {64, 34, 25, 12, 22, 11, 90};
		Boolean res = search(arr, 65); 
		System.out.println("Result : " + res);
		// TODO Auto-generated method stub
	}
}