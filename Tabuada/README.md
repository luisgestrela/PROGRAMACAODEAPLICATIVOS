package tabuada1;
import javax.swing.JOptionPane;
//import javax.swing.*
//DICA

public class Tabuada1 {

    public static void main(String[] args) {
        Operacao op = new Operacao();
        int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digie um numero","Numero",1 ));
        String simb = JOptionPane.showInputDialog(null ,"1-Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n\n","Simbolo", 1);
    
    for (int x=0;x<10;x++){
        switch(simb){
            case "1" ->op.adicao(num,x);
            case "2" ->op.subtracao(num,x);
            case "3" ->op.multiplicacao(num,x);
            case "4" ->op.divisao(num,x);
            }
        }
        op.imprimir();
    }
}

package tabuada1;

import javax.swing.JOptionPane;
//importa a biblioteca JOption pane
public class Operacao {
    String res = "";
    
    public void adicao(int n, int x){
        res+=String.valueOf(n)+" + "+String.valueOf(x)+" = "+String.valueOf(n+x)+"\n";
}
    /*
    o comando valueOf é utilizado para transformar a variavel int, em uma variavel String, para ser utilizada na concatenação...
    -> String.valueOf(n+x)+" - "+String.valueOf(n)+" = "+String.valueOf(x)+"\n"; pois para fazer essa concatenação é necessario ser um tipo unico de variavel. 
    */
    //Pega os dois números e mostra a soma real deles.
    public void subtracao(int n, int x){
        res+=String.valueOf(n+x)+" - "+String.valueOf(n)+" = "+String.valueOf(x)+"\n";
    }
     //Ele soma n + x primeiro para depois subtrair n.
    //Pega os dois números e mostra o produto.
    public void multiplicacao(int n, int x){
        res+=String.valueOf(n)+" x "+String.valueOf(x)+" = "+String.valueOf(x*n)+"\n";
    }
     //Pega os dois números e mostra o produto.
    public void divisao(int n, int x){
        res+=String.valueOf(n*x)+" ÷ "+ String.valueOf(n) +" = "+String.valueOf(x)+"\n";
    }
    //Ele multiplica n com x primeiro, para depois dividir por n.
    public void imprimir (){
        JOptionPane.showMessageDialog(null, res, "Tabuada",0);
    }
    //abre uma janela pop-up(MessageDialog), que mostra tabuada
    
}
