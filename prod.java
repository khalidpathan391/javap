import java.io.*;
class text
{
int p_id;
int p_mrp;
String p_name;
int stock;
void add_product()throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
System.out.println("PRODUCT ID:");
p_id=Integer.parseInt(obj.readLine());
System.out.println("PRODUCT MRP");
p_mrp=Integer.parseInt(obj.readLine());
System.out.println("PRODUCT NAME:");
p_name=obj.readLine();
System.out.println("PRODUCT STOC:");
stock=Integer.parseInt(obj.readLine());

}
void display()throws IOException
{
System.out.println("PRODUCT ID="+p_id);
System.out.println("PRODUCT MRP="+p_mrp);
System.out.println("PRODUCT NAME="+p_name);
System.out.println("PRODUCT STOCK="+stock);

}
}
class prod{
public static void main(String args[])throws IOException
{
text t[]=new text[5];
int ch=0,flag=0,index=0,d=0;
do{
System.out.println("***********MENU***********");
System.out.println("\n1.ADD PRODUCT\n2.ADD STOCK\n3.SOLD STOCK\n3.SEARCH PRODUCT\n4.DISPLAY ALL\n6.EXIT:");
System.out.println("Enter your choice:");
DataInputStream obj=new DataInputStream(System.in);
ch=Integer.parseInt(obj.readLine());
switch(ch)
{
case 1:
t[index]=new text();
t[index].add_product();
index++;
break;
case 2:
int i,st=0;
DataInputStream obj1=new DataInputStream(System.in);


System.out.println("Enter product id:");
i=Integer.parseInt(obj.readLine());
for(int x=0;x<index;x++)
{
if(t[x].p_id==i)
flag=1;
System.out.println();
t[x].display();
System.out.println("Enter no. of stock:");
st=Integer.parseInt(obj.readLine());
t[x].stock=t[x].stock+st;
t[x].display();
System.out.println();

}

if(flag==0)
System.out.println("Sorry stock is not found:");
break;
case 3:
DataInputStream obj2=new DataInputStream(System.in);


System.out.println("Enter product id:");
i=Integer.parseInt(obj.readLine());
for(int x=0;x<index;x++)
{
if(t[x].p_id==i)
flag=1;
System.out.println();
t[x].display();
System.out.println("Enter no. of stock:");
st=Integer.parseInt(obj.readLine());
t[x].stock=t[x].stock-st;
t[x].display();
System.out.println();

}

if(flag==0)
System.out.println("Sorry stock is not found:");
break;

case 4:

DataInputStream obj3=new DataInputStream(System.in);


System.out.println("Enter product id:");
i=Integer.parseInt(obj.readLine());
for(int x=0;x<index;x++)
{
if(t[x].p_id==i)
flag=1;
System.out.println();
t[x].display();
System.out.println();

}

if(flag==0)
System.out.println("Sorry stock is not found:");
break;
    case 5:
for(int y=0;y<index;y++) {
    System.out.println();
    t[y].display();
    System.out.println();

}
break;

case 6:
System.exit(0);
}
System.out.println("if u want to go back meny press 1:");
d=Integer.parseInt(obj.readLine());
}
while(d==1);
}
        }