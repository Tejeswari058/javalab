import java.util.*;
class Lab4
{
  int a[][],b[][],c[][],m,n,p,q;
  Lab4()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter m");
   m=s.nextInt();
   System.out.println("enter n");
   n=s.nextInt();
   System.out.println("enter p");
   p=s.nextInt();
   System.out.println("enter q");
   q=s.nextInt();
   a=new int[m][n];
   b=new int[p][q];
   System.out.println("the first matrix ele");
   for(int i=0;i<m;i++)
   {
    for(int j=0;j<n;j++)
     {
       a[i][j]=s.nextInt();
     }
   }
   System.out.println("the second matrix ele");
   for(int i=0;i<p;i++)
   {
    for(int j=0;j<q;j++)
     {
       b[i][j]=s.nextInt();
     }
   }
  }
   void add()
   {
    if((m==p) && (n==q))
    {
      c=new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          c[i][j]=a[i][j]+b[i][j];
        }
      }
    }
   }
   void display()
   {
     
    for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
        
         System.out.print(c[i][j]+" ");
        }
        System.out.println();
      }
   }
    void sub()
   {
    if((m==p) && (n==q))
    {
      c=new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          c[i][j]=a[i][j]-b[i][j];
        }
      }
    }
   }
   
   void mul()
   {
    if(n==p)
    { 
     c=new int[m][q];
     for(int i=0;i<m;i++)
     {
      for(int j=0;j<q;j++)
     {
      c[i][j]=0;
      for(int k=0;k<n;k++)
      {
       c[i][j]=c[i][j]+a[i][k]*b[k][j];
      }
     }
    }
   }
  }
   
   public static void main(String args[])
   {
   Lab4 l=new Lab4();
    
   l.add();
   System.out.println("addition of two matrix");
   l.display();
   l.sub();
   System.out.println("subtraction of two matrix");
   l.display();
   l.mul();
   System.out.println("multiplication of two matrix");
   l.display();
  }
}
output:
enter m
2
enter n
3
enter p
2
enter q
3
the first matrix ele
2
3
2
1
2
1
the second matrix ele
232123
3
3
3
4
5
addition of two matrix
232125 6 5
4 6 6
subtraction of two matrix
-232121 0 -1
-2 -2 -4
multiplication of two matrix
-232121 0 -1
-2 -2 -4
  
	
