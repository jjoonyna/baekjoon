import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
		char[] str = a.toCharArray();
		String answer = "";
		for(int i=0; i<str.length; i++) {
			if(str[i]<=90) {
				str[i] += 32;
			}else {
				str[i] -= 32;
			}
		}
		for(int i=0; i<str.length; i++) {
			answer += str[i];
		}
		System.out.println(answer);
    }
}