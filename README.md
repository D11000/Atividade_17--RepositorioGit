import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Número de elefantes

        if (N < 2) {
            System.out.println("Digite um número maior ou igual a 2");
            return;
        }

        System.out.println("1 elefante incomoda muita gente");

        for (int i = 2; i <= N; i++) {
            System.out.print(i + " elefantes ");
            for (int j = 0; j < i; j++) {
                System.out.print("incomodam ");
            }
            System.out.println("muito mais");
        }
    }
}# Atividade_17--RepositorioGit
commit
