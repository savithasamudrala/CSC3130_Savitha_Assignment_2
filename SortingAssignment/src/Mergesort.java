public class Mergesort implements SortingAlgorithm {
    public Mergesort() {
    }

    private static void merge(int[] numbers, int i, int j, int k) {
        int mergedSize = k - i + 1;
        int[] mergedNumbers = new int[mergedSize];
        int mergePos = 0;
        int leftPos = i;

        int rightPos;
        for(rightPos = j + 1; leftPos <= j && rightPos <= k; ++mergePos) {
            if (numbers[leftPos] <= numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                ++leftPos;
            } else {
                mergedNumbers[mergePos] = numbers[rightPos];
                ++rightPos;
            }
        }

        while(leftPos <= j) {
            mergedNumbers[mergePos] = numbers[leftPos];
            ++leftPos;
            ++mergePos;
        }

        while(rightPos <= k) {
            mergedNumbers[mergePos] = numbers[rightPos];
            ++rightPos;
            ++mergePos;
        }

        for(mergePos = 0; mergePos < mergedSize; ++mergePos) {
            numbers[i + mergePos] = mergedNumbers[mergePos];
        }

    }

    private static void mergeSort(int[] numbers, int i, int k) {
        if (i < k) {
            int j = (i + k) / 2;
            mergeSort(numbers, i, j);
            mergeSort(numbers, j + 1, k);
            merge(numbers, i, j, k);
        }

    }

    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }
}
