import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static int m, n, day;
    static int dy[] = {0, 0, -1, 1};
    static int dx[] = {-1, 1, 0, 0};
    static int arr[][];

    static Queue<int[]> queue = new LinkedList<>();
    static boolean visited[][];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); //가로
        n = Integer.parseInt(st.nextToken()); //세로
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        System.out.println(dfs());


    }

    private static int dfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int y = temp[0];
            int x = temp[1];
            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];
                if (nextX < 0 || nextY < 0 || nextY >= n || nextX >= m) {
                    continue;
                }
                if (arr[nextY][nextX] == 0) {
                    arr[nextY][nextX] = arr[y][x] + 1;
                    queue.add(new int[]{nextY, nextX
                    });
                }
            }
        }
        int max = Integer.MIN_VALUE;
        if (checkZero()) {
            return -1;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }
                }
            }

            return max - 1;
        }


    }

    private static boolean checkZero() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0)
                    return true;
            }
        }
        return false;
    }
}