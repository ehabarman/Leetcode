package easy;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String resultCol = "";
        int remainder = 0;
        while (n > 0) {
            remainder = (n - 1) % 26;
            n = (n - 1) / 26;
            resultCol = (char) (65 + remainder) + resultCol;
        }
        return resultCol;
    }
}
