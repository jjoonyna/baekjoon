import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        
        char c = str.charAt(i-1);
        System.out.println(c);
        
    }
}