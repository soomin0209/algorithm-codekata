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
}
