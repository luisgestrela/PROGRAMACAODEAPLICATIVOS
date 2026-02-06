import java.util.Scanner;
public class nivel5{
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Informe seu nome");
        String nome = scanner.next();

        char letra = nome.charAt(0);
        
        System.out.print("A inicial é -->" +letra);

    }
    

}
