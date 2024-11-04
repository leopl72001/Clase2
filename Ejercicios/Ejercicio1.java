package Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {
        var num1 = 6;
        var num2 = 2;
        var num3 = 1;
        var num4 = num1 / num2*(num3+num2);

        System.out.println(num4);
    }
    /*
     * El resultado correcto es 9, ya que la operación sigue el orden de
     * operaciones.
     * Primero se resuelve la operación dentro del paréntesis: (1 + 2) = 3.
     * Luego, se realiza la división y multiplicación de izquierda a derecha:
     * 6 / 2 = 3, y finalmente 3 * 3 = 9.
     * 
     * Explicación de por qué algunas calculadoras dan 1:
     * Algunas calculadoras interpretan la expresión "6 / 2(1 + 2)" de forma
     * diferente.
     * En lugar de resolver la división y la multiplicación de izquierda a derecha,
     * interpretan "2(1 + 2)" como una sola unidad, lo que hace que la expresión
     * se evalúe como 6 / (2 * 3). Esto da como resultado 6 / 6 = 1.
     */
    */
}