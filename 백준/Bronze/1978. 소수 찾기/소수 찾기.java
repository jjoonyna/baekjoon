

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int [N];
		int count = 0;
		st = new StringTokenizer(br.readLine());

		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < arr.length; i++) {
			int check = 2;
			if (arr[i] != 1) {
				for (int j = 1; j < arr[i]; j++) {
					if (arr[i] % j !=0 ) {
						check++;
					}
					if(check==arr[i]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		
		br.close();
		bw.close();
		
	}

}
