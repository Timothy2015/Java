// 哈希表：键-值对

import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        Student s = new Student("WSZ", 99);
        Map<String, Student> map = new HashMap<>();
        // 将“WSZ”和Student实例映射并关联
        map.put("WSZ", s);
        // 通过Key查找并返回映射的Student实例
        Student target = map.get("WSZ");
        System.out.println(target == s); // true,同一个实例
        System.out.println(target.score); //99
        Student another = map.get("tata");
        System.out.println(another); //未找到返回null
    }
}

class Student{
    public String name;
    public int score;
    // 构造方法？
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
}