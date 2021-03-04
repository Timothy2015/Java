
import java.util.Arrays; //数组的库

public class Main{
    public static void main(String[] args){
        // 创建数组的两种方式
        int[] nums = new int[6];
        int[] arrs = {2, 6, 1, -4, 9, 20, 8};
        int[] arrs2 = {1,3,-1};

        // 直接打印数组
        for (int num : nums){
            // System.out.println(num);
        }
        System.out.println(arrs); // 打印的内存地址,即引用的内容
        // the best way
        System.out.println(Arrays.toString(arrs)); //打印的数组内容

        // 冒泡排序
        // 实现1：一趟冒泡把一个最小的值放在前面（不过得倒着来遍历）
        for (int i=0; i< arrs.length-1; i++){
            for (int j=arrs.length-1; j>i; j--){
                // 正序
                // if (arrs[j] < arrs[j-1]){
                // 逆序
                if (arrs[j] > arrs[j-1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j-1];
                    arrs[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrs));

        // 实现2：一趟冒泡把一个最大值放在末尾
        // 第一层for,控制遍历的趟数，最多n-1次（n个数）
        for (int i=0; i<arrs.length-1; i++){
            boolean flag = true;
            // 第二次for, 相邻的两个元素比较，需要的时候交换位置
            for (int j=0; j<arrs.length-1-i; j++){
                if (arrs[j] > arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                    // 每次有交换, 设置flag为false
                    flag = false;
                    // System.out.println(Arrays.toString(arrs));
                }
            }
            if (flag){
                // 不再有交换，已经有序，提前结束循环
                break;
            }
        }
        // System.out.println(Arrays.toString(arrs));
        // 冒泡排序：降序排列

        // Arrays.sort() 标准库函数
        Arrays.sort(arrs2);
        System.out.println(Arrays.toString(arrs2));

    }
}