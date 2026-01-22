public class Lv1Solution {

    // 1. 두 수의 차
    public int solution1(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    // 2. 두 수의 곱
    public int solution2(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    // 3. 몫 구하기
    public int solution3(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    // 4. 나이 출력
    public int solution4(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    // 5. 숫자 비교하기
    public int solution5(int num1, int num2) {
        int answer = num1 == num2 ? 1 : -1;
        return answer;
    }

    // 6. 두 수의 합
    public int solution6(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    // 7. 두 수의 나눗셈
    public int solution7(int num1, int num2) {
        int answer = (int)(((double)num1 / (double)num2) * 1000);
        return answer;
    }

    // 8. 각도기
    public int solution8(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }

    // 9. 짝수의 합
    public int solution9(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    // 10. 배열의 평균값
    public double solution10(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double)sum / numbers.length;
        return answer;
    }
}
