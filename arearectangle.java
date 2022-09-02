import java.util.Scanner;
class arearectangle
{
public static void main(String[] args)
{
int l,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter length of rectangle:");
l=sc.nextInt();
System.out.println("enter breadth of rectangle:");
b=sc.nextInt();
double area=l*b;
System.out.println("area of rectangle:"+area);
}
}