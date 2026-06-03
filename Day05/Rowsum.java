package Day05;

import java.util.Scanner;

public class Rowsum{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
        int [][]a=new int[m][n];
       for (int i = 0; i < m; i++) {
           for (int j=0;j<n;j++){
               a[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<m;i++){
           int sum=0;
           for(int j=0;j<n;j++) {
               sum += a[j][i];
           }

           System.out.println(sum);

       }
    }
}