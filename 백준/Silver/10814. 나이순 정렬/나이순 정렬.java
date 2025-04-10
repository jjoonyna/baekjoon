import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		Map<Integer, List<String>> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			map.computeIfAbsent(age, s -> new ArrayList<>()).add(name);
		}
		
		List<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		
		for(int age : keys) {
			for(String name : map.get(age)) {
				System.out.println(age+" "+name);
			}
		}

	}
	
}