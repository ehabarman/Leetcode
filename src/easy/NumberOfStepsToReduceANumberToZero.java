package easy;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int n) {
        int count = 0;
        while (n != 0) {
            n = (n & 1) == 1 ? n - 1 : n >> 1;
            count++;
        }
        return count;
    }
}
