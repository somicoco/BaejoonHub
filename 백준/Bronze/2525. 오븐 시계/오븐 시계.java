import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int h = sc.nextInt();
  int m = sc.nextInt();
  int m2 = sc.nextInt();
  
  if(m+m2<60){
    System.out.println(h+" "+(m+m2));
  }
  else if(m+m2>=60){
    int x=h+(m+m2)/60;
    if(x>=24){
      int y=x-24;
      x=0;
      System.out.println((x+y)+" "+(m+m2)%60);}
    else{System.out.println(x+" "+(m+m2)%60);}
  }
  }
}