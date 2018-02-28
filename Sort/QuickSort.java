// Time complexity is evaluated using master theorem
// 1.T/2 for sort
//2.T/2 for sort
//3. n for merge
// T(n) = 2(T/2) + n = n log n(since a = b ), worst case is O(n^2)
public class QuickSort {
	public static <A extends Comparable<A>> void sort(A[] arr, int l, int r){
		if(l<r){
			int m = partition(arr, l,r);
			sort(arr, l, m-1);
			sort(arr, m+1, r);
		}

	}
	public static <A extends Comparable<A>> int partition(A[] a, int l, int r){
		int pivot = l;
		int i,j;
		//int i = l + 1;
		//int j = r;
		for( i= l, j = r + 1; i<j; ){
			i++;
			while(a[i].compareTo(a[pivot]) < 0 && i < r) i++;
			j--;
			while(a[j].compareTo(a[pivot]) > 0 && j > l) j--;
			if(i<j){
				A temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	
		A temp = a[pivot];
		a[pivot] = a[j];
		a[j] = temp;
		
		return j;
	}
	//The worst case time complexity of this method is O(n2), but it works in O(n) on average. 
	public static<A extends Comparable<A>> A findksmallest(A arr[], int k, int l, int r){
		if(k > 0 && k <= arr.length)
		{
			int pos = partition(arr, l, r);
			if(pos == k-1) 
			{
				System.out.println(arr[pos]);
				return arr[pos];
			}
			if(pos > k-1) 
				return findksmallest(arr, k, l, pos-1);
			else 
				return findksmallest(arr, k, pos+1, r);
		}
		return null;
	}
	/* A utility function to print array of size n */
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
 
        QuickSort ob = new QuickSort();
        System.out.println("K smallest element is :" + findksmallest(arr,4,0,arr.length-1));
        sort(arr, 0, arr.length-1);
        sort(chararr, 0, chararr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
        printArray(chararr);
		// TODO Auto-generated method stub

	}

}
