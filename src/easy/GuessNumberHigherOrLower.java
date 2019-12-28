package easy;

public class GuessNumberHigherOrLower {
    static int num = 1702766719;

    public static void main(String[] args){
        int n = 2126753390;
        System.out.print(guessNumber(n));
    }
    public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid, guess;
        while (true) {
            mid = left + (right - left) / 2;
            guess = guess(mid);
            switch (guess) {
                case 1:
                    left = mid + 1;
                    break;
                case -1:
                    right = mid - 1;
                    break;
                default:
                    return mid;
            }
        }
    }


    public static int guess(int num) {
        if (GuessNumberHigherOrLower.num == num)
            return 0;
        else if (GuessNumberHigherOrLower.num > num)
            return 1;
        else return -1;
    }
}
