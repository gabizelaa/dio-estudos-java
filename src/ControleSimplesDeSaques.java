import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe o limite diário de saque

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicitar ao usuário o valor do saque
            double valorSaque = scanner.nextDouble();

            // Verificar se o valor do saque é zero
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verificar se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            // Subtrair o valor do saque do limite diário e informar o sucesso
            limiteDiario -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }

        // Fechar o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
