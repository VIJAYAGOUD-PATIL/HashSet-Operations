import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

 class code{
    public static void main(String args[])
    {

        //Scanner
            Scanner s=new Scanner(System.in);

            //Creating Hash
            HashSet<Integer> h=new HashSet<>();
            //input from user
            System.out.println("Enter The Elements In The Hash :");
            int a=s.nextInt();
            System.out.println("The Elements are :");
            for(int i=0;i<a;i++)
            {
               int b=s.nextInt(); 
                h.add(b);
           
            }
            //HashSet Elements
            System.out.println("Entered Elements In HashSet");
             System.out.println(h);

             //Iterator
            System.out.println("Using Iterator We Can Print HashSet Elements ");
             Iterator it=h.iterator();

             while(it.hasNext())
             {
                System.out.println(it.next());
             }

             //size of HashSet

             System.out.println("Size Of HashSet = "+h.size());

             //Delete Elements Based On User

             System.out.println("Deleted Elements Are");

             h.remove(h);
             System.out.println(h);

             


            
            
    }
} 