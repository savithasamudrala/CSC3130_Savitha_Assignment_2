public class Quicksort implements SortingAlgorithm {
    public Quicksort() {
    }

    private int partition(int[] input, int low, int high) {
        int midpoint = low + (high - low) / 2;
        int pivot = input[midpoint];
        boolean done = false;

        while(!done) {
            while(input[low] < pivot) {
                ++low;
            }

            while(pivot < input[high]) {
                --high;
            }

            if (low >= high) {
                done = true;
            } else {
                int temp = input[low];
                input[low] = input[high];
                input[high] = temp;
                ++low;
                --high;
            }
        }

        return high;
    }

    private int[] quicksort(int[] input, int low, int high) {
        if (low >= high) {
            return input;
        } else {
            int lowEndIndex = this.partition(input, low, high);
            this.quicksort(input, low, lowEndIndex);
            this.quicksort(input, lowEndIndex + 1, high);
            return input;
        }
    }

    public int[] sorty(int[] input) {
        this.quicksort(input, 0, input.length - 1);
        return input;
    }
}

