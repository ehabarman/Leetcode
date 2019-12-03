package easy;

import java.util.Scanner;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        System.out.println(firstUniqChar(line));

    }

    public static int firstUniqChar(String s) {
        int[] letters = new int[26];
        int index;
        for (int i = 0; i < 26; i++) letters[i] = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            letters[index] = (letters[index] == Integer.MAX_VALUE ? i : -1);
        }

        index = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++)
            if (letters[i] != Integer.MAX_VALUE && letters[i] != -1)
                index = Math.min(index, letters[i]);

        return (index == Integer.MAX_VALUE ? -1 : index);
    }
}
