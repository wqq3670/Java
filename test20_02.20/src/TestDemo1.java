import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-20
 * Time: 10:05
 **/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class TestDemo1 {
    /**
     * 1.请实现 copyRandomList 函数，\
     * 复制一个复杂链表。在复杂链表中，
     * 每个节点除了有一个 next 指针指向下一个节点，
     * 还有一个 random 指针指向链表中的任意节点或者 null。
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if(head == null) {
            return head;
        }
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while(cur != null) {
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);//得到key value 键值对中的  value
    }
    /**
     * 2.给定字符串J
     * 代表石头中宝石的类型，和字符串S代表你拥有的石头。 
     * S中每个字符代表了一种你拥有的石头的类型，
     * 你想知道你拥有的石头中有多少是宝石。
     *
     * J中的字母不重复，J和S中的所有字符都是字母。
     * 字母区分大小写，因此"a"和"A"是不同类型的石头。
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if(set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }


}
