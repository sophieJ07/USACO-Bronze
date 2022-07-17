import java.util.Scanner;

public class AirCownditioning {
	
	static int[] t, p;
	static int n, start, finish;
	static int result;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		p = new int[n];
		t = new int[n];
		result = 0;
		
		for(int i=0;i<n;i++) {
			p[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			t[i] = in.nextInt();
		}
		
		start = 0;
		finish = n-1;
		range();
		
		while(start!=-1) {
			int sw = p[start] - t[start];
			int fw = p[finish] - t[finish];
			int times;
			
			if(sw > 0 && fw>0) {
				times = Math.min(sw, fw);
				//for(int i=0;i<times;i++) {
					change(times, start, finish);
				//}
				
			}else if (sw < 0 && fw < 0) {
				times = Math.max(sw, fw) * -1;
				//for(int i=0;i<times;i++) {
					change(-times, start, finish);
				//}
			}else{
				int difs = Math.abs(sw-0);
				int diff = Math.abs(fw-0);
				if(difs<diff) {
					int af = finish;
					if(sw>0){
						while (p[af] - t[af] < 0) af--;
						change(1, start, af);
					}	
					else {
						while (p[af] - t[af] > 0) af--;
						change(-1, start, af);
					}
				}else {
					int as = start;
					if(fw>0) {
						while (p[as] - t[as] < 0) as++;
						change(1, as, finish);
					}
					else {
						while (p[as] - t[as] > 0) as++;
						change(-1, as, finish);
					}
				}
			}
			range();
			
		}
		
		System.out.println(result);
		
	}
	
	public static void change(int add, int start, int finish) {
		for(int i=start;i<=finish;i++) {
			t[i]+=add;
		}
		result+=Math.abs(add);
	}
	
	public static void range() {
		
		boolean found = false;
		for(int i=start; i<= finish;i++) {
			if(t[i]!=p[i]) {
				start=i;
				found = true;
				break;
			}
		}
		
		for(int i=finish;i>=start;i--) {
			if(t[i]!=p[i]) {
				finish=i;
				found = true;
				break;
			}
		}
		
		if (found == false) {
			start = -1;
			finish = -1;
		}
	}

}
