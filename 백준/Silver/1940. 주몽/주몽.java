import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//내가 푼 답
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//재료개수
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		//완성되는 번호 합
		long M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(bf.readLine());
		//재료 번호
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				sum = arr[i]+arr[j];
				if(sum == M) {
					count++;
				}else {
					sum = 0;
				}
				
			}
		}
		System.out.println(count);
    }
}