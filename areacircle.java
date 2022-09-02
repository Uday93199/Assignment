import java.util.Scanner;
class areacircle
{
public static void main(String[] args)
{
double r,a,c;
Scanner ob=new Scanner(System.in);
System.out.println("enter radius of circle");
r=ob.nextInt();
a=3.14*r*r;
c=2*3.14*r;
System.out.println("Area of circle="+a);
System.out.println("circumference="+c); 
}
}