/*      Problem statement : https://codeforces.com/problemset/problem/152/A */

import java.util.*;
import java.io.*;

public class Marks {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c[]=new int[n];
        char arr[][]=new char[n][m];
        for(int k=0;k<n;k++)
        {
            String s=sc.next();
            arr[k]=s.toCharArray();
        }
        for(int i=0;i<m;i++)
        {
            char max='0';
            for(int j=0;j<n;j++)
            {
                if(arr[j][i]>max)
                {
                    max=arr[j][i];
                }
            }
            for(int j=0;j<n;j++)
            {
                if(arr[j][i]==max)
                {
                    c[j]=1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=c[i];
        }
        System.out.println(sum);
    }
}
