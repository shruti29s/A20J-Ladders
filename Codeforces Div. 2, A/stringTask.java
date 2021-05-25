/*      Problem statement : https://codeforces.com/problemset/problem/118/A  */

import java.util.*;
import java.io.*;
class stringTask {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toLowerCase();
        String mod_str="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'))
            {
                mod_str+='.';
                mod_str+=ch;
            }
        }
        System.out.println(mod_str);
    }
}
