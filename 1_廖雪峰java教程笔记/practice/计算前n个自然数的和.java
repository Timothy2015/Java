// 从控制台接受一个整数n, 计算前n个自然数的和
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a interger: ");
        int n = sc.nextInt();
        //计算前n个数的和：sum = n*(n+1)/2
        int sum = n*(n+1)/2;
        System.out.println("the sum of " + n + " numbers is: " + sum);
    }
}