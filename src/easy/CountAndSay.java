package easy;

import java.util.ArrayList;


public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));
        System.out.println(countAndSay(8));
        System.out.println(countAndSay(9));
        System.out.println(countAndSay(10));
    }

    public static String countAndSay(int n) {
        n--;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                int read = list.get(j);
                int count = 0;
                while (j < list.size()) {
                    int current = list.get(j);
                    if (current == read)
                        count++;
                    else
                    {
                        j--;
                        break;
                    }

                    j++;
                }
                temp.add(count);
                temp.add(read);
            }

            list = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i));
        return sb.toString();
    }


}
