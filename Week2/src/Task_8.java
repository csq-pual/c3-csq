import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/* 定义抽象类 A，抽象类 B 继承 A，普通类 C 继承 B  A 类中，定义成员变量 numa，赋值为 10，抽象 showA 方法。
 B 类中，定义成员变量 numb，赋值为 20，抽象 showB 方法。
 C 类中，定义成员变量 numc，赋值为 30，重写 showA 方法，打印 numa，重写 showB
方法，打印 numb，定义 showC 方法，打印 numc。  测试类中，创建 C 对象，调用 showA 方法，showB 方法，showC 方法。*/
public class Task_8 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
    static abstract class A{
        private int numa = 10;
        abstract void showA();

        public void setNuma(int numa) {
            this.numa = numa;
        }

        public int getNuma() {
            return numa;
        }
    }
    static abstract class B extends A{
        private int numb = 20;
        abstract void showB();
        public void setNumb(int numb) {
            this.numb = numb;
        }

        public int getNumb() {
            return numb;
        }
    }
    static class C extends B{

        private int numc = 30;
        @Override
        void showA() {
            System.out.println(getNuma());
        }

        @Override
        void showB() {
            System.out.println(getNumb());
        }

        public void setNumc(int numc) {
            this.numc = numc;
        }

        public int getNumc() {
            return numc;
        }
        void showC(){
            System.out.println(getNumc());
        }
    }
}
