import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(bf.readLine());
       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());

       int dp[][] = new int[11][11];

       for (int i=0;i<=n;i++){
           dp[i][i] = 1;
           dp[i][0] = 1;
       }
       for (int i=1;i<=10;i++){
           for (int j=1;j<=n;j++){
               dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
           }
       }
        System.out.println(dp[n][k]);


    }
}
