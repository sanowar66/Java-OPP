class Father_Cal
{
int x, y,z;
void sum(int a , int b)
{
z=a+b;
System.out.println("The Sum is: "+z);
}

int sub(int a, int b)
{
x=a;
y=b;
 return x-y;
}
void multi(int a,int b)
{
z=a*b;
System.out.println("The Multi is: "+z);
}
}

class Child_Calculation extends Father_Cal
{
void div()
{
z=x/y;
System.out.println("The div is: "+z);
}
public static void main(String args[])
{
Child_Calculation co= new Child_Calculation();
Father_Cal fo= new Father_Cal();
fo.sum(10,5);
fo.multi(10,5);
co.sub(10,5);
co.div();

System.out.println("The sub is: "+co.sub(10,5));
}
}