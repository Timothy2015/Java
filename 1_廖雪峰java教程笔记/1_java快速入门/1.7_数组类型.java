//数组
public class Main{
    public static void main(String[] args){
        // 长度为5的int数组
        // 初始化方法一
        /* int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62; */
        // 初始化方法二
        // int[] ns = new int[] {68, 79, 91, 95, 62};
        // 进一步简化
        int[] ns = {68, 79, 91, 95, 62};
        for (int i=0; i < ns.length; i++){
            System.out.println("ns[" + i + "]: " + ns[i]);
        }
        //arr.length获取数组的长度
        System.out.println("length: " + ns.length);
    }
}