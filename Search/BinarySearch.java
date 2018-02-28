Time complexity is evaluated using master theorem
// 1.T/2 for half array search
// T(n) = (T/2) + 1 = n ^ 0 log n(since a = b ^ 0 ) = log n
public class BinarySearch {
	public static <A extends Comparable<A>> void search(A[] arr, A elem){
		int low = 0;
		int high = arr.length;
		while(low <= high){
			int mid = low + (high - low )/2;
			if(arr[mid].equals(elem)){
				System.out.println("found element at index :" + mid);
				return;
			}
			if(arr[mid].compareTo(elem) > 0) high = mid - 1;
			else low = mid + 1;
		}
		System.out.println("Not found");
		return;
		
	}

	public static void main(String[] args) {Integer arr[] = {5, 6, 7, 11, 12, 12, 13, 15, 22, 30, 38, 48, 59 };
	Character chararr[] = {'a', 'd', 'c', 'z', 'l','m', 'p', 'o'};
	 
    System.out.println("Given Array");
    search(arr,30);
		// TODO Auto-generated method stub

	}

}
