
import java.io.*;
import java.util.*;

public class AngryCows {

	static int n;
	static int[] pos;
	static boolean[] exploded;
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("angry.in"));
		n = in.nextInt();
		pos = new int[n];
		for(int i=0;i<n;i++) {
			pos[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(pos);
		exploded = new boolean[n];
		
		int max = 1;
		
		for(int i=0;i<n;i++) {
			int count = 0;
			
			exploded[i] = true;
			explode(1,pos[i]);
			
			
			for(int j=0;j<n;j++) {
				if(exploded[j]) count++;
			}
			
			if(count>max) max=count;
			Arrays.fill(exploded, false);
		}

		PrintWriter out = new PrintWriter(new File("angry.out"));
		out.println(max);
		out.close();

	}

	public static void explode(int r, int current) {
		
		boolean[] toBe=new boolean[n];
		for(int i=0;i<n;i++) {
			if(pos[i]<=current+r && pos[i]>= current-r && !exploded[i]) {
				exploded[i] = true;
				toBe[i] = true;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(toBe[i]) explode(r+1, pos[i]);
		}
	}
	
}
