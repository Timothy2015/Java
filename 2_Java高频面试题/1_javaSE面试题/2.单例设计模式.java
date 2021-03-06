// 编程题：写一个Singleton示例

/* test */
public class Main{
    public static void main(String[] args){
        // 不能使用new，直接赋值访问
        Singleton1 s1 = Singleton1.INSTANCE;
        System.out.println(s1);
        Singleton2 s2 = Singleton2.INSTANCE;
        System.out.println(s2);
        s2.setName("Timothy");
        System.out.println(s2.getName());
    }
}

/*
* 饿汉式：
* 1. 构造器私有化
* 2. 内部创建实例，并用static变量保存
* 3. 向外部提供这个实例
* 4. 为了强调这是一个单例，可以用final修饰，并且大写，即等同于常量
*/

public class Singleton1{
    // public暴露实例，提供外部的访问
    // static关键字，必须要加，使得修饰的变量或方法变为类变量或类方法，不要创建实例就可以通过类名访问
    // fianl关键字，修改的变量变为常量，在这里是为了强调这是单例
    public static final Singleton1 INSTANCE = new Singleton1();
    
    // 构造器私有化
    // 构造器是构造方法，即函数，需要添加()
    private Singleton1(){

    }
}

/* 枚举类型：表示该类型的对象是有限的几个
 * 我们可以限定为一个，就成了单例
 */

public enum Singleton2{
    // 唯一单例
    INSTANCE;

    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
} 