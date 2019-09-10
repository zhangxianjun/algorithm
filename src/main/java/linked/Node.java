package linked;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019-08-11 09:58
 * Description: .
 */

public class Node {
    public int data;        // 当前节点的值
    public Node next;       // 下一个节点地址

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }
}
