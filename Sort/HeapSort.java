//Time complexity = O(nlogn) - n is for atleast one full travel of array and log n is for heapify the remaining array
public class HeapSort {
	 public static <A extends Comparable<A>> void sort(A arr[]){
		 int len = arr.length;
		 for(int i = len/2 - 1;i>= 0; i--){
			 heapify(arr, i, len);
		 }
		 for(int i = len-1 ;i>=0; i--){
			 A temp = arr[0];
			 arr[0] = arr[i];
			 arr[i] = temp;
			 heapify(arr, 0, i);
		 }
	 }
	 public static<A extends Comparable<A>> void heapify(A arr[], int i, int n){
		 int lar = i;
		 int l = 2 * i + 1;
		 int r = 2 * i + 2;
		 if(l < n && arr[lar].compareTo(arr[l]) < 0){
			 lar = l;
		 }
		 if(r < n && arr[lar].compareTo(arr[r]) < 0){
			 lar = r;
		 }
		 if(lar != i){
			 A temp = arr[i];
			 arr[i] = arr[lar];
			 arr[lar] = temp;
			 heapify(arr, lar, n);
		 }
	 }
	 

	/* A utility function to print array of size n */
    public static <A extends Comparable<A>>  void printArray(A arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        Integer arr[] = {12, 11, 13, 5, 6, 7, 1, 10, 16 , 30, 66, 22};
        Character chararr[] = {'a', 'd', 'c', 'z', 'l'};
        Double arr1[] = {64.3, 34.6, 25.1, 12.9, 22.12, 11.11, 90.0};
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        sort(arr);
        sort(chararr);
        sort(arr1);
        printArray(chararr);
        printArray(arr1);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
