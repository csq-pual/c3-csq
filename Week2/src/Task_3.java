import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String args[]){
        System.out.println("输入一个字符串:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuffer s = new StringBuffer();
        char[] c = str.toCharArray();
        System.out.println("打印出其中所有的数字:");
        String regex = "\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        for(int i =0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                s.append(c[i]);
            }
        }
        System.out.println(s);

    }
}
