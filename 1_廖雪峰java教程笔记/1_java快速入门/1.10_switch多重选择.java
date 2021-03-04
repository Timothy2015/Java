

// Switch语句
// 根据swithc(表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break语句结束执行

// """进深理解switch"""
//（1）break关键字控制流程
// * switch语句的特性：即选中一个分支，只执行一个分支，是通过break关键字来实现的。
// * 无论如何不改变的本质：没有干预的情况下，程序的语句始终是顺序执行的
// (2) 内部实现的原理是使用多重的if-else

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("input 1 or 2 or 3:");

        // switch语句的传统语法
        /* int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("one style");
                // break; //没有break语句，选中的分支执行完毕后不会停止，会继续顺序执行
            case 2:
                System.out.println("multiple style");
                break;
            case 3:
                System.out.println("exit game");
                break;
            default: //其他都没有匹配才执行的语句 -- 提高交互性
                System.out.println("No match");
                break; //养成好习惯，末尾也加上
        }*/

        // switch语句的新语法 -> ,从java14后开始支持（猜想本质：进一步的封装）
        // 1.需要用{}括起来
        // 2.不需要写break语句
        // 3.可以直接返回值
        String fruit = "apples";
        int opt = switch (fruit){
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            // default -> 0;
            // {复杂语句} + yield返回一个值
            default -> {
                int code = fruit.hashCode();
                yield code; //switch语句返回值
            }
        }; //赋值语句
        System.out.println("opt = " + opt);
    } 
}