//类与类的编译：
// Calculation类，需要通过javac命令编译为Calculation.class
// Main类，无需要编译，可以直接使用

public class Variable{
    // public static void main(String[], args){
    public static void main(String[] args){
        // int i;
        int i = 0, j = 1;
        int n = j;
        // 需要先定义 + 初始化，再使用
        System.out.println(i); 
        System.out.println(j);
        // 字符串都是用双引号（不同于python可以互换二者）
        System.out.println("n = " + n);
    }
}