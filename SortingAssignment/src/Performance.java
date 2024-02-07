import java.io.FileWriter;
import java.io.IOException;
public class Performance {
    public static void main(String[] args) {
        int[] arraySizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;
        Tester bubbleSortTester = new Tester(new Bubble());
        Tester insertionSortTester = new Tester(new Insertion());
        Tester selectionSortTester = new Tester(new Selection());
        Tester shellSortTester = new Tester(new Shellsort());
        Tester quickSortTester = new Tester(new Quicksort());
        Tester mergeSortTester = new Tester(new Mergesort());

        try {
            FileWriter writer = new FileWriter("sorting_report.txt");
            //FileWriter writer = new FileWriter("k-sorting_report.txt");

            writer.write("Sorting Algorithms Report\n");
            //writer.write("k-sorting Algorithms Report\n");
            writer.write("\nSorting algorithm - Bubble Sort: \n");
            for (int size : arraySizes) {
                bubbleSortTester.test(iterations, size);
                writer.write("Sorted " + size + " elements in " + bubbleSortTester.averageTime(iterations, size) + " ms\n");
            }
            writer.write("\nSorting algorithm - Insertion Sort: \n");
            for (int size : arraySizes) {
                insertionSortTester.test(iterations, size);
                writer.write("Sorted " + size + " elements in " + insertionSortTester.averageTime(iterations, size) + " ms\n");
            }
            writer.write("\nSorting algorithm - Selection Sort: \n");
            for (int size : arraySizes) {
                selectionSortTester.test(iterations, size);
                writer.write("Sorted " + size + " elements in " + selectionSortTester.averageTime(iterations, size) + " ms\n");
            }
            writer.write("\nSorting algorithm - Shell Sort: \n");
            for (int size : arraySizes) {
                shellSortTester.test(iterations, size);
                writer.write("Sorted " + size + " elements in " + shellSortTester.averageTime(iterations, size) + " ms\n");
            }
            writer.write("\nSorting algorithm - Quick Sort: \n");
            for (int size : arraySizes) {
                quickSortTester.test(iterations, size);
                writer.write("Sorted " + size + " elements in " + quickSortTester.averageTime(iterations, size) + " ms\n");
            }
            writer.write("\nSorting algorithm - Merge Sort: \n");
            for (int size : arraySizes) {
                mergeSortTester.test(iterations, size);
                writer.write("Sorted " + size + " elements in " + mergeSortTester.averageTime(iterations, size) + " ms\n");
            }

            writer.close();
            System.out.println("Report generated.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}
