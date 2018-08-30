package tree;

import java.util.*;


class anagram 
{
    int k = 0;
     
    void input()throws Exception
    {
        Scanner sy = new Scanner(System.in);
        System.out.print("Enter a word : ");   
        String ana = sy.next();
        System.out.println("The Anagrams are : ");
        display("",ana);
        System.out.println("Total Number of Anagrams = "+k);
    }
   
    void display(String m1, String m2)
    {
        if(m2.length()<=1)
        {
            k++;
            System.out.println(m1+m2);
        }
        else
        {
            for(int i=0; i<m2.length(); i++)     
            {
                String a = m2.substring(i, i+1);
                String b = m2.substring(0, i);
                String c = m2.substring(i+1);
                display(m1+a, b+c);
            }
        }
    }
     
    public static void main(String args[])throws Exception
    {
        anagram ob=new anagram();
        ob.input();
    }
}