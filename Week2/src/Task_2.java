import java.util.Scanner;

class Solution {
        public String longestCommonPrefix() {
            String a[] = new String[0];
            if(a.length==0) return ""; //首先字符串不能为空
            String p = a[0];//取出第一个字符串，用于遍历
            for(int i=1;i<a.length;i++){
                //从第二个元素开始进行遍历
                while(a[i].indexOf(p) != 0){
                    p = p.substring(0,p.length()-1);
                    if(p.isEmpty()) return "";
                }
            }
            return p;
        }
    }
    public class Task_2{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Solution str= new Solution();
            System.out.println(str.longestCommonPrefix());
        }
    }
