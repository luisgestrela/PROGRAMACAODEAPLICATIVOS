import atividade_banco.Conta;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta ("1234567", "Plinio Pinto", 1000);

    }
}

package atividade_banco;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Conta {
    private String numeroconta;
    private String titular;
    private double saldo;
    Scanner sc = new Scanner(System.in);
    Conta(){
        this.saldo = 0;
    };

    Conta(String numeroconta, String titular, double saldo) {
        this.numeroconta = numeroconta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroconta(){
        return numeroconta;
    }
    public void setNumeroconta(String numeroconta){
        this.numeroconta = numeroconta;
    }

    public String getTitular (){
        return titular;
    }
    public void setTitular (String titular){
        this.titular = titular;
    }

    public double getSaldo () {
        return saldo;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public void Depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso");
            return;
        }
        System.out.println("Deposito invalido pcr !!");
    }

    public void sacar (double valor){
        if(valor > this.saldo){
            System.out.println("Opereção invalida !Ta querendo demais pai! !");
            return;
        }
        this.saldo -=valor;
        int c100,c50,c20,c10,c5,c2,c1;
        int r100,r50,r20,r10,r5,r2;

        c100 = (int)valor/100;
        r100 = (int)valor %100;

        c50 = (int)r100/50;
        r50=(int)r100 % 50;

        c20= (int)r50/20;
        r20=(int)r50 % 20;

        c10 = (int)r20/10;
        r10=(int)r20 % 10;

        c5 = (int)r10/5;
        r5=(int)r10 % 5;

        c2 = (int)r5/2;
        r2=(int)r5 % 2;

        c1 = (int) r2/ 1;

        System.out.println("Saque feito com sucesso !!");
        System.out.println(c100 + "Cedulas de 100");
        System.out.println(c50 + "Cedulas de 50");
        System.out.println(c20 + "Cedulas de 20");
        System.out.println(c10 + "Cedulas de 10");
        System.out.println(c5 + "Cedulas de 5");
        System.out.println(c2 + "Cedulas de 2");
        System.out.println(c1 + "Cedulas de 1");
    }

}
