/*      Problem statement : https://codeforces.com/problemset/problem/510/A */

import java.util.*;
import java.io.*;

public class FoxAndSnake {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[n][m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                for(int j=0;j<m;j++)
                {
                    arr[i][j]='#';
                }
            }
            else{
                for(int j=0;j<m;j++)
                {
                    arr[i][j]='.';
                }
                if(c%2==0)
                {
                    arr[i][m-1]='#';
                }
                else{
                    arr[i][0]='#';
                }
                c++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
