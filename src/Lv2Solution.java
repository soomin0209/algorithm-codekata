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
}
