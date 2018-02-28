#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;
template <class T>
void bucketSort(T arr[], int n){
 vector<T> b[n];
 for(int i =0;i< n;i++)
 {
 	if(typeid(arr[i]) == typeid(int))
	{
		int bi = countDigit(arr[i]);
		b[bi].push_back(arr[i]);
	}
	if(typeid(arr[i]) == typeid(float)){
		int bi = n*arr[i];
		b[bi].push_back(arr[i]);
	}
 }
 for(int i =0;i<n;i++){
	 sort(b[i].begin(), b[i].end());
 }
 int index =0;
 for(int i =0;i<n;i++){
	 for(int j =0;j<b[i].size();j++){
	 	arr[index++] = b[i][j];
	 }
 }
}
template <class T>
int countDigit(T arr[]){
return 0;	
}
int main(){
	float arr[] = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};
	int n = sizeof(arr)/sizeof(arr[0]);
	bucketSort(arr, n);

	cout << "Sorted array is \n";
	for (int i=0; i<n; i++)
		cout << arr[i] << " ";
	return 0;
}
