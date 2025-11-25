import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import java.util.Scanner;
import utils.Utils;

public class MainMenu {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int opcao;

            BubbleSort bubble = new BubbleSort();
            InsertionSort insertion = new InsertionSort();
            MergeSort merge = new MergeSort();
            QuickSort quick = new QuickSort();
            SelectionSort selection = new SelectionSort();

            do {
                System.out.println("\n====== MENU ======");
                System.out.println("1. Bubble Sort");
                System.out.println("2. Insertion Sort");
                System.out.println("3. Merge Sort");
                System.out.println("4. Quick Sort");
                System.out.println("5. Selection Sort");
                System.out.println("6. Encerrar");
                System.out.print("Escolha uma opção: ");
                opcao = scan.nextInt();
                scan.nextLine();
                System.out.print("\n");

                int[] vetor = Utils.gerarVetor(10, 51);

                switch (opcao) {
                    case 1 -> {
                        System.out.println("--- Você escolheu: Bubble Sort\n");
                        System.out.println("--- Antes da ordenação:");
                        Utils.imprimirVetor(vetor);
                        bubble.ordenarVetor(vetor);
                        System.out.println("\n\n--- Após a ordenação:");
                        Utils.imprimirVetor(vetor);

                        System.out.print("\n\nPressione Enter para voltar ao menu principal...\n");
                        scan.nextLine();
                        Utils.LimparTerminal.limpar();
                    }

                    case 2 -> {
                        System.out.println("Você escolheu: Insertion Sort\n");
                        System.out.println("--- Antes da ordenação:");
                        Utils.imprimirVetor(vetor);
                        insertion.ordenarVetor(vetor);
                        System.out.println("\n\n--- Após a ordenação:");
                        Utils.imprimirVetor(vetor);

                        System.out.print("\n\nPressione Enter para voltar ao menu principal...\n");
                        scan.nextLine();
                        Utils.LimparTerminal.limpar();
                    }

                    case 3 -> {
                        System.out.println("Você escolheu: Merge Sort\n");
                        System.out.println("--- Antes da ordenação:");
                        Utils.imprimirVetor(vetor);
                        merge.ordenarVetor(vetor);
                        System.out.println("\n\n--- Após a ordenação:");
                        Utils.imprimirVetor(vetor);

                        System.out.print("\n\nPressione Enter para voltar ao menu principal...\n");
                        scan.nextLine();
                        Utils.LimparTerminal.limpar();
                    }

                    case 4 -> {
                        System.out.println("Você escolheu: Quick Sort\n");
                        System.out.println("--- Antes da ordenação:");
                        Utils.imprimirVetor(vetor);
                        quick.ordenarVetor(vetor);
                        System.out.println("\n\n--- Após a ordenação:");
                        Utils.imprimirVetor(vetor);

                        System.out.print("\n\nPressione Enter para voltar ao menu principal...\n");
                        scan.nextLine();
                        Utils.LimparTerminal.limpar();
                    }

                    case 5 -> {
                        System.out.println("Você escolheu: Selection Sort\n");
                        System.out.println("--- Antes da ordenação:");
                        Utils.imprimirVetor(vetor);
                        selection.ordenarVetor(vetor);
                        System.out.println("\n\n--- Após a ordenação:");
                        Utils.imprimirVetor(vetor);

                        System.out.print("\n\nPressione Enter para voltar ao menu principal...\n");
                        scan.nextLine();
                        Utils.LimparTerminal.limpar();
                    }

                    case 6 -> System.out.println("Saindo...");

                    default -> System.out.println("Opção inválida! Tente novamente.");
                }

                System.out.println();
            } while (opcao != 6);
        }
    }
}
