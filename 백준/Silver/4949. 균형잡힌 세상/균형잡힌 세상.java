import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals(".")) {
                break;
            }else {
                String result;
                Stack<Character> stack = new Stack<>();
                for (int i =0; i<s.length();i++){
                    char c = s.charAt(i);
                    if (c == '(' || c == '[')
                        stack.push(c);

                    else if (c == ')') {
                        if (!stack.isEmpty()&&stack.peek() == '(') {
                            stack.pop();

                        }
                        else{
                            stack.push(c);
                        }


                    } else if (c == ']') {
                        if (!stack.isEmpty()&&stack.peek() == '[') {
                            stack.pop();
                        }
                        else{
                            stack.push(c);
                        }
                    }
                }
                if (stack.isEmpty()&&s.charAt(s.length()-1)=='.'){
                    result = "yes";

                }
                else
                    result = "no";

                System.out.println(result);

            }


        }



        }

    }
