//类与类的编译：
// Calculation类，需要通过javac命令编译为Calculation.class
// Main类，无需要编译，可以直接使用

public class Calculation{
    public static void main(String[] args){
        int i = (100 + 200) * (99 - 88); //3300
        int n = 7 * (5 + (i - 9)); //23072
        int j = 123 / 2; //除法，获得商
        int k = 123 % 2; //取余，获得余数
        // System.out.println("i:" + i);
        // System.out.println(n);
        System.out.println("j: " + j); //+操作将整型变量j转化为字符串类型j
        System.out.println("k: " + k);
    }
}