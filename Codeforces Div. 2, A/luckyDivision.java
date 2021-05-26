/*      Problem statement : https://codeforces.com/problemset/problem/122/A */

import java.util.*;
import java.io.*;

public class luckyDivision {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(n<arr[i])
            {
                break;
            }
            if(n%arr[i]==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
