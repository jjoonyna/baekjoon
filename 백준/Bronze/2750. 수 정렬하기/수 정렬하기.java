import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<A.length;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length-1;j++) {
				int temp = 0;
				if(A[j]>A[j+1]) {
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp; 
				}
			}
		}
		for(int a : A) {
			System.out.println(a);
		}
		sc.close();
	}
}