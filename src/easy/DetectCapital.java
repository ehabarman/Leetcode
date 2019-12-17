package easy;

import java.util.regex.Pattern;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        Pattern p1 = Pattern.compile("^[A-Z]+$");
        Pattern p2 = Pattern.compile("^[a-z]+$");
        Pattern p3 = Pattern.compile("^[A-Z][a-z]+$");
        if(p1.matcher(word).find() || p2.matcher(word).find() || p3.matcher(word).find())
            return true;
        return false;

    }
}
