import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] N = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N.length; i++) {
			N[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(N);
		System.out.println(N[0]+" "+N[N.length-1]);
    }
}
	    
		
	