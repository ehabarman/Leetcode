package easy;

import java.util.Arrays;

public class MovingStonesUntilConsecutive {
    public int[] numMovesStones(int a, int b, int c) {
        int [] stones=new int []{a,b,c};
        Arrays.sort(stones);
        int[] movesResult = new int[2];
        int dist1=stones[1]-stones[0]-1;
        int dist2=stones[2]-stones[1]-1;

        if(dist1>1 && dist2>1)
            movesResult[0]=2;
        else if(dist1>=1 || dist2>=1)
            movesResult[0]=1;

        movesResult[1]=dist1+dist2;

        return movesResult;
    }
}
