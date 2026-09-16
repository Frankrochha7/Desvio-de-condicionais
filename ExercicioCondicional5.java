import java.util.Scanner;

public class ExercicioCondicional5{

    public static void main(String [] args ){
        
        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite um número");
        int numero1 =  entrada.nextInt();

        if (numero1 >= 50 && numero1 <= 100) {

            System.out.println("Pertence ao intervalo");
        }

        else{
            System.out.println("Não pertence ao intervalo");

        }
        
entrada.close();



    }

}