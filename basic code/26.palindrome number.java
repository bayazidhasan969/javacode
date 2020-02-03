import java.util.Scanner;


public class Palindromenumber {
    public static void main(String[] args) {
               Scanner input=new Scanner(System.in);
 int sum=0,r,temp,num;
 System.out.println("Enter a number : ");
 num=input.nextInt();
 temp=num;
 while(temp!=0){
     r=temp%10;
     sum=sum*10+r;
     temp=temp/10;
 }
 if(num==sum)//palindrome means normal number==reverse number.121==121.
 System.out.println("it is a palindrome number");  
 else
 System.out.println("not a palindrome number");
    }
 
}
