class A
{ 
public void display()
System.out.println("This is display function");
}
}
public class test
{
static void display()
{
System.out.println("display");
}
public static void main(string[] args)
{
int a=10;
int b=a;
A obj=new A();
obj.display();
display();
system.out.println(" new Hello world ");
}
}
