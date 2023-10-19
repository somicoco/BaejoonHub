import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> idMap = new HashMap<>(); 
        
        
        int count = 0;

        for(int i = 0; i<record.length;i++){
            String[] text = record[i].split(" ");
            
            if(text[0].equals("Enter")){
                idMap.put(text[1],text[2]);
            }
            else if(text[0].equals("Change")){
                idMap.put(text[1],text[2]);
                count++;
            }
            else{
                continue;
            }
        }
        
        String[] result = new String[record.length-count];
        
        int index = 0;
        
        for(int i = 0; i<record.length;i++){
            String[] text = record[i].split(" ");
            if(text[0].equals("Enter")){
                result[index++] = idMap.get(text[1]).toString()+"님이 들어왔습니다.";
                
                
            }else if(text[0].equals("Leave")){
                 result[index++] = idMap.get(text[1]).toString()+"님이 나갔습니다.";
                
            }else{
                 continue;
            }
            
            
            
        }
         String[] answer = result;

        
        return answer;
    }
}