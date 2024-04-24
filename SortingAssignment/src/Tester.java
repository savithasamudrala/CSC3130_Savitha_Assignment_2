import java.util.Random;

public class Tester {
    private SortingAlgorithm sortingAlgorithm;

    public Tester(SortingAlgorithm sa) {
        this.sortingAlgorithm = sa;
    }

    public double singleTest(int size) {
        int[] input = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; ++i) {
            input[i] = random.nextInt(0, 1000);
        }

        //k-sorted
        //input = generateKSorted(input);

        long startTime = System.nanoTime();
        this.sortingAlgorithm.sorty(input);
        long endTime = System.nanoTime();
        double totalTime = (double)(endTime - startTime) / 1000000.0;
        return totalTime;
    }

    public void test(int iterations, int size) {
        double avgTime = 0.0;

        for(int i = iterations; i > 0; --i) {
            avgTime += this.singleTest(size);
        }

        avgTime /= iterations;
        System.out.println("" + avgTime + " ms");
    }

    public double averageTime(int iterations, int size) {
        double avgTime = 0.0;

        for(int i = iterations; i > 0; --i) {
            avgTime += this.singleTest(size);
        }

        avgTime /= (double)iterations;
        return avgTime;
    }

    public static int[] generateKSorted(int[] input){
        int j;
        int k;
        for(int i = 10; i < input.length; i++){
            k = input[i];
            j = i - 1;
            while(j >= 0 && input[j] > k){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = k;
        }
        return input;
    }
}

