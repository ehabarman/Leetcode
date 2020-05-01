package easy;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        int l = 0;
        int r = S.length() - 1;
        char[] array = S.toCharArray();
        char temp;
        while (r > l) {
            if(!Character.isLetter(array[l])){
                l++;
                continue;
            }
            if(!Character.isLetter(array[r])){
                r--;
                continue;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
        return new String(array);
    }
}
