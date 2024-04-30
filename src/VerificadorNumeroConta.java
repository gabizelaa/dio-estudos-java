import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Inicialize um bloco try-catch para capturar exceções:
        try {
            String numeroConta = scanner.nextLine();

            // TODO: Chame o método verificarNumeroConta, passando o número da conta como
            // argumento:
            verificarNumeroConta(numeroConta);

        } catch (IllegalArgumentException e) {
            // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à
            // exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta
    // tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) { // TODO: Verifique se o número da conta tem exatamente 8 dígitos:
            System.out.println("Numero de conta valido."); // Imprime que o número de conta é válido:
        } else {
            // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser
            // lançada pelo método verificarNumeroConta:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }
}
