import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];


        for (int i=0;i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int max = arr[n-1];
        for (int i=0; i<n;i++){
            if (max<arr[i]*(n-i)){
                max = arr[i]*(n-i);
            }
        }



        System.out.println(max);

    }
    }