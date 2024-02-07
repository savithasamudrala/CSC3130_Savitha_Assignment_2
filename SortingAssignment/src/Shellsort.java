public class Shellsort implements SortingAlgorithm {
    public Shellsort() {
    }

    public int[] sorty(int[] input) {
        for(int gap = input.length / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < input.length; ++i) {
                int temp = input[i];

                int j;
                for(j = i; j >= gap && input[j - gap] > temp; --j) {
                    input[j] = input[j - gap];
                }

                input[j] = temp;
            }
        }

        return input;
    }
}
