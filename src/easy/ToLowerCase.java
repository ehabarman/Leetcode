package easy;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int diff = 'a'-'A';
        for( char c : str.toCharArray())
            if( c >= 'A' && c <= 'Z') sb.append(c+diff);
            else sb.append(c);
        return sb.toString();
    }
}
