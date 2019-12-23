package easy;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceeAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        Pattern p = Pattern.compile("(?<=\\b" + first + "\\b\\s\\b" + second + "\\b\\s)[a-z]+");
        Matcher m = p.matcher(text);
        ArrayList<String> list = new ArrayList<>();
        while (m.find())
            list.add(m.group(0));

        String[] words = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
            words[i] = list.get(i);

        return words;
    }
}
