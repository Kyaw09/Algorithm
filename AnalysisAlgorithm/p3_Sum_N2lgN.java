package AnalysisAlgorithm;
import java.util.Scanner ;
import java.util.Arrays; 
public class p3_Sum_N2lgN {
	static Scanner input = new Scanner(System.in) ; 
	private static int[] A ; 
      public static void main(String[] args) {
    	  A =new int[input.nextInt()] ; 
    	  for(int i = 0 ; i < A.length ; i++) {
    		  A[i] = input.nextInt() ; 
    	  }
    	  Arrays.sort(A);
    	 for(int i = 0 ; i < A.length ; i++) {
    		 int j = i + 1;
    		 int k=A.length-1; 
    		 while(j <= k) {
    			 int sum = A[i] + A[j] + A[k] ; 
    			 if(sum == 0) System.out.println(i+":"+A[i]+j+":"+A[j]+k+":"+A[k]);
    			 if(sum >= 0) k-- ; 
    			 else j++ ; 
    		 }
    	 }
      }
}
