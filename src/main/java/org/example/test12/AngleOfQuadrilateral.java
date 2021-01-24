package org.example.test12;

public class AngleOfQuadrilateral {
    public static void main(String[] args) {
       //ratio of angles are given
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;
        int sum = a + b + c + d;
        int Valueofx = 360 / sum; // sum of angles is 360
        System.out.println("Angles are " + a * Valueofx + "," + b * Valueofx + "," + c * Valueofx + "," + d * Valueofx);

    }
}
