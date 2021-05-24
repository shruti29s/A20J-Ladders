/*      Problem statement : https://codeforces.com/problemset/problem/4/A  */

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        if(w%2==0 && w!=2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}