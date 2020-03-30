package easy;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {

    static class MyHashSet {
        List<List<Integer>> list = null;

        public MyHashSet() {
            list = new ArrayList<>();
            for (int i = 0; i < 1000; i++)
                list.add(new ArrayList<Integer>());
        }

        public void add(int key) {
            if (contains(key)) return;
            int hash = hashFunction(key);
            List<Integer> block = list.get(hash);
            block.add(key);
        }

        public void remove(int key) {
            if (!contains(key)) return;
            int hash = hashFunction(key);
            List<Integer> block = list.get(hash);
            block.remove(new Integer(key));
        }

        public boolean contains(int key) {
            int hash = hashFunction(key);
            List<Integer> block = list.get(hash);
            return block.contains(new Integer(key));
        }

        private int hashFunction(int key) {
            return key / 1000;
        }
    }
}
