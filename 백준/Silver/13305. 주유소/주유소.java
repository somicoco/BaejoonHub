import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cityNum = Integer.parseInt(br.readLine());
		
		long km[] = new long[cityNum-1];
		
		long city[] = new long[cityNum];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i =0; i<km.length;i++) {
			km[i]=Long.parseLong(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for(int i =0; i<city.length;i++) {
			city[i]=Long.parseLong(st.nextToken());
		}
		
		long sum = 0;
		long min = city[0];
		for(int i =0; i<km.length; i++) {
			if(city[i]<min) {
				min = city[i];
			}
			sum += (min*km[i]);
		}
		
		System.out.println(sum);

	}
	

	
}
