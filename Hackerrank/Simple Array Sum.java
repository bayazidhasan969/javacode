import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
public static void main(String[]args){
    int sum=0;
    Scanner input=new Scanner(System.in);
   int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=input.nextInt();
}
for(int i=0;i<n;i++)
{
     sum=sum+arr[i];
}
System.out.println(sum);
}
}
