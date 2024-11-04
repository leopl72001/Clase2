package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("dame un 1er numero");
        num1 = input.nextInt();

        System.out.println("dame un 2do numero");
        num2 = input.nextInt();

        int suma = num1 + num2;
        int rest = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        input.close();

        System.out.println("suma: "+suma+"\nresta: "+rest+"\nmultiplicacion: "
        +mult+"\ndivision: "+div);
        
    }
}
