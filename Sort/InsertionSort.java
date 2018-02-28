//Time complexity o(n ^ 2)
public class InsertionSort {
	public static <A extends Comparable<A>> void sort(A arr[]){
		int len = arr.length;
		for(int i = 1; i< len;i++){
			A key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j].compareTo(key) > 0){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	 public static<A extends Comparable<A>> void printArray(A arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	public static void main(String[] args) {
	
	Integer arr[] = {12, 11, 13, 5, 6, 7, 30, 22, 38, 48, 59, 12, 15};
	Character chararr[] = {'a', 'd', 'c', 'z', 'l','m', 'p', 'o'};
	 
    System.out.println("Given Array");
    printArray(arr);

    InsertionSort ob = new InsertionSort();
    sort(arr);
    sort(chararr);

    System.out.println("\nSorted array");
    printArray(arr);
    printArray(chararr);
	// TODO Auto-generated method stub

	}
}
