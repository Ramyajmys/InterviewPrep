//suited only for NUMBERS so doing only 4 numbers because we use counting sort with particalur range
// d num of digits Radix Sort takes O(d*(n+b)) b is base of number eg 10 in below case
import java.util.Arrays;
public class RadixSort {
	public static int getMax(int arr[]){
		int max = arr[0];
		int i;
		for( i = 1; i < arr.length;i++){
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
	public static void countSort(int arr[], int exp){
		int output[] = new int[arr.length];
		int count[] = new int[10];
		int i;
		Arrays.fill(count,0);
		
		for( i=0;i< arr.length; i++){
			count[(arr[i]/exp)%10]++;
		}
		for( i =1;i< 10; i++){
			count[i] += count[i-1];	
		}
		for(i = arr.length - 1; i >= 0; i--){ /// NOTE VERY IMPORTANT , reversing for 0 - n will setup MSB so will not work
			output[count[(arr[i]/exp)%10] -1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for( i =0;i< arr.length; i++){
			arr[i] = output[i];
		}
	}
	
	public static void sort(int arr[]){
		int max = getMax(arr);
		for(int i = 1; max/i > 0; i *=10 ){
			countSort(arr, i);
			
		}
	}

	/* A utility function to print array of size n */
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	public static void main(String[] args) {
		int arr[] = {12 ,1, 16, 13, 12, 11, 10, 12, 22, 22, 66, 22 };
		RadixSort ob = new RadixSort();
        sort(arr);
       
        printArray(arr);
		// TODO Auto-generated method stub

	}

}
