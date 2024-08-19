import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String[] arr = new String[N];
		
		for(int i=0;i<arr.length;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken();
		}
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(A.equals(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
		
		br.close();
		
	}

}
