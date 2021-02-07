import java.util.Scanner;

public class Task_4 {
    int v = 100;
    int count = 0;
    public void guess() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (v > i) {
            System.out.println("猜小了。");
            count++;
            guess();
            return;
        } else if (v < i) {
            System.out.println("大了");
            count++;
            guess();
            return;
        } else {
            System.out.println("猜测成功");
            count++;
        }
        System.out.println("一共猜了" + count + "次");

    }
    public static void main(String[] args) {
        Task_4 m = new Task_4();
        Scanner sc = new Scanner(System.in);
        System.out.println("来猜猜吧");

        m.guess();
    }

}
