import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0,0,-1,1,-1,1,1,-1};
    static int[] dy = {-1,1,0,0,-1,-1,1,1};

    static int w, h;

    static int[][] arr;
    static int cnt;
    static boolean [][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){


            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            cnt = 0;

            if(w==0&&h==0){
                break;
            }else{
                arr = new int[h][w];
                visited = new boolean[h][w];

                for(int i=0; i<h;i++){
                    st = new StringTokenizer(br.readLine());
                    for (int j=0; j<w; j++){
                        arr[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for(int i=0; i<h;i++){
                    for (int j=0; j<w; j++){
                        if(arr[i][j]==1&&visited[i][j]==false){
                            dfs(i,j);
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);

            }



        }





    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        for(int i=0; i<8;i++){
            int nextY = y+dy[i];
            int nextX = x+dx[i];
            if (nextX<0||nextY<0||nextY>=h||nextX>=w||visited[nextY][nextX]==true||arr[nextY][nextX]==0){
                continue;
            }
            dfs(nextY,nextX);
        }
    }
}