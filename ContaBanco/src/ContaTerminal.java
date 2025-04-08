import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Declarando as variaveis
        double saldo = Double.valueOf(args[0]);
        String agencia;
        int numeroConta;
        String nomeCorrentista;

        //Criando uma instancia do Scanner para ler o teclado
        Scanner scanner = new Scanner(System.in);

            // solicitando os dados do correntista
             System.out.println("Por favor, digite o número da Agência!");
             agencia = scanner.nextLine();

             System.out.println("Por favor, digite o número da Conta!");
             numeroConta = scanner.nextInt();

             System.out.println("Por favor, digite seu Nome!");
             nomeCorrentista = scanner.next();

                //Exibindo os dados inseridos
                System.out.println("Olá "+ nomeCorrentista + ", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+", conta "+numeroConta+ " e seu saldo "+ saldo+ " já esta disponivel para saque");

    }
}
