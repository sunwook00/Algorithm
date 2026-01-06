class Solution {
    boolean solution(String s) {
        // 1. 스택을 사용하자.
        // 2. (이거랑 )이거랑 짝이 맞아야함.
        // 3. 그래서 입력 받을 때? 하나씩 읽을 때 ( <- 이거면 스택에 넣고 ) <- 이게 들어오면 스택에 
        //    있는거 빼는 방법으로??
        // 4. 그래서 다 읽었는데 만약 스택에 남아있는게 있으면 false

        
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                answer++;
            } else {
                if (answer == 0){
                    return false;
                }
                answer--;
            }
        }
        return answer == 0;
    }
}