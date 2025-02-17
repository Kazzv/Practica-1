import java.util.Scanner;

public class Practica1 {
    public static int quotient(int numero){
        if (numero % 2 != 0)
            throw new ArithmeticException("El numero no puede ser impar");
        return numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        try {
            int result = quotient(numero);
            if (result % 2 == 0);
            System.out.println("El numero es par.");
        }

        catch (ArithmeticException ex) {
            System.out.println("El numero es impar.");
        }
    }
}