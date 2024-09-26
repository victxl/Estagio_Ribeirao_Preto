import java.util.Scanner;

public class TesteEstagioRP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nSelecione uma questão para resolver:");
            System.out.println("1. Verificar se um número pertence à sequência de Fibonacci");
            System.out.println("2. Verificar a existência da letra 'a' em uma string e contar quantas vezes aparece");
            System.out.println("3. Calcular o valor da variável SOMA ao final do processamento");
            System.out.println("4. Completar a sequência lógica");
            System.out.println("5. Resolver o problema dos interruptores e lâmpadas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    verificarFibonacci(scanner);
                    pausaParaContinuar();
                    break;
                case 2:
                    verificarLetraA(scanner);
                    pausaParaContinuar();
                    break;
                case 3:
                    calcularSoma();
                    pausaParaContinuar();
                    break;
                case 4:
                    completarSequencias();
                    pausaParaContinuar();
                    break;
                case 5:
                    resolverInterruptores();
                    pausaParaContinuar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
    private static void pausaParaContinuar() {
        System.out.println("Pressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
    }
    public static void verificarFibonacci(Scanner scanner) {
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c = 0;
        boolean isFibonacci = false;

        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }

        if (c == numero || numero == 0) {
            isFibonacci = true;
        }

        if (isFibonacci) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
    public static void verificarLetraA(Scanner scanner) {
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int contador = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' ocorre " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada.");
        }
    }
    public static void calcularSoma() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O valor da variável SOMA ao final do processamento é: " + SOMA);
    }
    public static void completarSequencias() {
        System.out.println("a) 1, 3, 5, 7,  -> 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64,  -> 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36,  -> 49");
        System.out.println("d) 4, 16, 36, 64,  -> 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8,  -> 13");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19,  -> 20");
    }
    public static void resolverInterruptores() {
        System.out.println("Solução do problema dos interruptores:");
        System.out.println("Ligue o primeiro interruptor e deixe ligado por alguns minutos.");
        System.out.println("Desligue o primeiro e ligue o segundo.");
        System.out.println("Vá para a sala das lâmpadas.");
        System.out.println("A lâmpada que estiver acesa pertence ao segundo interruptor.");
        System.out.println("A lâmpada que estiver quente, mas apagada, pertence ao primeiro interruptor.");
        System.out.println("A lâmpada que estiver fria e apagada pertence ao terceiro interruptor.");
    }
    public static void pausar(Scanner scanner) {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
