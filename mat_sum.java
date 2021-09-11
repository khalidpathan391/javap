import java.io.*;
class mat_sum
{
public static void main(String args[])throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
int a[][]=new int[3][3];
for(int x=0;x<3;x++)
{
for(int y=0;y<3;y++)
{
System.out.println("Enter 1st mattrix Data:");
a[x][y]=Integer.parseInt(obj.readLine());
}
}
int b[][]=new int[3][3];
for(int x=0;x<3;x++)
{
for(int y=0;y<3;y++)
{
System.out.println("Enter 2nd mattrix Data:");
b[x][y]=Integer.parseInt(obj.readLine());
}
}
int c[][]=new int[3][3];
for(int x=0;x<3;x++)
{
for(int y=0;y<3;y++)
{
c[x][y]=a[x][y]+b[x][y];
}
}
for(int x=0;x<3;x++)
{
for(int y=0;y<3;y++)
{
System.out.println(c[x][y]+",");
}
System.out.println();
}
}
}