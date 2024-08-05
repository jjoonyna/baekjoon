import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		int n=sc.nextInt();
		long sum=0;
		
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int j=1;j<=b;j++) {
				sum+=a;
			}
		}
		
		if(x==sum) {
			System.out.println("Yes");
		}
		else if(x!=sum) {
			System.out.println("No");
		}
		
		sc.close();
	}
}