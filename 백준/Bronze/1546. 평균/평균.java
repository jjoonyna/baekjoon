import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] score = new int[M];
        
		for(int i=0; i<score.length; i++) {
        	score[i] = Integer.parseInt(st.nextToken());
        }
		
		Arrays.sort(score);
		int max = score[M-1];
        double sum = 0;
        
        for(int i=0; i<score.length; i++) {
        	sum += (double)score[i]/max*100;
        }
        
        double result = sum/M;
		
        System.out.println(result);
    }
}