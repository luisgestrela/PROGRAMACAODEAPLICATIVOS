import java.util.Scanner;  

public class nivel3{
public static void main (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu nome");
    String nome = scanner.next();
    System.out.println("Informe sua cidade");
    String cidade = scanner.next();

    System.out.println(nome+ " é morador da cidade de " + cidade);


    scanner.close();

}

    
}
