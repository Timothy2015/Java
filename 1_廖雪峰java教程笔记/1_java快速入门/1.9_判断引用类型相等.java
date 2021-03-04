
public class Main{
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase(); // toLowerCase() 转换为小写
        System.out.println(s1); // s1和s2本身是引用，保存的内存地址，不相等；
        System.out.println(s2); // 但两者指向的内容是相同的（2个hello存放于两块不同的内存）
        // if (s1 == s2){
        // 用使用equals()函数
        if (s1.equals(s2)){
            System.out.println("s1 == s2"); //s1.equals(s2),输出这里 -- 合乎预期！
        }
        else{
            System.out.println("s1 != s2"); // s1==s2,输出这里
        }

        // s1.equals(s2),注意s1不能为空
        String s3 = null;
        String s4 = "hello";
        // if (s3.equals(s4)){
        // s3不能为null
        if (s3!=null && s3.equals(s4)){
            System.out.println("s3 == s4");
        }
        else{
            System.out.println("s3 != s4");
        }

    }
}