/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1;i>=0;i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}