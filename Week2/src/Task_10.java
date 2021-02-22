/*
接口多态练习
 定义接口 Universe，提供抽象方法 doAnything。  定义普通类 Star，提供成员发光 shine 方法
 定义普通类 Sun，继承 Star 类，实现 Universe 接口
 测试类中，创建 Star 对象，调用 shine 方法
 测试类中，多态的方式创建 Sun 对象，调用 doAnything 方法，向下转型，调用 shine 方
法。
*/
public class Task_10 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("====================");
        Universe universe = new Sun(); //向上转型，创建出接口对象
        universe.doAnything();
        Sun sun = (Sun) universe; //向下转型，调用 shine 方法
        sun.shine();
    } }
//定义接口
interface Universe{
    public abstract void doAnything();
}
//定义普通类 Star
class Star {
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    } }
//定义普通类 Sun，继承 Star 类，实现 Universe 接口
class Sun extends Star implements Universe{
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着 9 大行星旋转");
    }
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟,到达地球");
    } }
