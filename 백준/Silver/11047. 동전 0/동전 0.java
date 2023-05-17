import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		int arr[] = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i = n ; i>0;i--) {
			if(arr[i-1]<=k) {
				cnt +=  k/arr[i-1];
				
				k=k%arr[i-1];
			}
		}
		
		System.out.println(cnt);
	}
	
}
