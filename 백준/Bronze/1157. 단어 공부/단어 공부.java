import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];
		String n = sc.next();
		
		for(int i=0; i<n.length();i++) {
			if(n.charAt(i)>='A'&&n.charAt(i)<='Z') {
				arr[n.charAt(i)-'A']++;
			}
			else {
				arr[n.charAt(i)-'a']++;
			}
			
		}
		int max =0;
		char ch = '?';
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max){
				max = arr[i];
				ch =(char)(i+65);
			}
			else if(arr[i]==max) {
				ch='?';
			}
		}
		System.out.print(ch);

	

	}

}
