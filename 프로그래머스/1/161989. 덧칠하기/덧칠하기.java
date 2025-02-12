class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0;
        for(int i = 0; i<section.length;i++){
            ///처음 반복 
            if(i == 0){
                paint = section[i]+m-1;
                 answer++;
            }else{
                ///페인트를 칠해야하는 벽일 경우
                if(section[i]>paint){
                    paint = section[i]+m-1;
                    answer++;
                }
                
            }
     
        } 
        return answer;
    }
}