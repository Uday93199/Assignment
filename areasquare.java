import java.util.Scanner;
class areasquare
{
public static void main(String[] args)
{
int s;
Scanner sc=new Scanner(System.in);
System.out.println("enter side of square");
s=sc.nextInt();
double area=s*s;
System.out.println("area of square:"+area);
}
}