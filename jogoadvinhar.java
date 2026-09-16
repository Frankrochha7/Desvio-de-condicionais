import java.util.Scanner;

public class jogoadvinhar{

public static void main(String [] args){

Scanner entrada = new Scanner(System.in);

final int numeroescondido = 15;

int numero1;
System.out.println("Insira um numero");
numero1 = entrada.nextInt();

if (numero1 == 15) {
    System.out.println("Parabens voce acertou o numero escondido " +15 );
}

 else if (numero1 > 15) {
    System.out.println("O seu palpite está acima do número escondido");

 }

else {
    System.out.println("O seu palpite está abaixo do numero escondido");
}

entrada.close();

}


}