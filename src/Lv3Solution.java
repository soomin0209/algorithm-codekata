import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lv3Solution {

    // 41. 이상한 문자 만들기
    public String solution41(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char[] charArr = s.toCharArray();

        for(char ch : charArr) {
            if (ch == ' ') {
                sb.append(ch);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                index++;
            }
        }

        String answer = sb.toString();
        return answer;
    }

    // 42. 삼총사
    public int solution42(int[] number) {
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // 43. 크기가 작은 부분 문자열
    public int solution43(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String portion = t.substring(i, i + p.length());
            if (portion.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }

    // 44. 최소직사각형
    public int solution44(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.min(sizes[i][0], sizes[i][1]);
            int h = Math.max(sizes[i][0], sizes[i][1]);

            width = Math.max(width, w);
            height = Math.max(height, h);
        }

        int answer = width * height;
        return answer;
    }

    // 45. 시저 암호
    public String solution45(String s, int n) {
        String answer = "";

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + ((c - 'A' + n) % 26));
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + ((c - 'a' + n) % 26));
            }
            answer += c;
        }

        return answer;
    }

    // 46. 숫자 문자열과 영단어
    public int solution46(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], String.valueOf(i));
            }
        }

        return Integer.parseInt(s);
    }

    // 47. 문자열 내 마음대로 정렬하기
    public String[] solution46(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>(){

            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) > s2.charAt(n)) {
                    return 1;
                } else if (s1.charAt(n) < s2.charAt(n)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        return strings;
    }

    // 47. 문자열 내 마음대로 정렬하기 (개선1)
    public String[] solution46Develop(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2); // 사전순 정렬
                }
                return s1.charAt(n) - s2.charAt(n);
            }
        });
        return strings;
    }

    // 47. 문자열 내 마음대로 정렬하기 (개선2)
    public String[] solution46Develop2(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            }
            return s1.charAt(n) - s2.charAt(n);
        });
        return strings;
    }

    // 48. K번째수
    public int[] solution48(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            answer[i] = subArray[commands[i][2] - 1];
        }

        return answer;
    }

    // 49. 두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }

        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
