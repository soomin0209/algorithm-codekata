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

    // 21. 하샤드 수
    public boolean solution21(int x) {
        boolean answer = false;
        int sum = 0;
        int original = x;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        if (original % sum == 0) {
            answer = true;
        }

        return answer;
    }

    // 22. 두 정수 사이의 합
    public long solution22(int a, int b) {
        long answer = 0;
        int num1 = 0;
        int num2 = 0;

        if (a > b) {
            num1 = b;
            num2 = a;
        } else if (b > a) {
            num1 = a;
            num2 = b;
        } else {
            answer = (long) a;
            return answer;
        }

        for (int i = num1; i <= num2; i++) {
            answer += (long) i;
        }

        return answer;
    }

    // 22. 두 정수 사이의 합 (개선)
    public long solution22Develop(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }

    // 23. 콜라츠 추측
    public int solution23(long num) {
        if (num == 1) {
            return 0;
        }

        int count = 0;

        while(num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            count++;
            if (count == 500) {
                return -1;
            }
        }

        return count;
    }

    // 24. 서울에서 김서방 찾기
    public String solution24(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }

    // 25. 나누어 떨어지는 숫자 배열
    public int[] solution25(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 25. 나누어 떨어지는 숫자 배열 (개선)
    public int[] solution25Develop(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 26. 음양 더하기
    public int solution26(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[0];
            } else {
                answer -= absolutes[0];
            }
        }
        return answer;
    }

    // 27. 핸드폰 번호 가리기
    public String solution27(String phone_number) {
        int length = phone_number.length();
        String answer = "*".repeat(length - 4) + phone_number.substring(length - 4);
        return answer;
    }
}
