package easy;

import java.util.Scanner;

public class SameTree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        TreeNode t1= new TreeNode(5);

        TreeNode node1 = new TreeNode(s.nextInt());
        for (int i = 1; i < n; i++)
            node1.addFitFirst(s.nextInt());

        TreeNode node2 = new TreeNode(s.nextInt());
        for (int i = 1; i < m; i++)
            node2.addFitFirst(s.nextInt());

        node1.print();
        System.out.println();
        node1.print();
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null)
            return p == q;
        if( p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) ;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public boolean addFitFirst(int x) {
            if (left == null) {
                left = new TreeNode(x);
            } else if (right == null) {
                right = new TreeNode(x);
            } else {
                if (!left.addFitFirst(x) || !right.addFitFirst(x))
                    return false;
            }
            return false;
        }

        public void print() {
            if (left != null)
                left.print();
            else
                System.out.print("null ");
            if (right != null)
                right.print();
            else
                System.out.print("null ");
            System.out.print(val + " ");
        }
    }

}
