import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int time[][] = new int[n][2];
		for(int i=0; i<n; i++) {
			time[i][0]=sc.nextInt();
			time[i][1]=sc.nextInt();
		}
		
		Arrays.sort(time,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1])
					return o1[0]-o2[0];
				return o1[1]-o2[1];
			}
		});
		
		int end = time[0][1];
		int result = 0;
		int count = 1;
		
		for(int i = 1; i<n; i++) {
			if(end<=time[i][0]) {
				count++;
				end =time[i][1];
				
			}
			
		}
		System.out.println(count);
		
	}
	
}
