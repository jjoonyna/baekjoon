import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int[] arr = new int[9];
        
        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],i+1);
        }
		
        Arrays.sort(arr);
        System.out.println(arr[8]);
        System.out.println(map.get(arr[8]));
        
    }
}