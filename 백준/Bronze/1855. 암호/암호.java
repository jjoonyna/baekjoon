

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
		
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String message = st.nextToken();
		char[] messageArr = message.toCharArray();
		Queue<Character> messageQueue = new LinkedList<Character>();
		for(int i=0; i<messageArr.length; i++) {
			messageQueue.add(messageArr[i]);
		}
		char[][] arr= new char[messageArr.length/K][K];
		
		for(int i=1; i<=arr.length; i++) {
			if(i%2==0) {
				for(int j=K; j>0; j--) {
					arr[i-1][j-1] = messageQueue.poll();				}
			}else if(i%2==1) {
				for(int j=0; j<arr[i-1].length; j++) {
					arr[i-1][j] = messageQueue.poll();
				}
			}
		}

		int a=0;
		int b=0;
		
		
		while(b!=K) {
			System.out.print(arr[a][b]);
			a++;
			if(a==messageArr.length/K) {
				a=0;
				b++;
			}
		}
		
		br.close();
		bw.close();
		
	}

}
