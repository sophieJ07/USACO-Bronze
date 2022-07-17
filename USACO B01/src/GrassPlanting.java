import java.io.*;
import java.util.*;

public class GrassPlanting {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("planting.in"));
		int n = in.nextInt();
		int[] degree = new int[n];
		for(int i=0;i<n-1;i++) {
			degree[in.nextInt()-1]++;
			degree[in.nextInt()-1]++;
		}
		in.close();
		
		int max = 1;
		for(int i=0;i<n;i++) {
			if(degree[i]>max) max=degree[i];
		}
		
		PrintWriter out = new PrintWriter(new File("planting.out"));
		out.println(max+1);
		out.close();
	}
	
	

}
