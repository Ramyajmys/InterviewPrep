//Given start and end time of activity, find max work done by 1 worker 
// Algorithm 
// -	Sort by finish time and select activity based on start time > finish time
import java.util.*;
import java.lang.*;
import java.io.*;
class Activity {
	public int start_time;
	public int end_time;
	Activity(int st, int et){
		this.start_time = st;
		this.end_time = et;
	}
	public String toString(){
		return this.start_time + " " + this.end_time;
	}
	
}
class sortActivity implements Comparator<Activity>{
	public int compare(Activity A, Activity B){
		return A.end_time - B.end_time;
	}
}

public class printMaxActivity {
	public static void printMax(Activity arr[], int n){
		Arrays.sort(arr, new sortActivity());
		System.out.println("\nSorted by finish_time");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
        int i =0;
        System.out.println("selected activity :" + arr[0]);
        for(int j = 0;j< arr.length;j++){
        	if(arr[j].start_time >= arr[i].end_time){
        		System.out.println("selected activity :" + arr[j]);
        		i = j;
        	}
        }
	}

	public static void main(String[] args) {
		Activity arr[] = {new Activity(5, 9),
                new Activity(1, 2),
                new Activity(0, 6),
                new Activity(3, 4),
                new Activity(8, 9),
                new Activity(5, 7)};

		int n = arr.length;
		printMax(arr, n);
		// TODO Auto-generated method stub

	}

}
