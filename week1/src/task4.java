import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n= in.nextInt();
        int[] a=new int[n];
        for(int j=0;j<a.length-1;j++){
            a[j]= in.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            if(a[i]==0){
                int temp=a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
            }
        }
        for(int k=0;k<a.length-1;k++){
            System.out.println(a[k]);
        }
    }
}
