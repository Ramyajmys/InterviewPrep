//This solution is based on BACKTRACKING , in line 12 we swap back the values which reverts it back to previous position

public class Permutation {
	static final int max = 256;//Include all char
	public static void permute(String str, int l,int r){
		if(l == r){
			System.out.println(str);
		}
		else{
			for(int i =l;i<= r ;i++){
				str = swap(str,l, i);
				permute(str, l+1, r);
				str = swap(str,l, i); //BACKTRACKING
			
			}
		}
	}
	public static String swap(String str, int l,int r){
		char[] arr = str.toCharArray();
		char temp = arr[l];
		arr[l] = arr[r];
		arr[r]= temp;
		return String.valueOf(arr);
		
	}
	//1111 , 1110, 1101, 1100, 1011, 1010 , num1 are always greater or equal to num0 and appears before 0's
	public static void GenerateMax1Perm(int num1, int num0, String str, int len){
		if(len == str.length()){
			System.out.println(str);
			return;
		}
		GenerateMax1Perm(num1+1, num0, str+"1", len);//TRIED num1++ didnot work y?
		
		if(num1 > num0){
			GenerateMax1Perm(num1, num0+1, str+"0", len);
		}
	}
	//Anagram substring permutations 0(nm)
	public static void AnagramSub(String str, String pat){
		int n = str.length();
		int m = pat.length();
		char[] countP = new char[max];
		char[] countT = new char[max];
		//char[] 
		for(int i = 0; i< m ;i++){
			(countP[pat.charAt(i)])++;
			(countT[str.charAt(i)])++;	
		}
		for(int i = m ;i < n; i++){
			if(java.util.Arrays.equals(countP, countT)){
				System.out.println("Matching index at : " + (i-m));
			
			}
			(countT[str.charAt(i)])++;	
			(countT[str.charAt(i-m)])--;	
		}
		if(java.util.Arrays.equals(countP, countT)){
			System.out.println("Matching index at : " + (n-m));
		
		}
	}
	
	

	
	public static void main(String[] args) {
		String s = "ABCD";
		String txt = "BACDBABCDA";
        String pat = "ABCD";
        //search(pat, txt);
		permute(s, 0, s.length() -1);
		GenerateMax1Perm(0,0,"",4);
		AnagramSub(txt,pat);
		// TODO Auto-generated method stub

	}

}
