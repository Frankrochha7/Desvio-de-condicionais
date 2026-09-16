import java.util.Scanner;

public class ExercicioCondicional7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite quantos anos de empresa: ");
        int anos = entrada.nextInt();

        double bonus;

        if (anos >= 5) {
            bonus = salario * 0.20;
        }
        else {
            bonus = salario * 0.10;
        }

        System.out.printf("O valor do bônus é R$ %.2f%n", bonus);

        entrada.close();
    }
}