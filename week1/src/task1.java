import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a;
        System.out.println("输入体重:\n");
        double b=in.nextDouble();
        System.out.println("输入身高:\n");
        double c=in.nextDouble();
        a = b/(c*c);
        if(a<18.5)
            System.out.println("过轻");
        if(18.5<=a&&a<25)
            System.out.println("正常");
        if(25<=a&&a<28)
            System.out.println("肥胖");
        if(32<=a)
            System.out.println("非常肥胖");
    }
}
