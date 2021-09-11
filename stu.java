import java.io.*;

class test
{
	int fee,roll;
	String name;

void add_stu()throws IOException
{
	DataInputStream obj = new DataInputStream(System.in);
	
    
    System.out.println("STUDENT NAME");
    name = obj.readLine();
    System.out.println("ROLLNO");
    roll = Integer.parseInt(obj.readLine());
     System.out.println("FEES");
    fee = Integer.parseInt(obj.readLine());
}



void display()
{
	System.out.println("STUDENT NAME =" + name);
		System.out.println(" ROLLNO = " + roll);
		System.out.println("FEES = " + fee);
}
}
class stu
{
	public static void main(String[] args) throws IOException {
     

    
      test k[]=new test[5];

    int ch=0,flag=0;
     int d=0;
     int index=0;
     do
     {
     System.out.println("**** MENU *****");
     System.out.println("1. ADD STUDENT");
     System.out.println("2. SEARCH STUDENT");
     System.out.println("3. DISPLAY ALL");
     System.out.println("4. EXIT");
     System.out.println("ENTER YOUR CHOICE");
     
     DataInputStream obj = new DataInputStream(System.in);
     ch = Integer.parseInt(obj.readLine());
     	switch(ch)
     	{
     		case 1 : 
           k[index]=new test();
     	   k[index].add_stu();
     	    index++;
     		break;

     		case 2 :
     	     int n;
	         DataInputStream obj1 = new DataInputStream(System.in);
	         System.out.println("ENTER THE ROLLNO");
             n= Integer.parseInt(obj1.readLine());
             for (int x=0;x<index;x++)
              {
             if(k[x].roll==n)
             {
             	flag=1;
             	System.out.println();
             	k[x].display();
             	System.out.println();
             }	
             }
             if(flag==0)
             
             	System.out.println("SOORY STUDENT NOT FOUND");
             	break;
            

     		case 3:  
            for (int y=0;y<index;y++)
             {
            System.out.println();
            k[y].display();
            System.out.println();	
            }
     		break;
            case 4:System.exit(0);
            
            }
            


     		System.out.println("IF YOU WANT TO GO TO MENU PRESS 1");
     		d=Integer.parseInt(obj.readLine());
     	}while(d == 1);
     

		
	}
}

