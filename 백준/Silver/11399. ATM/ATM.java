import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			sum += cnt + arr[i];
			cnt += arr[i];
			
		}
		System.out.println(sum);
		
		
		
	}
	

	
}