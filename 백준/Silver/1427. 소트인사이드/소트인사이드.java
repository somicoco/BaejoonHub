import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        List<Character> list = new ArrayList<>();
        for(int i=0; i<str.length();i++){
            list.add(str.charAt(i));
        }
        Collections.sort(list,Collections.reverseOrder());

        for (char c: list
             ) {
            System.out.print(c);

        }



        }





    }