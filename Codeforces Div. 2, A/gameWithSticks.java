/*      Problem statement : https://codeforces.com/problemset/problem/451/A */

import java.util.*;
import java.io.*;

public class gameWithSticks {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=Math.min(n,m);
        if(x%2==0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");
    }
}
