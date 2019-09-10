package array;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019/9/10 10:34
 * Description: 已排序好的数组位置交换（倒序).
 */

public class ExchangePosition<T> {
    public T[] exchange(T[] array) {

        int l = array.length-1;

        for (int i = 0; i <= l/2; i++) {
            T t = array[i];
            array[i] = array[l-i];
            array[l-i] = t;
        }
        return array;
    }
}
