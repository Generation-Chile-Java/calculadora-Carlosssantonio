package calculadoraJava;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        int numeroUno = scanner.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int numeroDos = scanner.nextInt();

        System.out.println("Suma: " + (numeroUno + numeroDos));
        System.out.println("Resta: " + (numeroUno - numeroDos));
        System.out.println("Multiplicación: " + (numeroUno * numeroDos));
        System.out.println("División: " + (numeroUno / numeroDos));
        System.out.println("Módulo: " + (numeroUno % numeroDos));

        scanner.close(); }
}

