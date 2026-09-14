import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Tabuada Inteligente");
        int numero;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite um número inteiro e positivo (digite 0 para sair): ");
            numero = sc.nextInt();

            if(numero == 0){
                System.out.println("Encerrando o programa...");
                break;
            }
            if(numero <0){
                System.out.println("Número inválido. Por favor, digite um número maior que zero.");
                continue;
            }
            System.out.println("\nTabuada:\n ");
            for(int i = 1; i <=10; i++){
                int resultado = numero * i;
                String paridade = (resultado % 2 == 0)? "Par" : "Ímpar";
                System.out.println(numero + " x " + i + " = " + resultado + " - " + paridade);
            }
            System.out.println();
            }
            sc.close();

        }
    
    }

