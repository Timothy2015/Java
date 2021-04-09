
// 练习使用 String的 获取子串 substring() 方法

import java.util.*;

public class Main{
    public static void main(String[] args){
        // 处理输入
        Scanner sc = new Scanner(System.in);
        // 控制台输入一个数组列表[-1, 0, 2, 2, 0, 4, 9]
        String input = sc.nextLine();
        String input_1 = input.substring(1, input.length()-1);
        System.out.println(input_1);
        String[] strs = input.substring(1, input.length()-1).split(",");
        int[] ns = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            ns[i] = Integer.parseInt(strs[i]);
        }
        // 将数组转化为字符串打印输出
        System.out.println(Arrays.toString(ns));
    }
}