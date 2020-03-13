package easy;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};

        char target1 = 'a';
        System.out.println(nextGreatestLetter(arr, target1));

        char target2 = 'c';
        System.out.println(nextGreatestLetter(arr, target2));

        char target3 = 'd';
        System.out.println(nextGreatestLetter(arr, target3));

        char target4 = 'g';
        System.out.println(nextGreatestLetter(arr, target4));

        char target5 = 'j';
        System.out.println(nextGreatestLetter(arr, target5));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        while (left < right) {
            int mi = left + (right - left) / 2;
            if (letters[mi] <= target) left = mi + 1;
            else right = mi;
        }
        return letters[left % letters.length];
    }
}
