import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        String[] str = new String[n];
        for(int i=0; i<str.length; i++){
            st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken();
        }
        
        for(int i=0; i<str.length; i++){
            System.out.print(str[i].charAt(0));
            System.out.print(str[i].charAt(str[i].length()-1));
            System.out.println();
        }
    }
}