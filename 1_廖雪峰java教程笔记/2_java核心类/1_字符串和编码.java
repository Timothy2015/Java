/* 
Java中，String是一个引用类型，它本身也是一个class
 * java编译器对String有特殊的处理，可以直接使用"..."(双引号/字符串字面量)来表示一个字符串
 * java字符串的一个重要特点是字符串不可变，所指向的内存的内容不变，但引用本身可变
    * 两个字符串的比较，不能使用==，必须使用equals()

 */

 public class Main{
     public static void main(String[] args){
         /* String s1 = "Hello!";
         String s2 = new String(new char[] {'h', 'e', 'l', 'l', 'o', '!'});
         String s3 = s1;
         System.out.println("s1: " + s1);//hello!
         System.out.println("s3: " + s3);//hello! 
         s1 = s1.toUpperCase();
         System.out.println("s1: " + s1); //HELLO!
         System.out.println("s3: " + s3); //hello!  */

         //比较两个字符串 equals()
         //忽略大小写比较 equalsIgnoreCase()
         /* System.out.println(s1 == s3); //false 因为s1的值改变了
         System.out.println(s1.equals(s3)); //false
         
         String s4 = "worship";
         String s5 = "Worship";
         String s6 = "WORSHIP".toLowerCase();
         System.out.println(s4 == s5); //false
         System.out.println(s4.equalsIgnoreCase(s5)); //true
         System.out.println(s4 == s6); //false
         System.out.println(s4.equals(s6)); //true */

         //是否包含子串
         "Hello".contains("ll"); //true
         //搜索更多子串的例子
         "Hello".indexOf("ll"); //2
         "Hello".lastIndexOf("l"); //3
         "Hello".startsWith("He"); //true
         "Hello".endsWith("lo"); //true

         //提取子串的例子 -- substring()
         System.out.println("Hello".substring(2)); //[2, -1],省略end，默认到末尾最后一个字符
         System.out.println("Hello".substring(2, 4)); //[2, 4), [start, end)
        
         // 去除字符串首尾的空白字符
         System.out.println("  \tHello\r\n".trim());
         // strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除
         System.out.println("  \tHello\r\n".strip());
         System.out.println(" \u3000Hello\u3000".strip());
         // isEmpty() 判断字符串是否为空
         "".isEmpty(); //true
         "   ".isEmpty(); //false
         // isBlank() 判断字符串是否为空白字符串
         System.out.println(" \n  ".isBlank()); //true
         " hello ".isBlank(); //false
    }
 }