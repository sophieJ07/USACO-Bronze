import java.io.*;
import java.util.*;

public class MilkFactory {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("factory.in"));
		int n = in.nextInt();
		int[] path = new int[n];
		
		for(int i=0;i<n-1;i++) {
			path[in.nextInt()-1]++;
			int store = in.nextInt();
		}
		in.close();
		
		int result = -1;
		for(int i=0;i<n;i++) {
			if(path[i]==0 && result != -1) {
				result = -1;
				break;
			}
			if(path[i]==0) result = i+1;
		}
		
		PrintWriter out = new PrintWriter(new File("factory.out"));
		out.println(result);
		out.close();

	}

}
