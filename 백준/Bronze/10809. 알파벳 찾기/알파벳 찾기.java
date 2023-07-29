import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] arr = new char[26];
        int[] result = new int[26];
        for (int i=0; i<arr.length;i++){
            arr[i] = (char) (97+i);
        }
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<s.length();j++){
                if (arr[i] == s.charAt(j)){
                    result[i] = j;
                    break;
                }else {
                    result[i] = -1;
                }
            }
        }
        for (int i:result
             ) {
            System.out.print(i+" ");

        }

    }
}