/*      Problem statement : https://codeforces.com/problemset/problem/160/A */

import java.util.*;
import java.io.*;

public class twins {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum1=0, sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1+=a[i];
        }
        int i;
        for(i=n-1;i>=0;i--)
        {
            sum1-=a[i];
            sum2+=a[i];
            if(sum2>sum1)
                break;
        }
        System.out.println(n-i);
    }
}
