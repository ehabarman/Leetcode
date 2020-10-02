public class Task2 {

    public static int solution(String S) {
        if (S.length() < 4 || S.length() > 12) return 0;
        int count = 0;
        int size = S.length();
        String newIp = S;
        for (int i = 1; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    newIp = newIp.substring(0, k) + "." + newIp.substring(k);
                    newIp = newIp.substring(0, j) + "." + newIp.substring(j);
                    newIp = newIp.substring(0, i) + "." + newIp.substring(i);
                    if (isValid(newIp)) {
                        count++;
                    }
                    newIp = S;
                }
            }
        }
        return count;
    }

    private static boolean isValid(String ip) {
        String[] a = ip.split("[.]");
        for (String s : a) {
            int i = Integer.parseInt(s);
            if (s.length() > 3 || i < 0 || i > 255) {
                return false;
            }
            if (s.length() > 1 && i == 0) {
                return false;
            }
            if (s.length() > 1 && s.charAt(0) == '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("4216712120"));
        System.out.println(solution("255255255255"));
        System.out.println(solution("188212"));
        System.out.println(solution("11111"));
        System.out.println(solution("212121"));
    }
}
