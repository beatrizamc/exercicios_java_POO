package ex2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double saldo = 500.00;
        double valor_deposito = 0;
        double valor_saque = 0;
        
        System.out.println("------------ Caixa Eletrônico ------------");

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("Digite 1 para consultar saldo");
            System.out.println("Digite 2 para realizar depósito");
            System.out.println("Digite 3 para realizar saque");
            System.out.println("Digite 4 para sair...");
            System.out.print("Escolha uma opção: ");
            numero = sc.nextInt();

            if (numero == 1) {
                System.out.printf("Saldo atual: R$%.2f\n", saldo);
                
            } else if (numero == 2) {
                System.out.print("Digite o valor que deseja depositar: ");
                valor_deposito = sc.nextDouble();
            
                if (valor_deposito > 0) {
                    saldo += valor_deposito; 
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                } else {
                    System.out.println("Valor inválido!");
                }

            } else if (numero == 3) {
                System.out.print("Digite o valor que deseja sacar: ");
                valor_saque = sc.nextDouble();
            
                if (valor_saque <= 0) {
                    System.out.println("Valor inválido!");
                } else if (valor_saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor_saque;
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                }
           
            } else if (numero == 4) {
                System.out.println("Encerrando o programa...");
                break;
          
            } else {
                System.out.println("Número inválido. Por favor, tente novamente.");
            }
        }

        sc.close();
    }
}
   
