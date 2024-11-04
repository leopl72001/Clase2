package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los tres números
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcular la media aritmética
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado
        System.out.printf("La media aritmética de los tres números es: %.2f%n", media);

        scanner.close();
    }
}
