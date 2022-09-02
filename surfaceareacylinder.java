import java.util.Scanner;
class surfaceareacylinder
{
public static void main(String[] args)
{
double r,h,s;
Scanner ob=new Scanner(System.in);
System.out.println("enter radius of cylinder");
r=ob.nextDouble();
System.out.println("enter height of cylinder");
h=ob.nextDouble();
s=2*3.14*r*h;
System.out.println("surface area of cylinder="+s); 
}
}