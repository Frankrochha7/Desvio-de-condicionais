import java.util.Scanner;

public class ExercicioCondicional9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu salário bruto: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double prestacao = entrada.nextDouble();

        if (prestacao <= salario * 0.3) {
            System.out.println("Empréstimo pode ser concedido!");
        }
        else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        entrada.close();
    }
}
