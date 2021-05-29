/*      Problem statement : https://codeforces.com/problemset/problem/208/A */

import java.util.*;
import java.io.*;

public class dubstep {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s[]=str.split("WUB");
        String s1="";
        for(int i=0;i<s.length;i++)
        {
            s1+=s[i]+" ";
        }
        System.out.println(s1.trim());
    }
}
