import java.util.Arrays;

public class Matrix {

    int[][] matrix;

    public Matrix(String matrixAsString) {
        matrix = Arrays.stream(matrixAsString.split("\n"))
                .map(r -> r.split(" "))
                .map(strArray -> Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray())
                .toArray(int[][]::new);
    }

    public int getRowsCount() {
        return matrix.length;
    }

    public int getColumnsCount() {
        return matrix[0].length;
    }

    public int[] getRow(int i) {
        return matrix[i];
    }

    public int[] getColumn(int i) {
        return Arrays.stream(matrix).map(row -> row[i]).mapToInt(Integer::valueOf).toArray();
    }
}
