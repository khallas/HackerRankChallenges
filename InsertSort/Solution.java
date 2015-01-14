import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int s = in.nextInt();
        System.out.println("enter the array");
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int size = ar.length-1;
        int V = ar[size];
        int i = size;
        while(ar[i-1]>=V){
            ar[i]=ar[i-1];
            printArray(ar);
            i--;
        }
        ar[i]=V;
        printArray(ar);
    }

    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}