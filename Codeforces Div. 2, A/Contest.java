/*      Problem statement : https://codeforces.com/problemset/problem/501/A */

import java.util.*;
import java.io.*;

public class Contest {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int m=Math.max(3*a/10, a-(a/250)*c);
        int v=Math.max(3*b/10, b-(b/250)*d);
        if(m==v)
        {
            System.out.println("Tie");
        }
        else if(m>v)
        {
            System.out.println("Misha");
        }
        else{
            System.out.println("Vasya");
        }
    }
}
