import java.util.Scanner;

/*
给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
*/
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//输入的n阶矩阵
        int [][] matrix = new int[n][n];
        System.out.println();
        rotate(matrix);
        print(matrix);
    }

    private static void rotate(int[][] matrix){
        int tR=0;
        int tC=0;
        int dR=matrix.length-1;
        int dC=matrix[0].length-1;
        while(tR<=dR) {
            edge(matrix, tR++, tC++, dR--,dC--);
        }
    }

    private static void edge(int[][] matrix, int tR, int tC, int dR, int dC){
        int times=dC-tC;//总的组数
        int temp=0;
        for(int i=0; i!=times;i++) {
            //一次循环就是一组调整
            temp=matrix[tR][tC+i];
            matrix[tR][tC+i]=matrix[dR-i][tC];
            matrix[dR-i][tC]=matrix[dR][dC-i];
            matrix[dR][dC-i]=matrix[tR+i][dC];
            matrix[tR+i][dC]=temp;

        }
    }
    private static int[][] createMatrix() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//输入的n阶矩阵
        int matrix[][]=new int[n][n];
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }
    private static void print(int[][] matrix) {
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

