import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt();
		
		if(w ==2 || w % 2 ==1)
			System.out.println("NO");
		else if(w % 2 == 0)
			System.out.println("YES");
		
	}
	
}
