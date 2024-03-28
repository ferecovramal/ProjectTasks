public class kicikbolen {
    public static void main(String[] args) {
        int a = 30;
        int kicikBol = a;

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                kicikBol = i;
                break;
            }
        }
        System.out.println(kicikBol);
    }
}

