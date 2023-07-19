import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(a);
        st = new StringTokenizer(br.readLine());
        for (int j = 0;j<n; j++){
            b.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(b,Collections.reverseOrder());

        for (int x =0; x<n; x++){
            sum += a.get(x)*b.get(x);
        }

        System.out.println(sum);

    }
    }