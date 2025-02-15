import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> maps = new HashMap<Character, Integer>();
        
        for(int i = 0; i<keymap.length;i++){
            char[] charArr = keymap[i].toCharArray();
            for(int j = 0; j<charArr.length;j++){
                // 중복된 값일 경우 최솟값 비교해서 교체
                if(maps.containsKey(charArr[j])){
                    maps.replace(charArr[j],Math.min(maps.get(charArr[j]),j+1));
                    }else{
                    maps.put(charArr[j],j+1);
                }
                }
            }
        
         for(int i = 0; i<targets.length;i++){
            for(char targetStr:targets[i].toCharArray()){
                if(maps.containsKey(targetStr)){
                    answer[i] = answer[i]+maps.get(targetStr);
                }else{
                    answer[i] = -1;
                    break;
                }
                
            }
        }
        
          
        return answer;
    }
}

        
