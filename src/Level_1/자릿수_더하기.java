package Level_1;

public class 자릿수_더하기 {

	public static void main(String[] args) {
        
       System.out.println(Solution.solution(123));

	}

}

class Solution {
    public static int solution(int n) {
        
        int answer = 0;
        
        while (n != 0) {
            answer += n%10;
            n /= 10;
        }
        
        return answer;
    }
}