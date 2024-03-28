//public class faktoriyal {
//    public static void main(String[] args) {
//        int a = 7;
//        int b = 1;
//
//        for (int i = 1; i <= a ; i++) {
//
//            b *= i;
//
//        }
//        System.out.println(b);
//    }
//}


public class faktoriyal {
    public static void main(String[] args) {
        int n = 10;
        int v = 1;

        for (int i = 1; i <= n; i++) {
            v *= i;
        }

        int a = 0;
        int k = v;
        while (k != 0) {
            a++;
            k /= 10;
        }
        System.out.println("Faktoriyal: " + v);
        System.out.println("Faktoriyalinin reqem sayı: " + a);
    }
}


