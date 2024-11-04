package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la temperatura en Celsius al usuario
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Realizar las conversiones
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        // Mostrar los resultados
        System.out.printf("Temperatura en Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura en Kelvin: %.2fK%n", kelvin);

        scanner.close(); 
    }
}

