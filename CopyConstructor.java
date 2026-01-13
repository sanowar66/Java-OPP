class CopyConstructor{
int id;
String name;
int age;
public CopyConstructor(int x, String y, int z) {id=x;name=y;age=z;}
public CopyConstructor(CopyConstructor a) {id=a.id;name=a.name;age=a.age;}

void show(){System.out.println(id+" "+name+" "+age);}
public static void main(String [] args)
{
CopyConstructor c1 = new CopyConstructor(102,"Anayet",22);
CopyConstructor c2 = new CopyConstructor(c1);
c1.show();
c2.show();
}}