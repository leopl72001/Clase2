package Ejercicios;
/*
 * /**
 * En el mercado, podemos encontrar que el precio del producto Pernil Iberic 
 * D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y 
 * el vendedor nos dice que el precio por kilo cuesta 29,75€.
 *  ¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule
 correctamente el precio por kilo del producto.
 */
 
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var cienGramos = 5.95f;
        var kilo = cienGramos * 10f;
        byte cantidad;
         
        
        //se pide cuantos kilos necesita
        System.out.println("precio 100 gramos 5.95$ Pernil Iberic D'Engreix Llen. Azuaga\n"+
        "¿cuantos kilos necesitas?");
        cantidad = input.nextByte();

        //se calcula el valor
        var precio= cantidad*kilo;

        //se da el valor del producto
        System.out.println("por "+cantidad+" kilo tiene un valor de: "+precio+ "$");

        



       


     
    }
    
}
