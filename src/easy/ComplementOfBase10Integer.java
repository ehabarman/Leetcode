package easy;

public class ComplementOfBase10Integer {
    int bitwiseComplement(int N) {
        int c = 1;
        while (c < N)
            c = (c << 1) + 1;
        return N ^ c;
    }
}
