import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static int n,m, x, y,cnt, result;
    static boolean find;
    static int arr[][];
    static boolean visited[];

    public static void main(String[] args) throws IOException {

       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       n = Integer.parseInt(bf.readLine());
       StringTokenizer st = new StringTokenizer(bf.readLine());
       x = Integer.parseInt(st.nextToken());
       y = Integer.parseInt(st.nextToken());
       m = Integer.parseInt(bf.readLine());

       arr = new int[n+1][n+1];
       visited = new boolean[n+1];

       for (int i = 0; i<m;i++){
           st = new StringTokenizer(bf.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           arr[a][b] = arr[b][a] =1;
       }
       cnt = 0;


       dfs(x,y,cnt);


        System.out.println(find==true?result:-1);



    }
    static void dfs(int start, int end, int cnt){
        visited[start]=true;
        if (start == end){
            find = true;
            result = cnt;
        }
        else {
            for (int i = 1; i<arr.length;i++){
                if (!visited[i]&&arr[start][i]==1){
                    visited[i] = true;
                    dfs(i,end,cnt+1);
                    visited[i] = false;

                }
            }
        }

    }
}
