package Union_Find;
import java.util.*; 
public class TestDrive {
	static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
	    System.out.print("Enter number of element ");
	    int N = input.nextInt() ; 
	    //Quick_Find_1 a =new  Quick_Find_1(N);
	   // QuickUnion a1 = new QuickUnion(N) ; 
	    //WeightingQU a2 = new WeightingQU( N) ;
	    WeightingQUWithPC a3 = new WeightingQUWithPC(N) ; 
	    int p , q;
	    long StartTime = System.currentTimeMillis() ; 
	    do {
	    	  System.out.print("Enter two elements or you want to end enter -1 two time");
	    	   p = input.nextInt(); 
	    	   q = input.nextInt();
	    	   if(p == -1) {System.out.println("Program is end");  long EndTime = System.currentTimeMillis() ; 
	   	    long testTime = EndTime - StartTime  ; 
		    System.out.println(testTime);System.exit(1);} 
	    	   if(a3.connected(p, q)) System.out.println("Tow numbers are connected ");
	    	   else { a3.union(p, q); System.out.println(p + "   " + q);}
	    }while(p != -1); 
   }
}
