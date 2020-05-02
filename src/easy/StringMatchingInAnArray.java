package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> sub = new ArrayList<String>();
        for(String s : words){
            for(String t : words){
                if(s != t && t.contains(s)){
                    sub.add(s);
                    break;
                }
            }
        }
        return sub;
    }
}
