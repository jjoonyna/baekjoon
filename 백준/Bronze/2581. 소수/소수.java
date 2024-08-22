
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N-M+1];
		int[] number = new int[N-M+1];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=M+i;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=2; j<=arr[i]; j++) {
				if(j==arr[i]) {
					number[i]=j;
					sum += arr[i];
				}else {
					if(arr[i]%j==0) {
						break;
					}
				}
			}
		}
		
		if(sum!=0) {
		System.out.println(sum);
		}else {
			System.out.println(-1);
		}
		
		for(int i=0; i<number.length; i++) {
			if(number[i]!=0) {
				System.out.println(number[i]);
				break;
			}
		}
		
		
		
		br.close();
		bw.close();
		
	}

}
