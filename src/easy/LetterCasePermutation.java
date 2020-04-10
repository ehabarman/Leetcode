package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> finalResult = new ArrayList<>();
        List<List<Character>> result = new ArrayList<>();
        if (S.length() == 0 || S == null) {
            return finalResult;
        }
        Queue<List<Character>> queue = new LinkedList<>();
        queue.offer(new ArrayList<>());
        char[] cA = S.toCharArray();
        int ii = 0;
        // System.out.println(c);
        while (!queue.isEmpty()) {
            char c = cA[ii];
            int size = queue.size();
            // System.out.println(size);
            for (int i = 0; i < size; i++) {
                List<Character> current = queue.poll();

                if (Character.isLetter(c)) {
                    List<Character> nextU = new ArrayList<>(current);
                    nextU.add(Character.toUpperCase(c));
                    if (nextU.size() == S.length()) {
                        result.add(nextU);
                    } else {
                        queue.offer(nextU);
                    }
                    List<Character> nextL = new ArrayList<>(current);
                    nextL.add(Character.toLowerCase(c));
                    if (nextL.size() == S.length()) {
                        result.add(nextL);
                    } else {
                        queue.offer(nextL);
                    }
                } else {
                    List<Character> next = new ArrayList<>(current);
                    next.add(c);
                    if (next.size() == S.length()) {
                        result.add(next);
                    } else {
                        queue.offer(next);
                    }
                }
            }
            ii++;
        }

        for (List<Character> lC : result) {
            StringBuffer sb = new StringBuffer();
            for (char lCC : lC) {
                sb.append(lCC);
            }
            finalResult.add(sb.toString());
        }

        return finalResult;
    }
}
