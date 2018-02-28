// Time complexity O(n^2) for all values of n

public class SelectionSort {
	public static <A extends Comparable<A>> void sort(A[] arr){
		int len = arr.length;
		for(int i = 0;i < len;i++){
			int min = i; // Fix the position to, find the element whose value is min in whole array 
			for(int j = i + 1; j< len ;j++){
				if(arr[min].compareTo(arr[j]) > 0){
					min = j	;
				}
			}
			A temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
	}
	public static <A extends Comparable<A>> void printArray(A[] arr){
		int len = arr.length;
		for(int i = 0;i < len;i++){
			System.out.println(arr[i]);
		}	
	}


	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
        Integer arr[] = {64, 34, 25, 12, 22, 11, 90};
        Character chararr[] = {'a', 'd', 'c', 'z', 'l'};
        Double arr1[] = {64.3, 34.6, 25.1, 12.9, 22.12, 11.11, 90.0};
        sort(arr); //INPLACE sorting
        sort(chararr);
        sort(arr1);
        printArray(arr);
        printArray(chararr);
        printArray(arr1);
		// TODO Auto-generated method stub

	}

}
