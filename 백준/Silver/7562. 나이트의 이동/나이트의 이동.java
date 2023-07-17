import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int n, test;
    static int dx[] = {-2,-1,1,2,-2,-1,1,2};
    static int dy[] = {1,2,2,1,-1,-2,-2,-1};
    static boolean visited[][];
    static int arr[][];

    static int start[] = new int[2];
    static int end[]= new int[2];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        test = Integer.parseInt(br.readLine());
        for (int k = 0; k<test; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            visited = new boolean[n][n];
            arr = new int[n][n];

            st= new StringTokenizer(br.readLine());

            start[0] = Integer.parseInt(st.nextToken());
            start[1] = Integer.parseInt(st.nextToken());

            st= new StringTokenizer(br.readLine());
            end[0] = Integer.parseInt(st.nextToken());
            end[1] = Integer.parseInt(st.nextToken());

            visited[start[0]][start[1]] = true;

            bfs(start[0], start[1]);

            System.out.println(arr[end[0]][end[1]]);

        }

        }

    private static void bfs(int y, int x) {
        Queue<int[]>queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        while (!queue.isEmpty()){
            int[] next = queue.poll();
            if (next[0]==end[0]&&next[1]==end[1]){
                break;
            }
            for (int i=0; i<8;i++){
                int nextY = next[0]+dy[i];
                int nextX = next[1]+dx[i];

                if (nextY<0||nextX<0||nextY>=n||nextX>=n){
                    continue;
                }
                if (visited[nextY][nextX]==true){
                    continue;
                }
                visited[nextY][nextX] = true;
                arr[nextY][nextX] = arr[next[0]][next[1]]+1 ;
                queue.add(new int[]{nextY,nextX});

            }
        }
    }


}