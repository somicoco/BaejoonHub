import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];



        for(int i = 0; i<n; i++){
           String str = br.readLine();
           arr[i] = str;
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o1.length()-o2.length();}
                    else{
                        int o1Num = 0;
                        int o2Num = 0;

                        for(int i = 0; i<o1.length();i++){
                            if(Character.isDigit(o1.charAt(i))){
                                o1Num+=o1.charAt(i)-'0';
                            }
                        }
                    for(int i = 0; i<o2.length();i++){
                        if(Character.isDigit(o2.charAt(i))){
                            o2Num+=o2.charAt(i)-'0';
                        }
                    }
                    if(o1Num!=o2Num){
                        return o1Num-o2Num;
                    }
                    else{
                        return o1.compareTo(o2);
                    }

                    }


            }
        });

        for (String str:arr
             ) {
            System.out.println(str);

        }

    }
}