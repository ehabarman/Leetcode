package easy;

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
        int count = 0;
        if( A.length == 0)
            return count;
        for (int i = 0; i < A[0].length(); i++)
            for (int j = 0; j < A.length - 1; j++)
                if (A[j].charAt(i) > A[j + 1].charAt(i)){
                    count++;
                    break;
                }
        return count;
    }
}
