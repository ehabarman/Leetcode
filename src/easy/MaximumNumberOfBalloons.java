package easy;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for(int i = 0; i< text.length(); i++){
            count[text.charAt(i) - 'a']++;
        }

        int answer = Integer.MAX_VALUE;
        answer = Math.min(answer, count['a'-'a']);
        answer = Math.min(answer, count['b'-'a']);
        answer = Math.min(answer, count['l'-'a']/2);
        answer = Math.min(answer, count['o'-'a']/2);
        answer = Math.min(answer, count['n'-'a']);
        return answer;
    }
}
