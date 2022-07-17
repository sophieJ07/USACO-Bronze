import java.util.Scanner;

public class LonelyPhoto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String cows = in.next();
		long result = 0;
		
		for(int i=0;i<n-2;i++) {
			
			char l = lonely(cows, i);
			if (l=='0') {
				if(cows.charAt(i)=='G') l='H';
				else l='G';
				
				int index = i+3;
				int found = 0;
				while(index<n){
					if (cows.charAt(index)==l) {
						found = 1;
						break;
					}
					else index++;
				}
				
				if (found ==1) {
					result++;
					
					index++;
					while(index<n && cows.charAt(index)!=l) {
						result++;
						index++;
					}
				}
				
			}
			else{
				result++;
				int index = i+3;
				while(index<n && cows.charAt(index)!=l) {
					result++;
					index++;
				}
			}
		}
		
		System.out.println(result);
	
	}
	
	public static char lonely(String cows, int a) {
		int h = 0;
		int g = 0;
		for(int i=a;i<a+3;i++) {
			if(cows.charAt(i)=='H') h++;
			else g++;
		}
		
		if(h==1) return 'H';
		else if(g==1) return 'G';
		return '0';
	}

}

