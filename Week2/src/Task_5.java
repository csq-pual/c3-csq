/*Monkey 类中有个构造方法：Monkey (String s)，并且有个 public void speak()方法，在 speak
        方法中输出“咿咿呀呀......”的信息。
         People 类是 Monkey 类的子类，在 People 类中重写方法 speak(),在 speak 方法中输出“小
        样的，不错嘛！会说话了！”的信息。
         在 People 类中新增方法 void think()，在 think 方法中输出“别说话！认真思考！”的信
        息。
         在主类的 main 方法中创建 Monkey 与 People 类的对象类测试这 2 个类的功能。*/
    class Monkey{
        public Monkey(String s){}
        public void Speak(){
            System.out.println("咿咿呀呀......");
        }
    }
    class People extends Monkey{
        People(String s){
            super(s);
        }

        public void Speak() {
            System.out.println("小样的，不错嘛！会说话了！");
        }
        void Think(){
            System.out.println("别说话！认真思考！");
        }
    }
public class Task_5 {
    public static void main(String[] args) {
        Monkey m = new Monkey("啦啦啦");
        m.Speak();
        People p = new People("嘻嘻嘻");
        p.Speak();
        p.Think();
    }
}
