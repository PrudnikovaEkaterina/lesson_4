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

        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

    }
}
