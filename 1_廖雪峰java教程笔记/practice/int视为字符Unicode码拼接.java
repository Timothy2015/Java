public class Main{
    public static void main(String[] args){
        //请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串
        int a = 72;
        int b = 105;
        int c = 65281;
        //TODO:
        // String s = a + b + c; //报错：int无法转换为String
        String s = "" + a + b + c;
        String s2 = "" + (char)a + (char)b + (char)c; // ""+ 隐式转换
        String s3 = String.valueOf((char)a) + String.valueOf((char)b) + String.valueOf((char)c);
        System.out.println(s); //7210565281
        System.out.println(s2); //Hi! (这个才是正确答案！)
        System.out.println(s3); //Hi!
}