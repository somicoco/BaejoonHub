import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>();
		
		int one = 0;
		int zero = 0;
		
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			if(a==0) 
				zero++;
			else if(a==1)
				one++;
			else if(a>1)
				plus.add(a);
			else
				minus.add(a);
		}
		
		int data1 = 0;
		int data2 = 0;
		int result = 0;
		while(plus.size()>=2) {
			data1 = plus.remove();
			data2 = plus.remove();
			
			result += data1*data2;
		}
		if(plus.size()!=0) {
			result += plus.remove();
		}
		
		while(minus.size()>=2) {
			data1 = minus.remove();
			data2 = minus.remove();
			
			result += data1*data2;
		}
		if(minus.size()!=0) {
			data1 = minus.remove();
			if(zero==0)
				result += data1;
		}
		
		result = result+one;
		System.out.println(result);
	}
	
}
