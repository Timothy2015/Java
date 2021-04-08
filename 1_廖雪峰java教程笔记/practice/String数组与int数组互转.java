import java.util.*;

public class Main{
    public static void main(String[] args){
        //源数组
        String[] strings = {"1", "2", "3"};
        //法一：使用标准函数，转换为int数组
        int[] array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        //法二：使用for循环，转化为int数组 int = Integer.parseInt(str)

        //原数组
        int[] nums = {4, 5, 6};
        //使用for循环，转化为字符串数组 i+"" (隐式转换)
        String[] strs = new String[3];
        for (int i=0; i<nums.length; i++){
            strs[i] = nums[i] + "";
        }
        for (String s : strs){
            System.out.println(s instanceof String);
            System.out.println(s);
        }
    }
}