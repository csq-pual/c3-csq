/*编写一个 Java 应用程序，设计一个汽车类 Vehicle，包含的属性有车轮个数 wheels 和车重
weight。小车类 Car 是 Vehicle 的子类，其中包含的属性有载人数 loader。卡车类 Truck 也是
Vehicle 的子类，其中包含的属性有载人数 loader 和载重量 payload。每个类都有构造方法和
输出相关数据的方法。最后，写一个测试类来测试这些类的功能。*/
public class Task_6 {
    private int weight;
    private int wheels;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public  int getWeight(){
        return weight;
    }

    public int getWheels() {
    return wheels;
    }
    public Task_6(int weight,int wheels){
        this.wheels=wheels;
        this.weight=weight;
    }
}
class cars extends Task_6{
    private int loader;
    public void setLoader(int loader) {
    this.loader=loader;
    }

    public int getLoader() {
        return loader;
    }
    public cars(int loader,int wheels,int weight){
        super(weight, wheels);
        this.loader=loader;
    }
}
class trucks extends Task_6{
    private int loader;
    private int payload;
    public void setLoader(){
        this.loader=loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }
    public trucks(int wheels,int weight,int loader,int payload){
        super(weight, wheels);
        this.loader=loader;
        this.payload=payload;
    }
}
class test{
    public static void main(String[] args) {
    Task_6 a = new Task_6(3,4);
    cars b = new cars(4,4,3);
    trucks c = new trucks(8,20,2,100);
        System.out.println("车有"+a.getWheels()+"轮子"+" 重"+a.getWeight()+"t");
        System.out.println("小汽车限载"+b.getLoader()+"人"+" 重"+b.getWeight()+"t"+" 有"+b.getWheels()+"个轮子");
        System.out.println("卡车限载"+c.getLoader()+"人"+" 重"+c.getWeight()+"t"+" 有"+c.getWheels()+"个轮子"+" 限载重"+c.getPayload()+"t");
    }
}








