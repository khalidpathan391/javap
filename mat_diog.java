import java.io.*;
class mat_diog
{
public static void main(String args[])throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
int a[][]=new int[3][3];
for(int x=0;x<3;x++)
{
for(int y=0;y<3;y++)
{
System.out.println("Enter data:");
a[x][y]=Integer.parseInt(obj.readLine());
}
}
for(int x=0;x<3;x++)
{
System.out.println(a[x][x]+" "+a[x][2-x]);

}
System.out.println();
}
}