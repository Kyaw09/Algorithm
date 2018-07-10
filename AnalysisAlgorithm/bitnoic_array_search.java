package AnalysisAlgorithm;
import java.util.Scanner ; 
public class bitnoic_array_search {
	static Scanner input = new Scanner(System.in) ; 
	private static int[] A ; 
	public static void main(String[] args) {
		A = new int[input.nextInt()] ; 
		A[0] = input.nextInt();
		int index = 0,max = A[0] ; 
		for(int i = 1; i<A.length; i++) {
			A[i] = input.nextInt() ; 
			if( max < A[i]){max = A[i]; index = i;}
		}
		System.out.print("Enter value to check ");
		int target = input.nextInt() ; 
        System.out.println((find(target, index))?"in array":"not in array");
	}
	public static boolean find(int target,int index) {
		return binarySearch_bitnoic(target,0,index,false) || binarySearch_bitnoic(target,index+1,A.length-1,true) ; 
	}
	public static boolean binarySearch_bitnoic(int target,int start,int end,boolean desc) {
		int meduim = (start+end)/2 ; 
		if(start > end)return false ; 
		if( target == A[meduim] ) return true ; 
		if((desc&&target<A[meduim])||(!desc&&target>A[meduim])) return binarySearch_bitnoic(target, meduim+1, end, desc);
		else return binarySearch_bitnoic(target, start, meduim-1, desc);
	}
}
