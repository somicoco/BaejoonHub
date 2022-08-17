import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int h = sc.nextInt();
   int m = sc.nextInt();
   int z = 24;
   
     if(m>=45){
     System.out.print(h+" "+(m-45));
  }
    else{
      if(h==0){

   System.out.print(z-1+" "+(60+m-45));
      }
    else{
      System.out.print(h-1+" "+(60+m-45));
      }
    }
  }
}