import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
    List的基本使用
 */
public class Main{
    public static void main(String[] args){
        // ArrayList or LinkedList
        List<String> list = new ArrayList<>();
        list.add("apple"); //size=1
        list.add("pear"); //size=2
        // List还允许添加null
        list.add(null);
        list.add("apple"); //运行添加重复元素
        list.add("oringe"); //size=4
        // System.out.println(list.size());
        
        //根据给定元素创建List 【特别注意：此时创建的是只读的List，无法增删】
        List<Integer> list2 = List.of(1994, 10, 22, 26); //List.of()方法不接受null值

        // 遍历List
        // 方式1：for语句 + get(int) --- 不推荐，代码复杂，且对LinkedList非常不友好
        /* for (int i=0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
        */

        //方式2：坚持使用迭代器Iterator来访问List --- 强烈推荐!!!
        /* for (Iterator<String> it = list.iterator(); it.hasNext();){
                String s = it.next();
                System.out.println(s);
        } */

        // 更简洁的形式！--- 记住：通过Iterator遍历List永远是最高效的方式
        // java的for each循环本身就可以帮我们使用Iterator遍历
        for (String s : list){
            // System.out.println(s);
        }
        for (int i : list2){
            // System.out.println(i);
        }


        //List和Array转换
        //List --> Array
        List<Integer> list3 = List.of(12, 34, 56); //创建的只读list，无法增删
        // list3.add(999); //java.lang.UnsupportedOperationException
        Integer[] array = list3.toArray(new Integer[list3.size()]);
        for (Integer n : array){
            System.out.println(n);
        }

        //Array --> List
        Integer[] array2 = {1, 2, 3};
        List<Integer> list4 = List.of(array2);
    }
}

