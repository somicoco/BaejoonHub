import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		
		for(int i =0; i<test;i++) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			double sum = 0;
			
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
				
			}
			double avg=sum/n;
			double cnt=0;
			for(int k=0;k<n;k++) {
				if(arr[k]>avg)
					cnt++;
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}
	
		}
		
}