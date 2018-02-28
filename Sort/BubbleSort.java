// Time complexity O(n^2) for all values of n

class BubbleSort{
	
	public static <A extends Comparable<A>> void sort(A[] arr){
		int len = arr.length;
		for(int i = 0;i < len-1;i++){
			for(int j =0; j< len-i-1;j++){ //Bubble up largest element to end and start over again from beggining so j =0
				if(arr[j].compareTo(arr[j+1]) > 0){
					//Swap elements
					A temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static <A extends Comparable<A>> void printArray(A[] arr){
		int len = arr.length;
		for(int i = 0;i < len;i++){
			System.out.println(arr[i]);
		}	
	}

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        Integer arr[] = {64, 34, 25, 12, 22, 11, 90};
        Character chararr[] = {'a', 'd', 'c', 'z', 'l'};
        Double arr1[] = {64.3, 34.6, 25.1, 12.9, 22.12, 11.11, 90.0};
        sort(arr); //INPLACE sorting
        sort(chararr);
        sort(arr1);
        printArray(arr);
        printArray(chararr);
        printArray(arr1);
    }
}
