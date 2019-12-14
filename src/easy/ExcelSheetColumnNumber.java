package easy;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        long[] numbersBase = {1, 26, 676, 17576, 456976, 11881376, 308915776 };
        int resultCols = 0, j = 0;
        for (int i = s.length() - 1; i >= 0; i--)
            resultCols += ((s.charAt(i) - 'A') + 1) * numbersBase[j++];
        return resultCols;
    }
}
