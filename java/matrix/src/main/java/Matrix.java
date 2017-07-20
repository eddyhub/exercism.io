import java.util.Arrays;
import java.util.function.IntFunction;

public class Matrix {

    int rowsCount;
    int columnsCount;
    int[][] matrix;

    public Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        String[] columns = rows[0].split(" ");
        rowsCount = rows.length;
        columnsCount = columns.length;
        matrix = new int[rowsCount][columnsCount];
        for(int i = 0; i < rowsCount; i++) {
            String[] row = rows[i].split(" ");
            for (int j = 0; j < columnsCount; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }
    }

    public int[] strToIntArray(String[] str) {
        return Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public int[] getRow(int i) {
        return matrix[i];
    }

    public int[] getColumn(int i) {
        int[] column = new int[rowsCount];
        for(int j = 0; j < rowsCount; j++) {
            column[j] = matrix[j][i];
        }
        return column;
    }
}
