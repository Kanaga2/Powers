# Powers
import java.io.*;
import java.util.*;
public class Powers
{
public static void main(String args[]);
{
int base,exponent;
int a,b,c,d,e,f,g,h,i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
if(n==0)
{
System.out.println("Enter a value greater than 9");
}
else
{
        a=n%10;
        b=n/10;
        c=b%10;
        d=b/10;
        e=d%10;
        f=d/10;
        g=f^a;
        h=e^a;
        i=c^a;
        j=a^a;
        k=(g+h+i+j);
        System.out.println(k);
        }
        }
        }
        

