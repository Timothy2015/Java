//布尔运算
// * 布尔运算的一个重要特点是短路运算：与运算、或运算是短路运算
public class Main{
    public static void main(String[] args){
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0); //前面b为false, &&运算后面不再计算，因此by zero的错误没有抛出
        boolean a = 5 > 3;
        // boolean ans = a || 5 / 0; // 报错，前面是boolean类型，后面是int类型，不能进行||运算
        boolean ans = a || (5 / 0 > 0);
        System.out.println(result);
        System.out.println(ans);
    }
}