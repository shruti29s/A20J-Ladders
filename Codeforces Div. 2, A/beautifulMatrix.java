/*      Problem statement : https://codeforces.com/problemset/problem/263/A */

import java.util.*;
import java.io.*;

public class beautifulMatrix {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[5][5];
        int m=0, n=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==1)
                {
                    m=i;
                    n=j;
                }
            }
        }
        int c=Math.abs(m-2)+Math.abs(n-2);
        System.out.println(c);
    }
}
