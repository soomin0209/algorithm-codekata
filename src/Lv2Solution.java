import java.util.ArrayList;
import java.util.List;

public class Lv2Solution {

    // 11. 짝수와 홀수
    public String solution11(int num) {
        String answer;
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    // 12. 평균 구하기
    public double solution12(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double answer = sum / arr.length;
        return answer;
    }

    // 13. 자릿수 더하기
    public int solution13(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    // 14. 약수의 합
    public int solution14(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    // 15. 나머지가 1이 되는 수 찾기
    public int solution15(int n) {
        int answer = 0;
        for (int x = n; x > 0; x--) {
            if (n % x == 1) {
                answer = x;
            }
        }
        return answer;
    }

    // 16. x만큼 간격이 있는 n개의 숫자
    public long[] solution16(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (i + 1) * (long)x;
        }
        return answer;
    }

    // 17. 자연수 뒤집어 배열로 만들기
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; n != 0; i++) {
            list.add((int)(n % 10));
            n /= 10;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
