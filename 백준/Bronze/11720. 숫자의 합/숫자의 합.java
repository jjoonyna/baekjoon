import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//  정답
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	char[] arr = s.toCharArray();
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		String as = String.valueOf(arr[i]);
		sum += Integer.parseInt(as);
	}
	System.out.println(sum);
    }
}