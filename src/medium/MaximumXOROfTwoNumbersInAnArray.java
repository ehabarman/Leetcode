package medium;

public class MaximumXOROfTwoNumbersInAnArray {

    static class Trie {
        Trie[] node = new Trie[2];
    }

    public int findMaximumXOR(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Trie root = new Trie();
        for (int num : nums) {
            Trie curr = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (curr.node[bit] == null)
                    curr.node[bit] = new Trie();
                curr = curr.node[bit];
            }
        }
        int ans = 0;
        for (int num : nums) {
            ans = Math.max(ans, findMax(root, num));
        }
        return ans;
    }

    private int findMax(Trie root, int num) {
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (bit == 1) {
                if (root.node[0] != null) {
                    res |= (1 << i);
                    root = root.node[0];
                } else
                    root = root.node[1];
            } else {
                if (root.node[1] != null) {
                    res |= (1 << i);
                    root = root.node[1];
                } else
                    root = root.node[0];
            }
        }
        return res;
    }
}
