import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int left = n/10;
	    int right = n%10;
		int index = 0;

		
		while(true) {
		    int sum = left+right;
		    int sumright = sum%10;
		    int number = (right*10)+sumright;
		    index++;
	if(n==number) {System.out.println(index);
	break;} 
	 left = number/10;
	 right = number%10;
		  
		   
			
		}

	}

}