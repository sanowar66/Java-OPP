class Constructor1{
int id;
public Constructor1()
{
id=10;
}
void increment(){id=id+1;}
void decrement(){id=id-1;}
int get_id(){return id;}
}
class MyClass
{
public static void main(String [] args)
{
Constructor1 c1 = new Constructor1();
System.out.println(c1.get_id());
c1.increment();
System.out.println(c1.get_id());
}
}