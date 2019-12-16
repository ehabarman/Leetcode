package easy;

public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2){
            return true;
        }

        double m = (double)(coordinates[1][1] - coordinates[0][1]) / (double)(coordinates[1][0] - coordinates[0][0]);
        double c= coordinates[0][1] - m * coordinates[0][0];

        for(int i=2;i<coordinates.length;i++){

            if(coordinates[i][1] != (int) (m*coordinates[i][0] + c)){
                return false;
            }

        }
        return true;
    }
}
