import java.util.Scanner;

public class Contador {  
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int diferenca = parametroDois - parametroUm;

        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
                        
    }
}  
    

