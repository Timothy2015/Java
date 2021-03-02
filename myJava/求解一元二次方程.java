// 利用求根公式，求解ax^2 + bx + c = 0

public class Main{
    public static void main(String[] args){
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        //求平方根可用Math.sqrt():
        // Math.sqrt(2) = 1.414
        //TODO:
        // r1 = [-b + sqrt(b^2-4ac)] / 2*a
        // r2 = [-b - sqrt(b^2-4ac)] / 2*a
        double r1 = 0;
        double r2 = 0;
        r1 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
        r2 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1==1 && r2==-4? "success" : "failure");
    }
}