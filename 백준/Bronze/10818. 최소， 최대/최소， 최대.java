import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int[] arr = new int[a];

    for(int i=0;i<arr.length;i++){
      arr[i] = scan.nextInt();}

    int max = arr[0];
    int min = arr[0];

    for(int i=0;i<arr.length;i++){
      if(max<arr[i])
      {max = arr[i];}}

    for(int i=0;i<arr.length;i++){
     if(min>arr[i])
     {min = arr[i];}}
    System.out.print(min+" "+max);
       
  }
}