import java.io.*;
class test2
{
int id,sal;
String name;
void set_info()throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
System.out.println("Enter any id,salery,name:");
id=Integer.parseInt(obj.readLine());
sal=Integer.parseInt(obj.readLine());
name=obj.readLine();
}
void display()
{
System.out.println("ID="+id);
System.out.println("SALERY="+sal);
System.out.println("NAME="+name);
}
}
class employee
{
public static void main(String args[])throws IOException
{
test2 obj[]=new test2[5];
for(int x=0;x<5;x++)
{
obj[x]=new test2();
obj[x].set_info();
}
for(int x=0;x<5;x++)
{
obj[x].display();
}
}

}