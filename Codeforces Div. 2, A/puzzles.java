/*      Problem statement : https://codeforces.com/problemset/problem/337/A*/

import java.util.*;
import java.io.*;

public class puzzles {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int i=0, j=n-1;
        int min=Integer.MAX_VALUE;
        while(j<m)
        {
            min=Math.min(min, a[j]-a[i]);
            j++;
            i++;
        }
        System.out.println(min);
    }
}
