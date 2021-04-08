import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //创建一个Scanner实例为sc
        Scanner sc = new Scanner(System.in);

        /**
        有多个输入时，nextLine()需要先输入，因为nextLine()可以接收到enter(\n)换行符
        放在末尾，无法正常接受有效收入，获得上一次收入的enter换行符就结束了
         */
        System.out.println("your name: ");
        String name = sc.nextLine(); //nextLine()可以接收enter、tab和空格键等

        System.out.println("your age: ");
        // nextInt() 只会读取一个整数，不会读取最后的换行符（必须以换行符结尾）
        int age = sc.nextInt();

        System.out.println("your salary: ");
        // nextFlaot() 只会读取一个浮点数
        float salary = sc.nextFloat();

        System.out.println("your phone-number:");
        // next() 只获取第一个扫描到的不含空格、换行符的单个字符串
        String phoneNum = sc.next();

        System.out.println("");
        System.out.println("name: " + name + "\n" + "age: " + age + "\n" + "salary: " + salary + "\n" + "phoneNum: " + phoneNum);
    }
}