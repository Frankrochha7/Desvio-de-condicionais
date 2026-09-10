import java.util.Scanner;

public class exercicioCondicional {

public static void main(String[] args) {

Scanner entrada  = new Scanner (System.in);

int numero;
System.out.println("Digite um numero inteiro");

numero = entrada. nextInt();

if (numero > 20){
System.out.println("A metade é " + numero / 2);
}
    
entrada.close();

}

}



