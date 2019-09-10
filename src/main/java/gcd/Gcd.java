package gcd;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019/9/10 10:12
 * Description: 辗转相除法：两数相除，取余数重复进行相除，直到余数为0时，前一个除数即为最大公约数.
 */

public class Gcd {
    public static void calcGcd(int p, int q) {
        if (q == 0) {
            System.out.println("q=0 最大公约数：" + p);
        } else {
            int r = p % q;
            calcGcd(q, r);
        }
    }
}
