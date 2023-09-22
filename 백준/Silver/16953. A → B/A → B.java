import java.io.*;
import java.util.*;

public class Main {

    static long a,b;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        while (a!=b){
            if (b<a){
                System.out.println(-1);
                System.exit(0);
            }
            if (b%10==1)
                b/=10;
            else if(b%2 == 0)
                b/=2;
            else {
                System.out.println(-1);
                System.exit(0);
            }
            cnt++;

        }
        System.out.println(cnt);

    }


}
