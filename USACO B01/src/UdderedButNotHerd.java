import java.io.*;
import java.util.*;

public class UdderedButNotHerd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String word = in.next();
		int[] order = new int[26];
		for(int i=0;i<26;i++) {
			order[a.charAt(i)-'a'] = i;
		}
		
		int result = 1;
		for(int i=1;i<word.length();i++) {
			int cur = order[word.charAt(i)-'a'];
			int pre = order[word.charAt(i-1)-'a'];
			if(cur<=pre) {
				result++;
			}
		}
		
		System.out.println(result);

	}

}
