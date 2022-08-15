import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] a = {1, 1, 2, 2, 2, 8};
    for(int i=0; i<6; i++){
      int chess = scan.nextInt();
      System.out.print((a[i]-chess) + " ");}
  }
}