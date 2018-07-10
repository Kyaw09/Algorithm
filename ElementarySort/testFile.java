package ElementarySort;
import java.util.Scanner ; 
public class testFile{
     static Scanner input = new Scanner(System.in);
     static int[] a;
     public static void main(String[] args){
          a = new int[(Integer.parseInt(args[0]))];
	  int i = 0;
	  while(input.hasNext()){
	      a[i] = input.nextInt();
	      i++;
	  }
	  for(int j= 0;j<a.length;j++){
    	      System.out.print(a[j]+" ");
	  }
	  System.out.println(a.length);
     }
}
