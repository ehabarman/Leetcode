package easy;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int xCount = 0, yCount = 0;
        for (char c : moves.toCharArray())
            if( c == 'U') yCount++;
            else if ( c == 'D') yCount--;
            else if ( c == 'R') xCount++;
            else xCount--;
        return xCount == 0 && yCount == 0;
    }
}
