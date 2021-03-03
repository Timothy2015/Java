import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //创建一个Scanner实例为sc
        Scanner sc = new Scanner(System.in);
        System.out.println("your name: ");
        String name = sc.nextLine(); //nextLine()可以接收enter、tab和空格键等
        System.out.println("your age: ");
        int age = sc.nextInt();
        System.out.println("your salary: ");
        float salary = sc.nextFloat();
        System.out.println("name: " + name + "\n" + "age: " + age + "\n" + "salary: " + salary);
    }
}