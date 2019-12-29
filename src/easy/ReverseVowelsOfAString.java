package easy;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if(s.length() == 0 )
            return s;
        int front = 0, end = s.length() - 1;
        char[] arr = s.toCharArray();
        char temp;
        while (front != end) {
            if (isVowel(arr[front]) && isVowel(arr[end])) {
                temp = arr[front];
                arr[front] = arr[end];
                arr[end] = temp;
                front++;
                end--;
            }
            else if (!isVowel(arr[front])) front++;
            else if (!isVowel(arr[end])) end--;
        }
        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U';
    }
}
