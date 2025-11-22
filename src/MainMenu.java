import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Selection Sort");
            System.out.println("6. Encerrar");
            System.out.print("Escolha uma opção: ");
            
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Você escolheu: Bubble Sort");
                // chamar função aqui

                case 2 -> System.out.println("Você escolher: Insertion Sort");
                // chamar função aqui

                case 3 -> System.out.println("Você escolheu: Merge Sort");
                // chamar função aqui

                case 4 -> System.out.println("Você escolheu: Quick Sort");
                // chamar função aqui

                case 5 -> System.out.println("Você escolheu: Selection Sort");
                // chamar função aqui

                case 6 -> System.out.println("Saindo...");

                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 6);

        scan.close();
    }
}
