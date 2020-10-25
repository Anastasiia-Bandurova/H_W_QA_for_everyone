public class HW_6_4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double arithmeticalMean = 0;
        for (int i = 0; i < array.length; i++) {
            arithmeticalMean += array[i];
        }
        System.out.println(arithmeticalMean / array.length);
    }
}

