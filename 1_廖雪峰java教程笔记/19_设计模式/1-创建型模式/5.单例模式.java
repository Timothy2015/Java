//singleton：保证类只有一个实例，并提供一个访问它的全局访问点

import java.util.*;

// singleton的实现方式一：

public class Singleton{
    // 静态字段引用唯一实例 (外部访问way1: public暴露static变量)
    // public static final Singleton INSTANCE = new Singleton();

    // 外部访问way2: 通过静态方法返回实例, private修饰static变量 -- 更常用！
    private static final Singleton INSTANCE = new Singleton();
    public static Singleton getInstance(){
        return INSTANCE;
    }

    // private构造方法保证外部无法实例化
    private Singleton(){

    }
}

// singleton的实现方式二：利用java的枚举类enum, 因为java保证枚举类的每个枚举都是单例

public enum World{
    // 唯一枚举
    INSTANCE;

    private String name = "world";

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
// 枚举类也完全可以像其他类那样定义自己的字段、方法，这样上面这个World类在调用方看来就可以这么用
String name = World.INSTANCE.getName();


// 【延迟加载】的问题：
// 加锁会严重影响并发性能
// 由于java的内存模型，双重检查在这里不成立
// 要真正实现延迟加载（技术难点），只能通过Java的ClassLoader机制完成，如果没有特殊的要求，
//   使用singleton模式的时候，最好不要用延迟加载，这样会使代码更简单

// Singelton模式的【实现】：
// 除非确有必要，否则singelton模式一般以“约定”为主，不会刻意实现它
// 通常是通过约定让框架（例如Spring）来实例化这些类，保证只有一个实例，调用方自觉通过框架获取实例而不是new操作符

@Component // 表示一个单例组件
public class MyService{
}