public class kok {
    public static void main(String[] args) {
        int x = 25;

        for (int i = 1; i * i  <= x ; i++) {
            if (i * i == x) {
                System.out.println(i);
                return;

            }
        }
        System.out.println("No");

    }
}

