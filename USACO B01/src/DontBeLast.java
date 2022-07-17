import java.io.*;
import java.util.*;

public class DontBeLast {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("notlast.in"));
		
		Map<String, Integer> cows = new TreeMap<>();
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			String name = in.next();
			int milk = in.nextInt();
			if(cows.containsKey(name)) cows.put(name, milk+cows.get(name));
			else cows.put(name, milk);
		}
		in.close();
		
		
		int min = Integer.MAX_VALUE;
		if(cows.keySet().size()<7) min = 0;
		int sMin = Integer.MAX_VALUE;
		int minC = 0;
		int smC = 0;
		
		for(int milk : cows.values()) {
			if(milk<min) {
				sMin = min;
				smC = minC;
				min = milk;
				minC=1;
			}else if(milk == min) minC++;
			else {
				if (milk<sMin) {
					sMin = milk;
					smC = 1;
				}
				else if(milk == sMin) smC++;
			}
		}
		

		PrintWriter out = new PrintWriter(new File("notlast.out"));
		if(sMin == Integer.MAX_VALUE || smC>1) out.println("Tie");
		else out.println(name(sMin, cows));
		out.close();

	}
	
	public static String name(int num, Map<String,Integer> x){
		for(String n:x.keySet()) {
			if(x.get(n)==num) return n;
		}
		
		return null;
		
	}
	

}
