
public class kCloseSearch {

	public static <A extends Number & Comparable<A>> int findcrosspt(A[] arr,int low, int high, A elem){
		
		if(arr[high].compareTo(elem) < 0) return high;
		if(arr[low].compareTo(elem) > 0) return low;
		int mid = low + (high - low )/2;
		if(arr[mid].compareTo(elem) <= 0 && arr[mid+1].compareTo(elem) > 0){
				System.out.println("found element at index :" + mid);
				return mid;
		}
			
		if(arr[mid].compareTo(elem) < 0 ) return findcrosspt(arr,mid + 1,high, elem);
		
		return findcrosspt(arr,low,mid-1, elem);
		
	}
	
	public static <A extends Number & Comparable<A>> void kclose(A[] arr, A elem, int n, int k){
		int l = findcrosspt(arr, 0, n-1, elem);
		int r  =  l+1;
		int count = 0;
		if(arr[l].equals(elem)) l--;
		while(l < n && r < n && count < k){
			if(elem instanceof Integer && arr[l] instanceof Integer && arr[r] instanceof Integer){
		        Number diff1 = ((Integer)elem - (Integer)arr[l]);
				Number diff2 = ((Integer)arr[r] - (Integer)elem);
				if( diff1.intValue() < diff2.intValue())
					System.out.println(arr[l--]);
				else
					System.out.println(arr[r++]);
				count++;
			}
			if(elem instanceof Double && arr[l] instanceof Double && arr[r] instanceof Double){
		        Number diff1 = ((Double)elem - (Double)arr[l]);
				Number diff2 = ((Double)arr[r] - (Double)elem);
				if( diff1.doubleValue() < diff2.doubleValue())
					System.out.println(arr[l--]);
				else
					System.out.println(arr[r++]);
				count++;
			}
			
		}
		while(count < k && l >=0){
			System.out.println(arr[l--]);
			count++;
			
		}
		while(count < k && r < n){
			System.out.println(arr[r++]);
			count++;
		}	
	}

	public static void main(String[] args) {
	Integer arr[] = {5, 6, 7, 11, 12, 13, 15, 22, 30, 31, 35,38, 48, 59, 100 };
	Character chararr[] = {'a', 'd', 'c', 'z', 'l','m', 'p', 'o'};
	 
    System.out.println("Given Array");
    kclose(arr,30,arr.length, 5);
		// TODO Auto-generated method stub

	}

}
