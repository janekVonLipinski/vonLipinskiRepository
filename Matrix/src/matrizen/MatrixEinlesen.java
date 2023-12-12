package matrizen;

public class MatrixEinlesen {

    public static void main(String[] args) {

        Matrix matrix = new Matrix(3, 3);
        matrix.matrixEinlesen();
        matrix.matrixAusgeben();
        Matrix matrix2 = new Matrix(3, 3);
        matrix2.matrixEinlesen();
        matrix2.matrixAusgeben();
        Matrix matrix3 = matrix.multipliziereMatrix(matrix2);
        matrix3.matrixAusgeben();
    }
}
