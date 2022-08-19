import java.util.*;
class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

 if(a==b&&b==c&&a==c){
   System.out.println(10000+a*1000);
  }
  else if(a==b||a==c){
  System.out.println(1000+a*100);
  }
  else if(b==c||b==a){
  System.out.println(1000+c*100);
  }
  else if(a!=b&&b!=c&&a!=c){
   int max = a;
   if(b>max&&b>c){
     max=b;
     System.out.println(b*100);
   }
    else if(c>max&&c>b){
      max=c;
      System.out.println(c*100);}
      else{System.out.println(a*100);}
    }
  }
}