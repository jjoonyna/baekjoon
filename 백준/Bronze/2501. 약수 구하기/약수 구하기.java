import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				numList.add(i);
			}
		}
        
        if(K-1<numList.size()) {
			System.out.println(numList.get(K-1));
		}else {
			System.out.println(0);
		}
    }
}