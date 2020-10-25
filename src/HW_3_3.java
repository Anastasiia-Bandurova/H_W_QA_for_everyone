public class HW_3_3 {
    public static void main(String[] args) {

        int var = 155;

        if (var > 10) {
            System.out.println("Variable greater than 10");
        }
        if (var < 100) {
            System.out.println("Variable less than 100");
        }
        if ((var / 2.0) > 20) {
            System.out.println("Division by 2 are greater than 20");
        }
        if (var >= 5 && var <= 40) {
            System.out.println("A variable value between 5 and 40 inclusive is true");
        } else {
            System.out.println("Variable value less than 5 or greater than 40");
        }
    }
}
