/*
对�??一个java程序进�?�总结
1. java程序编写-编译-运�?�的过程
编写：我�??将编写的java代码保存在以".java"结尾的源文件�??
编译：使用javac.exe命令编译我们的java源文件。格式：javac 源文件名.java
运�?�：使用java.exe命令解释运�?�我�??的字节码文件�?? 格式：java 类名

2. 一�??源文件中，只有一�??类声明为public
* 在一个java源文件中�??以声明�?�个class。但�??，只能最多有一�??类声明为public的�?
而且要求声明为public的类的类名必须与源文件名相同�??

3. 程序的入口是main()方法。格式是固定的�?

4. 输出�??句：
System.out.println():先输出数�??，然后换�??
System.out.print():�??输出数据

5.每一行执行�??句都�??";"结束�??

6.编译的过程：编译以后，会生成一�??或�?�个字节码文件。字节码文件的文件名与java源文件中的类名相同�?

*/
public class Hello {
	public static void main(String[] args) {//public static void main(String a[]) {//arguments:参数
		System.out.print("Hello World!");
		System.out.println();//�?�???
		System.out.println("Hello World!");
		}
}

class Person{

}

class Animal{
	
}
