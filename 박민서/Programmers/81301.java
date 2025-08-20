package 박민서.Programmers;
class Solution {
    public int solution(String s) {
        String[] eng = { "zero", "one", "two", "three", 
                        "four", "five", "six", "seven",
                        "eight", "nine"};
        for(int i = 0; i < eng.length; i++){
            if(s.contains(eng[i]))
                s = s.replace(eng[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}