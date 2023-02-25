public class JavaLesson1 {
    public static void main(String[] args) {

//У инкремента и декремента есть 2 формы — prefix и postfix.
//Prefix, или Префиксная форма, описывается перед переменной "++x или --x", изначально икрементирует или декрементирует переменную.
//Postfix, или Постфиксная форма, описывается после переменной "x++ или x--", икрементирует или декрементирует переменную после вычисления.

        int a = 5;
        int b = 10;
        int c = 23;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (--b));
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));


        boolean aB = true;
        boolean bB = false;
        System.out.println("aB && bB = " + (aB && bB));
        System.out.println("aB || bB = " + (aB || bB));
        System.out.println("!(aB && bB) = " + !(aB && bB));

        byte by1 = 120;
        byte by2 = 30;
        byte by3 = (byte) (by1 + by2);
        System.out.println(by3);

        short sh1 = 32750;
        short sh2 = (short) (sh1 + by1);
        System.out.println(sh2);

        double do1 = 10.33;
        int in1 = 10;
        double sum = do1 + in1;
        int sum1 = (int) (do1 + in1);
        System.out.println(sum);
        System.out.println(sum1);

    }
}
