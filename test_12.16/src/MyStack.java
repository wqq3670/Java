import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:用两个队列实现栈
 * User: dell
 * Date: 2019-12-16
 * Time: 14:55
 **/
public class MyStack {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(!queue2.isEmpty()) {
            queue2.offer(x);
        }else {
            queue1.offer(x);//两个都为空的情况下放入queue1
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!queue1.isEmpty()) {
            int size1 = queue1.size();
            //因为queue1.poll()=》会使queue1.size()不断发生变化
            for (int i = 0; i < size1 - 1; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if(!queue2.isEmpty()) {
            int size2 = queue2.size();
            for (int i = 0; i < size2 - 1; i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        int tmp = 0;
        if(!queue1.isEmpty()) {
            int size1 = queue1.size();
            for (int i = 0; i < size1; i++) {
                tmp = queue1.poll();
                queue2.offer(tmp);
            }
            return tmp;
        }
        if(!queue2.isEmpty()) {
            int size2 = queue2.size();
            for (int i = 0; i < size2; i++) {
                tmp = queue2.poll();
                queue1.offer(tmp);
            }
            return tmp;
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;

    }

}
