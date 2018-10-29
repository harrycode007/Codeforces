import java.util.*;
 
public class CodeForces {
 
   public static void main(String args[])
   {
      String original, reverse = ""; 
      Scanner in = new Scanner(System.in);
 
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
    
         #reverse+=original.charAt(i);
 
      if (!original.equals(reverse))
         System.out.println(original.length());
         
      else if(original.startsWith(reverse.substring(1)))
         System.out.println(0);
         
      else 
         System.out.println(original.length()-1);
 
    in.close();
   }
}	
