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
}
