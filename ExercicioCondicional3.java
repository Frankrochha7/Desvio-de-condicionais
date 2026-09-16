import java.util.Scanner;

public class ExercicioCondicional3{

public static void main(String []args){

Scanner entrada  = new Scanner(System.in);

System.out.println("Digite o primeiro valor inteiro?");
int numero1 = entrada.nextInt();

System.out.println("Digite o seu segundo valor inteiro?");
int numero2 = entrada.nextInt();

if (numero1 == numero2){
    System.out.println("Números iguais");
}

else if (numero1 > numero2){
    System.out.println("A diferença do maior pelo menor " + (numero1- numero2));

}

else { 
     System.out.println("A diferença do maior pelo menor " + (numero2 - numero1));

}

entrada.close();



}

}