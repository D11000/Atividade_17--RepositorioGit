import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota[] = new double[5] ;
        double soma ;
        double media ;



     for (int i = 0 ; i <5 ;i++){
         System.out.println("Digite o valor da posição "+ (i+1)+ " do vetor" );

          nota [i] = in.nextDouble();
          soma = nota [ 0] + nota [1 ]+ nota [ 2]+ nota [ 3]+ nota [4];
            System.out.println(soma);
            System.out.println(Arrays.toString(nota));
          ;




     }
        media= soma/i;
        System.out.println(media);
    }
}