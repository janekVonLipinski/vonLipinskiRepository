package matrizen;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    private int breite;
    private int hoehe;
    private int[][] matrix;

    public Matrix(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
        matrix = new int[hoehe][breite];
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void matrixEinlesen() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Zahl = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void matrixAusgeben() {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public int[] getReihe(int index) {
        return Arrays.copyOf(matrix[index], matrix[index].length);
    }

    public int[] getSpalte(int index) {
        int[] rueckgabe = new int[hoehe];
        int i = 0;
        for (int[] reihen : matrix) {
            rueckgabe[i++] = reihen[index];
        }
        return rueckgabe;
    }

    private int berechneProdukt(int[] arr, int[] arr1) {
        int ergebnis = 0;
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                ergebnis += (arr[i] * arr1[i]);
            }
        } else {
            ergebnis = -1;
        }
        return ergebnis;
    }

    public Matrix multipliziereMatrix(Matrix andereMatrix) {
        if (breite != andereMatrix.getHoehe()) {
            return null;
        }
        Matrix matrix = new Matrix(andereMatrix.getBreite(), hoehe);
        for (int j = 0; j < matrix.getHoehe(); j++) {
            for (int i = 0; i < matrix.getBreite(); i++) {
                matrix.getMatrix()[j][i]
                        = berechneProdukt(getReihe(j), andereMatrix.getSpalte(i));
            }
        }
        return matrix;
    }
}
