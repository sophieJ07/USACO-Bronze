import java.io.*;
import java.util.*;

public class JustStalling {

	static int result;
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		result = 0;
		
		int n = in.nextInt();
		int[] heights = new int[n];
		int[] stalls = new int[n];
		for(int i=0;i<n;i++) {
			heights[i] = in.nextInt();
		}
		for(int i=0;i<n;i++) {
			stalls[i] = in.nextInt();
		}
		
		pos(0, heights, stalls);
		System.out.println(result);

	}

	public static void pos(int cur, int[] heights, int[] stalls) {
		if(cur == heights.length) {
			result++;
			return;
		}
		
		for(int i=0;i<stalls.length;i++) {
			if(heights[cur]<=stalls[i]) {
				int temp = stalls[i];
				stalls[i]=0;
				pos(cur+1, heights, stalls);
				stalls[i] = temp;
			}
		}

	}
}
