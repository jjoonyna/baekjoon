import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int C=sc.nextInt();
       int price=0;
       if(A==B&&B==C&&A==C) {
    	   price=10000+A*1000;
       }
       else if(A==B||A==C||B==C) {
    	   if(A==B) {
    		   price=1000+A*100;
    	   }
    	   else if(B==C) {
    		   price=1000+B*100;
    	   }
    	   else if(A==C) {
    		   price=1000+A*100;
    	   }
       }
       else if(A!=B&&B!=C&&A!=C) {
    	   if(B<A&&A>C) {
    		   price=A*100;
    	   }
    	   else if(A<B&&B>C) {
    		   price=B*100;
    	   }
    	   else if(A<C&&C>B) {
    		   price=C*100;
    	   }
       }
       System.out.println(price);
        sc.close();
	}

}