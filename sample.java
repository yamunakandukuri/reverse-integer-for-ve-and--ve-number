import java.util.*;
public class sample
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n;
 n=sc.nextInt();
 int r;
int Sum=0;
while(n!=0)
 {
 r = n%10;
 Sum=(Sum*10)+r;
 n=n/10;
 }
System.out.println(Sum);
}}
