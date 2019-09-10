import array.ExchangePosition;
import gcd.Gcd;
import linked.SingleLinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019-08-11 09:25
 * Description: 程序入口.
 */

public class Main {
    public static void main(String[] args) {
//        SingleLinkedList sll = new SingleLinkedList();
//        sll.insertToHead(1);
//        sll.insertToHead(2);


//        System.out.println(sll.findByValue(1));

//        Gcd.calcGcd(12, 16);

        Integer[] i = new Integer[]{1, 2, 3, 4, 5};
        ExchangePosition<Integer> ep = new ExchangePosition<Integer>();
        Integer[] result = ep.exchange(i);

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }
}
