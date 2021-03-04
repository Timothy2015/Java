import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Person wsz = new Person();
        // wsz.name = "Timothy"; // private属性，不能直接访问了
        wsz.setName("Timothy");
        // wsz.age = 28;
        System.out.println("input an birth value: ");
        wsz.setAge(sc.nextInt());
        System.out.println("wsz's name: " + wsz.getName());
        System.out.println("wsz's age: " + wsz.getAge());

        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + "," + bj.longitude);
    }
}

// Person类的定义不能放在最前面，含有main(String[] args)的Main类放在最前面
class Person{
    // public String name;// public修饰，外部可以直接访问 
    // public int age; // 外部直接访问 wsz.name wsz.age
    private String name; // private修饰，只能通过调用Person类中的方法(Method)访问 
                         //-- 这样把对变量如何修改的控制权拿回来了--提高了安全性
    // private int age;
    private int birth;
    private int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        // return this.age;
        return calAge(2021); // 今年是2021年
    }
    public void setAge(int birth){
        this.birth = birth;        
    }
    // private方法--只允许内部调用的方法（或隐藏一些不必要的中间过程，或隐藏重要的中间数据）
    private int calAge(int currentYear){
        return currentYear - this.birth;
    }
}

class City{
    public String name;
    public double latitude;
    public double longitude;
}