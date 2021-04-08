import java.util.LinkedList;
import java.util.Queue;

/**
# LinkedList的优点：
- LinkedList即实现了List接口，又实现了Queue接口
- 在使用时，如果把它当作List，就获取List的引用，如果把它当作Queue,就获取Queue的引用
 */

public class Main{
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        //添加3个元素到队列 - q.offer() or q.add()
        q.add("tomato");
        q.add("pear");
        q.offer("apple");
        q.offer("oringe");
        q.offer("banana");
        //从队列取出元素 - q.poll()：获取队首元素并删除 or q.remove()
        // q.peek()：只是获取队首元素, 不删除 or q.element()
        System.out.println(q.peek()); //tomato
        System.out.println(q.peek()); //tomato
        System.out.println(q.peek()); //tomato，只是获取队首元素，但不删除
        System.out.println(q.poll()); //tomato
        System.out.println(q.poll()); //pear
        System.out.println(q.poll()); //apple
        System.out.println(q.poll()); //oringe
        System.out.println(q.element());//banana
        System.out.println(q.remove());//banana
    }
}