import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        int[] number = new int[10];
        for(int i=0; i<10; i++){
            st = new StringTokenizer(br.readLine());
            number[i] = Integer.parseInt(st.nextToken());
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<number.length; i++){
            int num = number[i]%42;
            set.add(num);
        }
        System.out.println(set.size());
        
    }
}
