import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static class Edge implements Comparable<Edge>{
        public int start,end,weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
        @Override
        public int compareTo(Edge o) {
            return this.weight-o.weight;
        }
    }

    static int n,m;
    static int[] parents;
    static Edge[]edgeList;

    public static int find(int x) {
        if (x==parents[x]) {
            return x;
        }
        return find(parents[x]);
    }
    public static boolean union(int x,int y) {
        int a=find(x);
        int b=find(y);

        if(a==b)return false;
        parents[b]=a;
        return true;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        parents = new int[n+1];
        for (int i=1;i<=n;i++) {
            parents[i] = i;
        }
        edgeList = new Edge[m];
        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edgeList[i] = new Edge(from,to,weight);
        }
        Arrays.sort(edgeList);
        int result=0;
        for(Edge edge:edgeList) {
            if(union(edge.start, edge.end)) {
                result+=edge.weight;
              
            }

        }
        System.out.println(result);

    }
}
