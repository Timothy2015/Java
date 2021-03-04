

// Switch语句
// 根据swithc(表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break语句结束执行

"""进深理解switch"""
// * switch语句的特性：即选中一个分支，只执行一个分支，是通过break关键字来实现的。
// * 无论如何不改变的本质：没有干预的情况下，程序的语句始终是顺序执行的

public class Main{
    public static void main(String[] args){
        int option = 1;
        switch(option){
            case 1:
                System.out.println("单人模式");
                break;
            case 2:
                System.out.println("多人模式");
                break;
            case 3:
                System.out.println("退出游戏");
                break;
        }
    }
}