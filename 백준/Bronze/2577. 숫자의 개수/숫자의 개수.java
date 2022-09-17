import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=sc.nextInt()*sc.nextInt()*sc.nextInt();

         String total = Integer.toString(sum);
         
         for(int i=0;i<10;i++) {
        	 int cnt = 0;
        	 for(int j=0;j<total.length();j++) {
        		 if(total.charAt(j)-'0'==i) 
        			 cnt++;
        	 }
        	 System.out.println(cnt);
         }
    }
}