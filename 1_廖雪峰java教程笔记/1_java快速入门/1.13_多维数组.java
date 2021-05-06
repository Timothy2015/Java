// 二维数组：数组的数组
import java.util.*;

public class Main{
    public static void main(String[] args){
        // 二维数组
        int[][] ns = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int[][] nums = new int[4][3];
        System.out.println(Arrays.toString(ns));
        System.out.println(ns.length);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);

        // 每个数组元素长度不同的二维数组
        int[][] ms = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };
        // 打印一个二维数组
        System.out.println(Arrays.deepToString(ms));

    }
}