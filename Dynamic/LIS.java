//Find length longest increasing subsequence in array
// Using Dyanmic programming is to store results of intermediate result and use it rather than recalculating it
// U can use temp array for vector for extra storage
//Time complexity since we use two loops is O(n^2)

public class LIS {
	
	public static<A extends Comparable<A>>  void lis(A[] arr, int n){
		int b[] = new int[n];
		int max=0;
		for(int i = 0;i< n;i++){
			b[i] = 1;
		}
		for(int j = 1;j< n;j++){
			for(int k = 0;k < j;k++){
				if( arr[j].compareTo(arr[k]) > 0 && b[j] < (b[k] + 1)){
					b[j] = b[k] + 1;
				}
			}
		}
		for(int i = 0;i< n;i++){
			if(max < b[i]){
				max = b[i];
			}
		}
		System.out.println(max);
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
	    lis(arr, arr.length);
	    lis(chararr, chararr.length);

		// TODO Auto-generated method stub

	}

}
