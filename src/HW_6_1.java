public class HW_6_1 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        System.out.println(sum);
    }
}

