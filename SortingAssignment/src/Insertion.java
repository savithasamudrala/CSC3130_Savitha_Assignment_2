public class Insertion implements SortingAlgorithm {
    public Insertion() {
    }

    public int[] sorty(int[] input) {

        for(int i = 1; i < input.length; ++i) {
            for(int j = i; j > 0 && input[j] < input[j - 1]; --j) {
                int temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
            }
        }

        return input;
    }
}
