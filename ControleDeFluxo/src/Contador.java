import java.util.Scanner;

public class Contador {
    public static void main(String[] args)   {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;
        for(int inicial = 1; inicial <= contagem; inicial++){
            System.out.println("Imprimindo número: " + inicial);
    }
}
    private static class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(String errorMessage) {
            super(errorMessage);
        }
    }
}