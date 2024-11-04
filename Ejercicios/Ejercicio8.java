package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

       
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);

  
        System.out.printf("El área del rectángulo es: %.0f%n", area);
        System.out.printf("El perímetro del rectángulo es: %.0f%n", perimetro);

        scanner.close(); 
    }
}