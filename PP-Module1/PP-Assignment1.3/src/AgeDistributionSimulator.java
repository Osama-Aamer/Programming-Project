//task2
public class AgeDistributionSimulator {
    public static void main(String[] args) {
        final int SAMPLES = 10000;

        //
        int[][] ageTable = {
                {8,  18},   // 8% are 18
                {25, 19},   // 17% → 19
                {50, 20},   // 25% → 20
                {75, 21},   // 25% → 21
                {90, 22},   // 15% → 22
                {97, 23},   // 7%  → 23
                {100, 24}   // 3%  → 24+
        };

        int[] count = new int[30];

        for (int i = 0; i < SAMPLES; i++) {
            int rand = (int) (Math.random() * 100) + 1;
            int age = 18;
            for (int[] row : ageTable) {
                if (rand <= row[0]) {
                    age = row[1];
                    break;
                }
            }
            count[age]++;
        }

        System.out.println("Age\tCount\t%");
        for (int age = 18; age < count.length; age++) {
            if (count[age] > 0) {
                double percent = 100.0 * count[age] / SAMPLES;
                System.out.printf("%d\t%d\t%.2f%%\n", age, count[age], percent);
            }
        }
    }
}