// 方法重载（overload）
// * 定义：一个类中的多个方法，方法名相同，但是各自的参数不同
// * 目的：功能类似的方法使用同一个名字，更容易记住，调用简单

public class Main{
    public static void main(String[] args){
        Hello test = new Hello();
        test.hello();
        test.hello("wsz");
        test.hello("wsz", 28);        
    }
}

// 方法重载
class Hello{
    public void hello(){
        System.out.println("Hello, world!");
    }

    public void hello(String name){
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age){
        if (age < 18){
            System.out.println("Hi, " + name + "!");
        }
        else{
            System.out.println("Hello, " + name + "!");
        }
    }
}