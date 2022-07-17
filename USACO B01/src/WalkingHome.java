import java.util.Scanner;

public class WalkingHome {
	
	static int result;
	static int n;
	static boolean[][] hasHay;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=0;i<t;i++) {
			n = in.nextInt();
			int k = in.nextInt();
			hasHay = new boolean[n][n];
			in.nextLine();
			
			for(int j=0;j<n;j++) {
				String line = in.nextLine();
				for(int x=0;x<n;x++) {
					hasHay[j][x] = (line.charAt(x) == 'H');
				}
			}
			
			pos(0,0,'N',k);
			System.out.println(result);
			result=0;
		}

	}
	
	public static void pos(int x, int y, char prev, int turns) {
		if(x==n-1&&y==n-1) result++;
		if(hasHay[x][y]) return;
		
		if(x<n && y<n) {
			if(x+1 < n) {
				if(prev != 'D') {
					pos(x+1,y,'R',turns);
				}
				else{
					if(turns > 0) {
						turns--;
						pos(x+1,y,'R',turns);
						turns++;
					}
				}
				
			}
			
			if(y+1 < n) {
				if(prev != 'R') {
					pos(x, y+1, 'D', turns);
				}else {
					if(turns > 0) {
						turns--;
						pos(x, y+1, 'D', turns);
					}
				}
			}
				
		}else {
			return;
		}
	}

}
