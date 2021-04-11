import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*现获取到用户输入的一段字符串（可从键盘录入），例如：aaaabbbcccccdd。请编写程序
获取其中无重复的字符组成一个新的字符串，即：abcd。请不要改变字符的输入顺序。
提示：可以利用 set 集合的去重
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Task3 {
 public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 String str=in.nextLine();
 Set<Character> set=new HashSet<Character>();
 for(int i=0;i<str.length();i++){
 set.add(str.charAt(i));
 }
 System.out.println(set);
 } }
*/
public class Task_3{
    public static void main(String[] args) {
            Set<Character> a = new HashSet<Character>();
            Scanner in = new Scanner(System.in);
            String b = in.nextLine();
            for(int i = 0;i < b.length();i++){
                a.add(b.charAt(i));
            }
        System.out.println(a);
        }
}

