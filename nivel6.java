import java.util.Scanner;

public class nivel6 {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
       
        System.out.println("Informe seu nome");
        String nome = scanner.next();

        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();

        System.out.println("Informe sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Informe a nota obtida nas ultimas avaliações");
        Float nota1 = scanner.nextFloat();
        Float nota2 = scanner.nextFloat();

        Float total = (nota1 + nota2)/2;
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
        System.out.println("Média: "+ total);

    }
    
}
