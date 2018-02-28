//REFER QuickSort solution
//Possible with MinHeap solution
//	-Build MinHeap and call getMin() for k times = n + KLogn
//	-Build a Max-Heap MH of the first k elements (arr[0] to arr[k-1]) of the given array. O(k)
//	after the k’th element (arr[k] to arr[n-1]), compare with root node call heapify by replacing root if value is smaller
//	else continue till end of array - (n-k)logn
//	TOTAL = O(k + (n-k)logn)
