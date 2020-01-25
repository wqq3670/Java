/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-10
 * Time: 19:34
 **/
public class MyListQueue {
    static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode front;
        public ListNode rear;
        public int usedSize;

        public ListNode() {
            this.front = null;
            this.rear = null;
            this.usedSize = 0;
        }

        /**
         * 判断队列是否为空
         * @return
         */
        private boolean isEmpty() {
            return this.usedSize == 0;
        }
        //入队
        public void offer(int data) {
            ListNode node = new ListNode(data);
            if(isEmpty()) {
                this.front = node;
                this.rear = node;
            }else {
                this.rear.next = node;
                this.rear = this.rear.next;
            }
            this.usedSize++;
        }

        //出队
        public int poll() {
            if(isEmpty()) {
                throw new UnsupportedOperationException("队列为空");
            }

        }

    }
}
