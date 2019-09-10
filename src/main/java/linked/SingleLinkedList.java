package linked;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: zxj
 * @date: 2019-08-11 09:57
 * Description: 单向列表.
 */

public class SingleLinkedList {
    private Node head = null;

    // 新建
    public Node createLinked(int value) {
        return new Node(value, null);
    }


    // 单向链表 增加
    public void insertToHead(int value) {
        Node newNode = new Node(value, null);
        insertToHead(newNode);
    }

    // 把前一个数据插入到新数据里面
    public void insertToHead(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    // 查看
    public Node findByValue(int value) {
        Node p = head;
        // 当节点的值 和 传入的值相等 返回节点
        while (p != null && p.data != value) {
            p = p.next;
        }
        return p;
    }

    // 删除

    // 修改
}
