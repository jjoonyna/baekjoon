
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int T = Integer.parseInt(st.nextToken());
		int[] A = new int[T]; 
		int[] B = new int[T];
		for(int i = 0; i<T; i++) {
			 StringTokenizer sta = new StringTokenizer(bf.readLine());
			 A[i] =Integer.parseInt(sta.nextToken());
			 B[i] =Integer.parseInt(sta.nextToken());
		}
		 
		for(int i = 0; i<T; i++) {
			 int result = A[i]+B[i];
			 bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}

}
