import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] arr = new int[28];
        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int index = 0;
        int n = 0;
        int[] result = new int[2];
        int i = 0;
        
        while(true){
        	n++;
        	if(index<arr.length) {
        		if(arr[index] == n){
                    index++;
        		}else if(arr[index] != n){
                    result[i++] = n;
                }
            }else {
            	result[i++] = n;
            }
            
            if(n==30){
                break;
            }
        }
        
        for(int a : result){
            System.out.println(a);
        }
    }
}
