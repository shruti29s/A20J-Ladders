/*      Problem statement : https://codeforces.com/problemset/problem/441/A */

import java.util.*;
import java.io.*;

public class ValeraAndAntiqueItems {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int dp[]=new int[51];
        int c=0;
        for(int i=1;i<=n;i++)
        {
            int m=sc.nextInt();
            int arr[]=new int[m];
            for(int j=0;j<m;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int j=0;j<m;j++)
            {
                if(arr[j]<v)
                {
                    dp[i]=1;
                    c++;
                }
                break;
            }
        }
        System.out.println(c);
        for(int i=1;i<51;i++)
        {
            if(dp[i]==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}
