package ElementarySort;
import java.io.File;
import java.util.*;
public class FileSorter{
   public static void main(String[] args){
      File directory = new File(args[0]);
      File[] files = directory.listFiles() ; 
      Arrays.sort(files);
      for(int i = 0 ; i < files.length ; i++){
         System.out.println(files[i].getName());
      }
   }
}
