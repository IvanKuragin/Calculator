public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.mult(4, 4));
        System.out.println(calc.pow(2, 3));

        BinOps bins = new BinOps();
        System.out.println(bins.sum("1101", "1010"));
        System.out.println(bins.mult("1101", "1010"));
    }
}
