public class Bubble implements SortingAlgorithm {
    public Bubble() {
    }

    public int[] sorty(int[] input) {
        int temp;

        for(int i = 0; i < input.length - 1; ++i) {
            for(int j = 0; j < input.length - i - 1; ++j) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        return input;
    }
}