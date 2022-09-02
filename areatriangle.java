import java.util.Scanner;
class areatriangle
{
public static void main(String[] args)
{
double b,h,a;
Scanner ob=new Scanner(System.in);
System.out.println("enter height of triangle");
h=ob.nextDouble();
System.out.println("enter base of triangle");
b=ob.nextDouble();
a=0.5*b*h;
System.out.println("Area of triangle="+a);
}
}
