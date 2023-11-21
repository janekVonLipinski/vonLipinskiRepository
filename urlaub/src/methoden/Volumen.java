package methoden;

public class Volumen {

    public static void main(String[] args) {
        System.out.println(calculateVolumeOfCube(2));
    }

    public static double calculateVolumeOfCube(double length) {
        return Math.pow(length, 3);
    }
}
