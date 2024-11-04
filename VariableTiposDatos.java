import java.util.Scanner;

public class VariableTiposDatos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("ingrese un valor");
        var text = scanner.nextLine();

        System.out.printf("el valor ingresado fue %s\n", text);

        scanner.close();
    }
}