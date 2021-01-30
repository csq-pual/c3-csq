import java.util.Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Circle{
    Scanner in=new Scanner(System.in);
    double radius=in.nextDouble();
    private double PI=3.14;
    public double getRadius(){
        return radius;
    }
    public void getArea(){
        double area=radius*radius*PI;
        System.out.println(area);
    }
    public void getPerimeter(){
        double perimeter=2.0*PI*radius;
        System.out.println(perimeter);
    }
}
public class task5{
    public static void main(String[] args) {
        Circle p = new Circle();
        p.getArea();
        p.getPerimeter();
    }

}
