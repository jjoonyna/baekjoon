
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int denom=b*d;
	    int numer=(a*d)+(c*b);
	        
	    for(int i = denom; i >= 1; i--){
	    	if(numer%i==0&&denom%i==0){
	    		numer=numer/i;
	    		denom=denom/i;
	            }
	        }
	        
		System.out.println(numer+" "+denom);
	    
		br.close();
		
	}

}
