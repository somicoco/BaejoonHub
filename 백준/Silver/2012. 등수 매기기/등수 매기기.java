import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];
        long cnt = 0;

        for(int i = 0; i<n; i++){
            int num  = Integer.parseInt(bf.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);

        for(int i = 0; i<n; i++){
            cnt += Math.abs(arr[i]-(i+1));
            }

        System.out.println(cnt);


    }
}
