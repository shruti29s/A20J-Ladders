/*      Problem statement : https://codeforces.com/problemset/problem/443/A */

import java.util.*;
import java.io.*;

public class AntonAndLetters {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> h=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                h.add(ch);
            }
        }
        System.out.println(h.size());
    }
}
