// Time complexity is evaluated using master theorem
// 1.T/2 for sort
//2.T/2 for sort
//3. n for merge
// T(n) = 2(T/2) + n = n log n(since a = b )
public class MergeSort {
	public static <A extends Comparable<A>> void sort(A[] arr, int l, int r){
		if(l<r){
			int m = (l + r)/2;
			sort(arr, l, m);
			sort(arr, m+1, r);
			merge(arr, l,m,r);
		}

	}
	public static <A extends Comparable<A>> int invertionCount(A[] arr, int l, int r){
		int inv_count = 0;
		if(l<r){
			int m = (l + r)/2;
			inv_count = invertionCount(arr, l, m);
			inv_count += invertionCount(arr, m+1, r);
			inv_count += Counter(arr, l,m,r);//Same as merge below , with change to count inverstion
		}
		return inv_count;
	}
	public static <A extends Comparable<A>> int Counter(A[] arr, int l, int m,int r){
		int i= l;
		int h = l;
		int j = m+1;
		int inv_count = 0;
		@SuppressWarnings("unchecked")
		A[] b = (A[])new Comparable[10000];
		while(i<= m && j <= r){
			if(arr[i].compareTo(arr[j]) > 0){
				b[h++] = arr[j++];
				System.out.println("INverstion in current parts:" + (m-i));
				inv_count = inv_count + 1 + (m -i);
			}
			else{
				b[h++] = arr[i++];
			}
		}
		if(i > m){
			for(int k = j;k <= r; k++){
				b[h++] = arr[k];
			}
		}
		else{
			for(int k = i; k <= m;k++){
				b[h++] = arr[k];
				
			}
		}
		for(int k = l;k <= r;k++){
			arr[k] = b[k];
		}
		return inv_count;
	}
	
	
	public static <A extends Comparable<A>> void merge(A[] arr, int l, int m,int r){
		int i= l;
		int h = l;
		int j = m+1;
		@SuppressWarnings("unchecked")
		A[] b = (A[])new Comparable[10000];
		while(i<= m && j <= r){
			if(arr[i].compareTo(arr[j]) > 0){
				b[h++] = arr[j++];
			}
			else{
				b[h++] = arr[i++];
			}
		}
		if(i > m){
			for(int k = j;k <= r; k++){
				b[h++] = arr[k];
			}
		}
		else{
			for(int k = i; k <= m;k++){
				b[h++] = arr[k];
				
			}
		}
		for(int k = l;k <= r;k++){
			arr[k] = b[k];
		}
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
		Integer arr[] = {12, 11, 13, 5, 6, 7};
		Character chararr[] = {'a', 'd', 'c', 'z', 'l'};
		 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        sort(arr, 0, arr.length-1);
        sort(chararr, 0, chararr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
        printArray(chararr);
        Integer arr1[] = {12, 11, 13, 5, 6, 7};
        System.out.println(invertionCount(arr1, 0, arr1.length-1));
		// TODO Auto-generated method stub

	}

}
