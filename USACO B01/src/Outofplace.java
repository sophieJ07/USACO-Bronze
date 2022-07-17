//http://www.usaco.org/index.php?page=viewproblem2&cpid=785

import java.util.*;
import java.io.*;

public class Outofplace {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("outofplace.in"));
		int N=in.nextInt();
		int[] order=new int[N];
		for(int i=0;i<N;i++) order[i]=in.nextInt();
		in.close();
		
		int[] correct = Arrays.copyOf(order, N); 
	    Arrays.sort(correct); 
		
		int result=0;
		for(int i=0;i<N;i++) {
			if(correct[i]!=order[i]) result++;
		}
		
		if(result!=0) result--;
		
		PrintWriter out = new PrintWriter(new File("outofplace.out"));
		out.print(result);
		out.close();
	}
}
