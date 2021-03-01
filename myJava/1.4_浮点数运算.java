public class Main{
    public static void main(String[] args){
        /* double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        //观察x和y是否相等
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        double r = Math.abs(x - y);
        if (r < 0.00001){
            System.out.println("x==y");
        }
        else{
            System.out.println("x!=y");
        } */
        
        //类型提升
        int n = 5;
        double d = 1.2 + 24.0 / n; //6.0 = 1.2 + 4.8
        double d2 = 1.2 + 24 / n; //5.2 = 1.2 + 4 (复杂的四则运算，两个整数的运算不会出现自动提升的情况)
        System.out.println("d: " + d);
        System.out.println("d2: " + d2);
        // 为了避免上面的不确定情况————“强制类型”转换
        // d = 1.2 + int(24.0) / n;
        d = 1.2 + (int)24.0 / n;   //这一点和python不同，括号加在（int）上面
        System.out.println("d: " + d);
        // 如果要进行四舍五入，可以对浮点数加上0.5再强制转型
        double temp = 0.6; //定义浮点数默认使用double, 而不使用float类型
        temp = (int)(0.6 + 0.5);
        System.out.println("temp:" + temp);

        // boolean flag = (x==y);
        // boolean flag2 = (x!=y);
        // System.out.println("flag: " + flag);
        // System.out.println("flag2: " + flag2);
    }
}