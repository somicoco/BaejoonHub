import java.util.Scanner;

public class Main {
	
	static int answer = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] m = str.split("-");
		int num = 0;
		int answer = 0;
		for(int i = 0; i<m.length; i++) {
			int temp = sum(m[i]);
			if(i==0) 
				answer = answer + temp;
			else
				answer = answer - temp;
		}
		System.out.println(answer);



	}
	static int sum(String a) {
		int sum = 0;
		String temp[] = a.split("[+]");
		for(int i = 0; i<temp.length;i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}
	

	
}

