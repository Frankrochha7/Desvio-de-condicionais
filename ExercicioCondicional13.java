import java.util.Scanner;

public class ExercicioCondicional13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        double resultado;

        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.printf("Resultado: %.2f%n", resultado);
        }
        else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.printf("Resultado: %.2f%n", resultado);
        }
        else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.printf("Resultado: %.2f%n", resultado);
        }
        else if (operacao == '/') {
            if (num2 > 0) {
                resultado = num1 / num2;
                System.out.printf("Resultado: %.2f%n", resultado);
            }
            else {
                System.out.println("Impossível dividir!");
            }
        }
        else {
            System.out.println("Sinal Inválido");
        }

        entrada.close();
    }
}