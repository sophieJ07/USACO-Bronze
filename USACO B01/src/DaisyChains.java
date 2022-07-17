import java.util.*;

public class DaisyChains {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] flowers = new int[n];
		for(int i=0;i<n;i++) {
			flowers[i]=in.nextInt();
		}
		
		int result = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum = 0;
				for(int x=i;x<=j;x++) {
					sum+=flowers[x];
				}
				for(int x=i;x<=j;x++) {
					if(flowers[x]*(j-i+1)==sum) {
						result++;
						break;
					}
				}
			}
		}
		
		System.out.println(result);
	}

}
