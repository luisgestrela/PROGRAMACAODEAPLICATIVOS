import java.util.Scanner;
public class nivel7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o Nome do produto");
        String nome = scanner.next();
        
        System.out.println("Informe o preço do produto");
        float preco = scanner.nextFloat();
        
        System.out.println("Informe quantos produtos fora solicitados");
        int quantidade = scanner.nextInt();

        float total = preco *quantidade;

        System.out.println("Nome: "+nome);
        System.out.println("preco: "+preco);
        System.out.println("quantidade: "+quantidade);
        System.out.println("total: "+ total);





    }
    
}
