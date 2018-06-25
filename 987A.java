import java.util.*;

 public class Thanos {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = 0;
		if(n > 0)
		scan.nextLine();
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("purple","Power");
		hm.put("green","Time");
		hm.put("blue","Space");
		hm.put("orange","Soul");
		hm.put("red","Reality");
		hm.put("yellow","Mind");
		
		for(int i=0; i<n; i++) {
		    String key = scan.nextLine();
		    String temp = hm.get(key);
		    if(temp != null) {
		        hm.put(key,null);
		        x++;
		    }
		}
		
		System.out.println(6-n);
		
		for(String temp : hm.values()) {
		    if(temp != null) {
		        System.out.println(temp);
		    }
		}
		
	}
}