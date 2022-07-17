import java.util.*;

public class DoYouKnowYourABCs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[7];
		for(int i=0;i<7;i++) {
			nums[i] = in.nextInt();
		}
		
		Arrays.sort(nums);
		int a=nums[0];
		int b=nums[1];
		
		int c =0;
		for(int i=2;i<7;i++) {
			if(nums[i]!= nums[0]+nums[1]) {
				c=nums[i];
				break;
			}
		}
		
		System.out.println(a+" "+b+" "+c);
	}

}
