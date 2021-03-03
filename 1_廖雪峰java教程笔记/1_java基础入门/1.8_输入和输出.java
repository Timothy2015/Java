
// 导入Scanner类
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 输入
        Scanner sc = new Scanner(System.in);
        // System.out.print("input a integer: ");
        // int n = sc.nextInt();  //读取一行输入并获取整数
        System.out.println("input your name: ");
        // --- 注意：如果上面9，10两行不注释，13行无法正常执行，好像是接收了默认上面的换行符
        String name = sc.nextLine(); // 读取一行输入并获取字符串
        System.out.println("my name: " + name);
        // 输出
        System.out.print("A,");
        System.out.print("B,"); // 在同一行连续输出
        System.out.print("C.");
        System.out.println();   //没有输出,为空
        // System.out.println(n);
        System.out.println("END"); // 另起一行输出
        double d = 12900000;
        System.out.println(d); // 1.29E7 科学计数法
        //格式化输出
        double pi = 3.1415926;
        System.out.printf("%.2f\n", pi); //显示2位小数3.14
        System.out.printf("%.4f\n", pi); //显示4位小数3.1416（四舍五入）
        // %d 格式化输出整数
        // %x 格式化输出十六进制整数
        // %f 格式化输出浮点数
        // %e 格式化输出科学计数法表示的浮点数
        // %s 格式化字符串
    }
}