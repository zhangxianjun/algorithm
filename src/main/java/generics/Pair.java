package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019/9/11 09:40
 * Description: .
 */

public class Pair<T> {
    private T first;
    private T last;

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public Pair() {
    }

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    // 第一个K标识是
    public static <K> Pair<K> factory(K first, K last) {
        return new Pair<K>(first, last);
    }

    // 批量产生对象数组
    public <K> ArrayList<Pair<K>> list(int size) {
        ArrayList<Pair<K>> list = new ArrayList<Pair<K>>();
        for (int i = 0; i < size; i++) {
            Pair<K> pair = new Pair<K>();
            list.add(pair);
        }
        return list;
    }
}
