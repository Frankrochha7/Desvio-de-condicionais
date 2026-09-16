import java.util.Scanner;

public class ExercicioCondicional6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura (ex: 1.73) ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu sexo ( Masculino ou Feminino): ");
        String sexo = entrada.next();

        double pesoIdeal;

        if (sexo.equals("Masculino")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é %.2f kg%n", pesoIdeal);
        }
        else if (sexo.equals("Feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é %.2f kg%n", pesoIdeal);
        }
        else {
            System.out.println("Opção inválida!");
        }

        entrada.close();
    }
}