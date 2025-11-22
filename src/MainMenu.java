import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import java.util.Scanner;
import utils.Utils;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                case 1: 
                    System.out.println("Você escolheu: Bubble Sort");
                    bubble.ordenarVetor(vetor);
                    break;

                case 2: 
                    System.out.println("Você escolheu: Insertion Sort");
                    insertion.ordenarVetor(vetor);
                    break;
                    
                    case 3: 
                    System.out.println("Você escolheu: Merge Sort");
                    merge.ordenarVetor(vetor);
                    break;
                    
                    case 4: 
                    System.out.println("Você escolheu: Quick Sort");
                    quick.ordenarVetor(vetor);
                    break;

                case 5:
                    System.out.println("Você escolheu: Selection Sort");
                    selection.ordenarVetor(vetor);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 6);

        scan.close();
    }
}
