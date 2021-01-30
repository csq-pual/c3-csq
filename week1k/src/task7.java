import java.util.Scanner;

class complex{
     private double single;
     private double j;
     public void printadd(double sum1,double sum2){
         System.out.println("两复数相加的结果为："+"sum1"+" sum2"+"i");
     }
    public void printmutiply(double sum1,double sum2){
        System.out.println("两复数相乘的结果为："+"sum1"+" sum2"+"i");
    }
    public void printreduce(double sum1,double sum2){
        System.out.println("两复数相除的结果为："+"sum1"+" sum2"+"i");
    }
    public void setSingle(double single) {
        this.single = single;
    }

    public void setJ(double j) {
        this.j = j;
    }

    public double getSingle(){
           return single;
    }
    public double getJ(){
        return j;
    }
    public void add(complex i){
          double sum1;
          double sum2;
          sum1=this.getSingle()+i.getSingle();
          sum2=this.getJ()+i.getJ();
          printadd(sum1,sum2);
    }
    public void reduce(complex i){
        double sum1;
        double sum2;
        sum1=this.getSingle()-i.getSingle();
        sum2=this.getJ()-i.getJ();
        printreduce(sum1,sum2);
    }
    public void mutiply(complex i){
        double sum1;
        double sum2;
        sum1=(this.getSingle() * i.getSingle()) - (this.getJ() * i.getJ());
        sum2=(this.getSingle() * i.getJ()) + (this.getSingle() * i.getJ());
        printmutiply(sum1,sum2);
    }
}
public class task7{
    public static void main(String[] args) {


    Scanner in=new Scanner(System.in);
    double u=in.nextDouble();
    double r=in.nextDouble();
    complex i=new complex();
    i.add(i);
    i.reduce(i);
    i.mutiply(i);
    }
}