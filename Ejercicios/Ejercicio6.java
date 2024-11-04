package Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        float pantalon = 34.0f; // Usamos float para mayor precisión
        float descuento = 0.15f;
    
        // Cálculo del precio original
        float precioOriginal = pantalon / (1 - descuento);
    
        // Mostramos el precio con dos decimales
        System.out.printf("El precio original es de: %.0f%n", precioOriginal);       
    }
 
}
