import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;

        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /):");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Error: Operador no válido");
        }

        scanner.close();
    }
}
