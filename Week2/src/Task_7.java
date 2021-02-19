/*模拟农学院动物医疗系统信息。
 定义抽象家禽类(Poultry)
(1)私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
 (2)提供空参和带参构造方法
 (3)成员方法：
 ①抽象方法症状(showSymptom)
 ②普通方法基本信息(showMsg)
 ③提供 setXxx 和 getXxx 方法
 定义普通鸭子类(Duck)继承家禽类(Poultry)
(1)提供空参和带参构造方法
 (2)重写 showSymptom 方法，打印症状信息。*/
public class Task_7 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",2,"感冒");
        duck.showSymptom();
    }
    abstract static class Poultry{
        private String name;
        private String symptom;
        private int age;
        private String illness;

        public Poultry(){}
        public Poultry(String name, String symptom, int age, String illness) {
            this.name = name;
            this.symptom = symptom;
            this.age = age;
            this.illness = illness;
        }
        public abstract void showSymptom();
        public void showMsg(){

            System.out.println("动物种类: "+getName()+",年龄: "+getAge()+"岁");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymptom() {
            return symptom;
        }

        public void setSymptom(String symptom) {
            this.symptom = symptom;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age){
            this.age=age;
        }

        public String getIllness() {
            return illness;
        }

        public void setIllness(String illness) {
            this.illness = illness;
        }
    }
static class Duck extends Poultry{
        public Duck(){}

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom() {
            super.showMsg();
        System.out.println("入院原因: "+super.getIllness());
        System.out.println("症状为:"+super.getSymptom());
    }
}
}
