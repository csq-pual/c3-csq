import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int a,i,b,c,d;
        a=0;
        for(i=1;i<=1000;i++)
        {
            b=i/100;
            c=(i-b*100)/10;
            d=i-b*100-10*c;
            if(i==b*b*b+c*c*c+d*d*d)
                a++;
        }
        System.out.println(a);
    }
}