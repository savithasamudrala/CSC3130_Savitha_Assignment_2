public class Selection implements SortingAlgorithm {
    public Selection() {
    }

    public int[] sorty(int[] input) {
        for(int i = 0; i < input.length - 1; ++i) {
            int min = i;

            for(int j = i + 1; j < input.length; ++j) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }

            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }

        return input;
    }
}
