import annotation.HelloController;
import annotation.RestController;
import array.ExchangePosition;
import gcd.Gcd;
import linked.SingleLinkedList;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
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

//        String[] ss = new String[] { "Orange", "Apple", "Pear" };
//        Arrays.sort(ss);
//        System.out.println(Arrays.toString(ss));
//
//
//        // 读取编译好的文件
//
//
//
//        // 请求路径
//        String path = "/hello";
//        String name = "zxj";
//        String age = "18";
//
//        // 加载所有的Controller类
//        Class cls = HelloController.class;
//        // 读取路由列表
//        RestController rc = (RestController) cls.getAnnotation(RestController.class);
//
//        System.out.println(rc.value());
//
//        // 初始化对象 把参数注入到对象中
//        if (rc.value().equals(path)) {
//
//            for (Method m : cls.getMethods()) {
//                try {
////                    m.getParameters()
//                    // 解析参数
//
//                    // 获取方法的参数名
//
//                    // 赋值
//
//                    m.invoke(new HelloController(), name, age);
//                } catch (Exception e) {
//
//                }
//            }
//        }

//        double x = 1.0 / 10;
//        double y = 1 - 9.0 / 10;
//        // 观察x和y是否相等:
//        System.out.println(x);
//        System.out.println(y);
//
//        int n = 5;
//        double d = 1.2 + 24.0 / n; // 6.0
//        System.out.println(d);
//        System.out.println(24.0 / n);
//        System.out.println(24 / 5.0);
//
//        BigDecimal d1 = new BigDecimal("123.456");
//        BigDecimal d2 = new BigDecimal("23.456789");
//        BigDecimal d3 = d1.divide(d2, 10, RoundingMode.HALF_UP);
//        System.out.println(d3);
//
//        d1.compareTo(d2.stripTrailingZeros());
//
//        String s = "Hello";
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);

//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d); // 严格按照ISO 8601格式打印
        System.out.println(t); // 严格按照ISO 8601格式打印
        System.out.println(dt); // 严格按照ISO 8601格式打印
    }

    public void test1() {
        Integer[] i = new Integer[]{1, 2, 3, 4, 5};
        ExchangePosition<Integer> ep = new ExchangePosition<Integer>();
        Integer[] result = ep.exchange(i);

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }
}
