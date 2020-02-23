import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

 public static void main(String[]args){
int a0,a1,a2,b0,b1,b2;
Scanner sc=new Scanner(System.in);
a0=sc.nextInt();
a1=sc.nextInt();
a2=sc.nextInt();
b0=sc.nextInt();
b1=sc.nextInt();
b2=sc.nextInt();
int pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
 int pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
 System.out.println(pointsAlice+" " +pointsBob);
 }
 }
