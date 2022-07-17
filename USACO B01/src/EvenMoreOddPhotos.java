import java.util.*;


public class EvenMoreOddPhotos {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++) {
			if(in.nextInt()%2==1) odd++;
			else even++;
		}
		
		while(odd>even) {
			odd-=2;
			even++;
		}
		
		if(even-1>odd) System.out.println(odd*2+1);
		else System.out.println(odd+even);
		
	}
	
	

}
