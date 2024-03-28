public  class cemhesabla {
    public static void main(String[] args) {
        int n = 12;
        double s = 0;
        for (int i = 1; i <= n; i++) {

            s += 1.0 / (i * (i + 1));

            System.out.println(s);
        }
    }
}