import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static int[] dx = {0,0,-1,1}; // 아래 위 좌 우
    static int[] dy = {-1,1,0,0};

    static ArrayList<Integer> list = new ArrayList<>();

    static int count = 0;

    static int n;

    static int house;

    static int[][] arr;
    static boolean[][] visited;









    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n;i++){
           String a = br.readLine();
            for(int j =0; j<n; j++){
                arr[i][j] = a.charAt(j) -'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j] == false&&arr[i][j]==1){
                    house = 1;
                    dfs(i,j);
                    list.add(house);
                    count++;

                }

            }
        }
        System.out.println(count);
        list.sort(Comparator.naturalOrder());

        for (int i:list
             ) {
            System.out.println(i);

        }






    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        for (int i=0; i<4; i++){
            int nextY = y+dy[i];
            int nextX = x+dx[i];
            if (nextY<0||nextX<0||nextX>=n||nextY>=n||visited[nextY][nextX]==true||arr[nextY][nextX]==0){
                continue;
            }
            dfs(nextY,nextX);
            house++;
        }

    }
}