import java.io.*;
import java.util.*;

public class Main{
   public static void main(String[] args) {
      System.out.println("Counting up numbers from text file");
      String filename = "lines_of_code_from_my_public_repos.txt";
      File linesOfNumbers = new File(filename);
      try {
         Scanner infile = new Scanner(linesOfNumbers);
         int total = 0;
         while (infile.hasNext()) {
            System.out.println("Current total: " + total);
            total += Integer.parseInt(infile.next());
            
         }
         System.out.println("Final sum: " + total);
         
         
         infile.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
}