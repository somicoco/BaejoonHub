import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=0;j<N-i;j++) 
				System.out.print(" ");
			for(int k=0;k<i*2-1;k++)
				System.out.print("*");
				System.out.println();
			}
		for(int i=N-1;i>=0;i--) {
			for(int j=0;j<N-i;j++)
				System.out.print(" ");
			for(int k=0;k<i*2-1;k++) 
				System.out.print("*");
				System.out.println();
		}	
}
}
