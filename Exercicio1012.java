package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1012 {

    public static void main(String[] args) {
        double A, B, C, pot, pi;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        pot = Math.pow(C, 2);
        pi = 3.14159;
        triangulo = (A * C) / 2;
        circulo = pi * pot;
        trapezio = ((A + B) * C) / 2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

    }
}
