import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long d[] = new long[n+1];

        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i<=n;i++){
            d[i] = d[i-1]+d[i-2];
        }
        System.out.println(d[n]);

    }

}
