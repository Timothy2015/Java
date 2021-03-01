public class DataType{
    public static void main(String[] args){
        /* int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; //加下划线更容易识别，java15
        int i4 = 0xff0000; //十六进制表示的16711680
        int i5 = 0b1000000000; //二进制表示的512
        long l = 9000000000000000000L; //long型结尾需要加L

        float f1 = 3.14f; //flaot类型，后面需要加上f后缀
        float f2 = 3.14e38f; //科学计数法
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; 
        */
        
        boolean flag = true;
        flag = false;
        // if(flag == true){
        //     System.out.println("flag is true");
        // }
        // else{
        //     System.out.println("flag is false");
        // }
        char a = 'a';
        /* for(int i=1; i<10; i++){
            a += 1;
            System.out.println("a: " + a);
        } */

        String s = "hello";
        // final String t = "hello";
        final double PI = 3.14; //PI是一个常量
        System.out.println(s);
        // PI += 1;
        // System.out.println("PI: ", PI); //报错：对于println(string, dobule),找不到合适的方法
        System.out.println("PI: " + PI);

        // System.out.println("f1: " + f1);
        // System.out.println("d: " + d);

        /* System.out.println("i: " + i);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);
        System.out.println("i5: " + i5);
        System.out.println("l: " + l); */
    }
}