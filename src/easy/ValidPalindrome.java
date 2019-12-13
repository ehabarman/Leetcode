package easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1)
            return true;

        int start = 0, end = s.length()-1;
        String lowerCaseS = s.toLowerCase();

        while(start < end) {
            char left = lowerCaseS.charAt(start), right = lowerCaseS.charAt(end);

            if(!isAlphaNumeric(left))
                start++;
            else if(!isAlphaNumeric(right))
                end--;
            else if(left != right)
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return ( (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') );
    }
}
