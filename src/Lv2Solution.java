import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    // 18. 문자열을 정수로 바꾸기
    public int solution18(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    // 19. 정수 제곱근 판별
    public long solution19(long n) {
        for (int x = 0; Math.pow(x, 2) <= n; x++) {
            if (n == Math.pow(x, 2)) {
                return (long) Math.pow(x + 1, 2);
            }
        }
        return -1;
    }

    // 20. 정수 내림차순으로 배치하기
    public long solution20(long n) {
        String str = Long.toString(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String joinedArr = String.join("", arr);
        long answer = Long.parseLong(joinedArr);
        return answer;
    }
}
