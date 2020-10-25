public class HW_5_3 {
    public static void main(String[] args) {

        String s = "Посмотрите как Рите нравится ритм";

        String sLower = s.toLowerCase();

        int i = 0;
        while (true) {
            i = sLower.indexOf("рит", i);
            if (i == -1) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}

