package ua.artcode.week1;
/**
 * Created by admin on 15.10.2014.
 */
public class TestPrimitiveOperations {

    public static void main(String[] args) {
        // byte, short, int, long -   * / + - % ++ --
        // float, double
        int a = 78;
        int b = 213;
        int c = ((a + b) / 2) + 34;
        System.out.println(c);

        int div = 5 / 2;
        // String + int = String
        System.out.println("5 / 2 = " + div);
        int mod = 5 % 2;
        System.out.println("5 % 2 = " + mod);

        int i1 = 1;
        i1 = i1 + 1;
        i1 += 2; //i1 = i1 + 2; += -= *= ...
        i1++;
        i1--;

        int i2 = 78;
        long l1 = 23;
        long res = i2 * l1; // int * long = long

        double d = 67 * 2.0;

        char c1 = '1';
        int res3 = c1 + 34;
        System.out.println(res3);

    }

}
