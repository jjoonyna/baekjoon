import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int N = n;
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		
		int[] arr = new int[count];
		for(int i=0,j=10; i<arr.length; i++) {
			arr[i] = N%j;
			N = N/j;
		}
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a : arr) {
			System.out.print(a);
		}
		
		sc.close();
	}

}
