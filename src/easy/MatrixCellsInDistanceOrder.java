package easy;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        int r0 = s.nextInt();
        int c0 = s.nextInt();

        int[][] result = allCellsDistOrder(R, C, r0, c0);

        for(int i=0; i< result.length;i++)
            System.out.println(result[i][0]+"    "+result[i][1]);
    }

    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] result = new int[R * C][];
        Cell[] cell = new Cell[R*C];
        int count=0;
        for(int i =0;i< R;i++)
            for(int j=0; j<C;j++)
                cell[count++] = new Cell(i,j, Math.abs(i-r0)+Math.abs(j-c0));

        Arrays.sort(cell);

        for(int i =0;i< R * C;i++)
            result[i]= cell[i].cell;

        return result;
    }

    static class Cell implements Comparable<Cell> {

        public int[] cell = new int[2];
        public int distance;

        public Cell(int row, int col, int distance) {
            cell[0] = row;
            cell[1] = col;
            this.distance = distance;
        }

        @Override
        public int compareTo(Cell o) {
            if (this.distance > o.distance)
                return 1;
            else if (this.distance < o.distance)
                return -1;
            if (this.cell[0] > o.cell[0])
                return 1;
            else if (this.cell[0] < o.cell[0])
                return -1;
            if (this.cell[1] > o.cell[1])
                return 1;
            else if (this.cell[1] < o.cell[1])
                return -1;



            return 0;
        }
    }
}
