/*      Problem statement : https://codeforces.com/problemset/problem/496/A */

import java.util.*;
import java.io.*;

public class MinimumDifficulty {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[1]-a[0];
        for(int i=1;i<n-1;i++){
            max=Math.max(max, a[i+1]-a[i]);
        }
        int min=a[2]-a[0];
        for(int i=1;i<n-2;i++)
        {
            min=Math.min(min, a[i+2]-a[i]);
        }
        System.out.println(Math.max(min, max));
    }
}
