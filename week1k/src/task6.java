import java.util.Scanner;

class bank{
    private String name;
    private double balance;
    public void setName(String t){
        name=t;
    }
    public void setBalance(double x){
        if(x>0){
            balance=x;
        }
    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public bank(String name,double balance){
        this.balance=balance;
        this.name=name;
    }
    public void check(){
        System.out.println("用户名称:"+this.name+" 您的余额为："+this.balance);

    }
}
public class task6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double c=in.nextDouble();
    bank a=new bank("scott",c);
    a.check();
    }
}
