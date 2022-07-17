import java.io.*;
import java.util.*;

public class Race{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("race.in"));
		PrintWriter out = new PrintWriter(new File("race.out"));
		int k = in.nextInt();
		int n = in.nextInt();
		int[] xList = new int[n];
		for(int i=0;i<n;i++) {
			xList[i] = in.nextInt();
		}
		in.close();
		
		int x, speed, distance;
		
		for(int i=0;i<n;i++) {
			x=xList[i];
			speed=1;
			distance=k-1;
			int result = 1;
			
			while(distance>0) {
				if(CanBeAdded(distance, speed+1, x)) {
					speed++;
					distance-=speed;
					result++;
				}else if(CanBeAdded(distance, speed, x)) {
					distance-=speed;
					result++;
				}else if(CanBeAdded(distance, speed-1,x)) {
					speed--;
					distance-=speed;
					result++;
				}else {
					break;
				}
			}
			
			out.println(result);
		}
		out.close();
		
	}
	
	public static boolean CanBeAdded(int distance, int speed, int x) {
		
		if (speed<=x) return true;
		
		int sum = 0;
		for (int i=speed;i>=x;i--) {
			sum += i; 
			if (sum > distance+x-1)
				return false;
		}
		return true;
	}

}
