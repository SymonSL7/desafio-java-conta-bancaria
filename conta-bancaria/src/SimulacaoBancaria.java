import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
  
            System.out.println("Escolha o número da operação a ser realizadas");
            System.out.println("[1] - Depositar");
            System.out.println("[2] - Sacar");
            System.out.println("[3] - Saldo");
            System.out.println("[0] - Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    
                    System.out.println("Digite o valor a ser depositado: ");
                    Double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Deposito efetuado, seu saldo atual é: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor a ser sacado: ");
                    Double valorSacado = scanner.nextDouble();
                    if (valorSacado <= saldo){
                      saldo -= valorSacado;
                      System.out.println("Saque efetuado, seu saldo atual é: " + saldo);
                    } else{
                      System.out.println("Saldo insuficiente, seu saldo atual é de: " + saldo);
                    }
                    
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();

    }

}
