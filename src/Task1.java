public class Task1 {


    public static String solution(String S, int K) {
       String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
       int current = 0;
       for(; current < 7; current++)
           if(days[current].equals(S)) break;
       int nextDay = K % 7;
       nextDay = (nextDay + current) % 7;
       return days[nextDay];
    }

    public static void main(String[] args) {
        System.out.println(solution("Sat", 0));
        System.out.println(solution("Sat", 1));
        System.out.println(solution("Sat", 2));
        System.out.println(solution("Sat", 3));
        System.out.println(solution("Sat", 4));
        System.out.println(solution("Sat", 5));
        System.out.println(solution("Sat", 6));
        System.out.println(solution("Sat", 7));
    }
}
