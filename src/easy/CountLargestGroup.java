package easy;

public class CountLargestGroup {
    public int countLargestGroup(int n) {
        int groupsWithMaxSizeCount = 0;
        int[] groupSize = new int[37];
        int maxSize = 0;
        for(int i = 1; i <= n; i++) {
            int digSum = getDigitSum(i);
            groupSize[digSum]++;
        }
        for(int i = 1; i <= 36; i++) {
            if(groupSize[i] > maxSize)
                maxSize = groupSize[i];
        }
        for(int i = 1; i <= 36; i++) {
            if(groupSize[i] == maxSize)
                groupsWithMaxSizeCount++;
        }
        return groupsWithMaxSizeCount;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
