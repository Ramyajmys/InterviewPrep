//Given arr[1-m] arr[1-n] SORTED and number x, find sum of number from the both array whose values nearest to x
//ALgorithm is based on MergeSort , merge function for 2 different array 
//	- start l point to a[1] and r pointing to b[n]
//	- calculate abs(l + r -x) < diff, index assign res_l, res_r continue
//	- if( l + r ) < x , l++
//	- else r--
