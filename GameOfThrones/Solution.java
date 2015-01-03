import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        char[] chars = Solution.getCharsFromString(inputString);
        Arrays.sort(chars);
        int unpairedCharsCount=0;
        
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                i++;
            }
            else{
                unpairedCharsCount++;
            }
        }
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        if(unpairedCharsCount<2)
            ans = "YES";
        else
            ans = "NO";
        System.out.println(ans);
        myScan.close();
    }
    public static char[] getCharsFromString(String input){
        char[] output = new char[input.length()];
        for (int i =0;i<input.length();i++){
            output[i]=input.charAt(i);
        }
        return output;
    }
}