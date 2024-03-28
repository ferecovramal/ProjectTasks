public class test {
    public static void main(String[] args) {
        double x = 1.000;
        double y = -2.000;

        Double r = (Math.pow(x, 2) - 2 * x * y + 4 * Math.pow(y, 2) / (x + 5)) + (3 * Math.pow(x, 2) - Math.pow(y, 2) / (y - 7));

//        Double a = Math.pow(x, 2) -  2*x*y + 4 *Math.pow(y,2) / (x + 5);
//        Double b = (3 * Math.pow(x, 2) - Math.pow(y, 2) / (y - 7));

          System.out.println(r);
    }
}



//public class test {
//    public static void main(String[] args) {
//        int x = 4;
//       Double y = Math.pow(4,5);
//        System.out.println(y);
//
//
//    }
//}