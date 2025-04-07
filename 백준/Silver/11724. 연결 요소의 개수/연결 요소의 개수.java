import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static boolean[] visited;
	static ArrayList<Integer>[] dfsList;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		dfsList = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=1; i<N+1; i++) {
			dfsList[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			dfsList[u].add(v);
			dfsList[v].add(u);
		}
		
		int count = 0;
		for(int i=1; i<N+1; i++) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
	}
	
	static void dfs(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		
		for(int i : dfsList[v]) {
			if(visited[i] == false) {
				dfs(i);
			}
		}
	}
	
}