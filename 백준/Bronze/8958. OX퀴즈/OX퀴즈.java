import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n+1];
		
		
		for(int i =0; i<n;i++) {
			int cnt =0, sum=0;
			arr[i]=sc.next();
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') 
					sum+=++cnt;
			
			
			else cnt = 0;
		}
		System.out.println(sum);
		}
		sc.close();
	

			

		}
		
}