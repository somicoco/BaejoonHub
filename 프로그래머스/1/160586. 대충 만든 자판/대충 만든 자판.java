class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        int [] result = new int[targets.length];
        
        for(int i = 0; i<targets.length; i++){
            for(char targetStr : targets[i].toCharArray()){
                int min = Integer.MAX_VALUE;
                for(int j = 0; j<keymap.length;j++){
                    int cnt = keymap[j].indexOf(Character.toString(targetStr))+1;
                    if(cnt>0&&cnt<min){
                        min = cnt;
                    }
                }
                if(min == Integer.MAX_VALUE){
                    result[i] = -1;
                    break;
                }
               result[i] = result[i]+min;
            }
            
        }
        
        answer = result;
    
        return answer;
    }
}