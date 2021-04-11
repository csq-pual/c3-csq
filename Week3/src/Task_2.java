import java.util.ArrayList;
import java.util.List;

/*
用 List 来存储下表信息并遍历输出
提示：定义一个类，id、name、salary、managerId 为类中的属性，然后将每一行记录添加
到集合中。
*/
public class Task_2 {
    public static void main(String[] args) {

        List<test> m = new ArrayList<test>();
        List<String> a = new ArrayList<>();
        a.add("id"+" "+"name"+" "+"salary"+" "+"managerid");
        m.add(new test(1,"Joe",70000.0,3));
        m.add(new test(2,"Henry",80000.0,90));
        m.add(new test(10,"Sam",60000.0,null));
        m.add(new test(21,"Max",50000.0,null));
        System.out.println(a);
        for (test t : m) {
            System.out.println(t);
        }
    }
    static class test{
        private Integer id;
        private String name;
        private Double salary;
        private Integer managerId;

        public test(int id, String sam, double salary, Integer o) {}

        public test(int id, String name, double salary, int managerId) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.managerId = managerId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getManagerId() {
            return managerId;
        }

        public void setManagerId(int managerId) {
            this.managerId = managerId;
        }
        @Override
        public String toString() {
            return "id=" + id +
                    ", name=" + name +
                    ", salary=" + salary +
                    ", managerId=" + managerId;
        }
    }
}
