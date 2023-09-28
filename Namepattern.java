package patternProject;

import java.util.Scanner;

public class Namepattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter");
		String s=scan.nextLine();
		for(int q=0;q<s.length();q++)
		{
			char ch=s.charAt(q);
		
		if(ch=='p'||ch=='P')
		{
		 //for letter 
		   for (int i = 0; i <= 5; i++)
		   {
	         for (int j = 0; j <= 5; j++) 
	            {
	                if (j == 0 || i == 0 || i == 2 || (i <= 2 && j == 5))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
		   }
		 System.out.print("");
		}
		
		
		 //for letter R
		else if(ch=='r'||ch=='R')
		{
	            for (int i = 0; i < 5; i++)
	            {
		            for (int j = 0; j <= 5; j++) 
		            {
		                if (j == 0 || i == 0 || i == 2||(i == 4 && j == 5)||(i == 1 && j == 5)||(i == 3 && j == 3) )
		                    System.out.print("*");
		                else
		                    System.out.print(" ");
		            }
		            System.out.println();
	            }  
	            System.out.println(); 
		}
		
	            //for letter N
		else if(ch=='n'||ch=='N')
		{
	            
	           for (int i = 0; i< 5; i++)
	            {
		            for (int j = 0; j <= 4; j++) 
		            {
		                if (j == 0 || j == 4 || (i == 2 && j == 2) ||(i == 1 && j == 1)||(i == 3 && j == 3) ||(i == 4 && j == 4))
		                    System.out.print("*");
		                else
		                    System.out.print(" ");
		            }
		            System.out.println();
	            }  
		
	            System.out.println();
		}
	            //for letter A
		else if(ch=='a'||ch=='A')
		{
	            for (int i = 1; i <= 5; i++)
	            {
	            	for(int k=1;k<=5-i;k++) 
	            	{
	            		System.out.print(" ");
	            	}
		            for (int j = 1; j <= i+i-1; j++) 
		            {
		                if ( i == 3|| j == i+i-1||j==1 )
		                  System.out.print("*");
		                else
		                	System.out.print(" ");
		            }
		             
		            
		          System.out.println();
	            }  
	            System.out.println();
		}
	            //for letter A
		else if(ch=='v'||ch=='V')
		{
			
	            for (int i = 0; i <= 5; i++)
	            {
	            	for(int k=1;k<=i;k++) 
	            	{
	            		System.out.print(" ");
	            	}
		            for (int j = 1; j <=(5*2-i-1-i); j++)
		            {
		               if(j==1||j==(5*2-i-1-i)) 
		                  System.out.print("*");
		              else
		            	  System.out.print(" ");
		            }
		            System.out.println();
	           }
		
		            
		             
		            
		          //System.out.println();
	            
	            System.out.println();
	      }
	            //letter for E
		else if(ch=='e'||ch=='E')
		
		{
	            for (int i = 0; i <=4; i++)
	   		 {
	   	            for (int j = 0; j <= 5; j++) 
	   	            {
	   	                if (j == 0 || i == 0 || i == 2 ||i==4)
	   	                    System.out.print("*");
	   	                else
	   	                    System.out.print(" ");
	   	                
	   	            }
	   	            System.out.println();
	   		 }
	   		 System.out.println();
		}
else if(ch=='h'||ch=='H')
			
		{
	            for (int i = 0; i <=4; i++)
	   		 {
	   	            for (int j = 0; j <= 5; j++) 
	   	            {
	   	                if (j == 0 || j == 5 || i == 2 )
	   	                    System.out.print("*");
	   	                else
	   	                    System.out.print(" ");
	   	                
	   	            }
	   	            System.out.println();
	   		 }
	   		 System.out.println();
		}
		//for letter T
else if(ch=='t'||ch=='T')
			
		{
	            for (int i = 0; i <=4; i++)
	   		 {
	   	            for (int j = 0; j < 5; j++) 
	   	            {
	   	                if (j == 2|| i == 0 )
	   	                    System.out.print("*");
	   	                else
	   	                    System.out.print(" ");
	   	                
	   	            }
	   	            System.out.println();
	   		 }
	   		 System.out.println();
		}
else if(ch=='s'||ch=='S')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j < 5; j++) 
	            {
	                if ( i == 2||i==0||i==4||(i==1&&j==0)|| (i==3&&j==4))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
		//letter for U
else if(ch=='u'||ch=='U')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j < 5; j++) 
	            {
	                if ( j==0||j==4||i==4)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='w'||ch=='W')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j < 5; j++) 
	            {
	                if ( j==0||j==4||(i==2&&j==2)||(i==3&&j==1)||(i==3&&j==3))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='z'||ch=='Z')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j < 5; j++) 
	            {
	                if ( i==0||i==4||(i==1&&j==3)||(i==2&&j==2)||(i==3&&j==1))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='m'||ch=='M')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j < 5; j++) 
	            {
	                if ( j==0||j==4||(i==2&&j==2)||(i==1&&j==1)||(i==1&&j==3))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}

else if(ch=='f'||ch=='F')
		{
			
		 //for letter f
		   for (int i = 0; i <= 5; i++)
		   {
	         for (int j = 0; j <= 5; j++) 
	            {
	                if (j == 0 || i == 0 || i == 2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
		   }
		 System.out.print("");
		}
else if(ch=='g'||ch=='G')
		{
			
		 //for letter G
		   for (int i = 0; i <5; i++)
		   {
	         for (int j = 0; j < 5; j++) 
	            {
	                if (j == 0 ||( i == 4&&j<4)||(i>=2&&j==3)||(i==0&&j<=2)||(i==2&&j>1))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
		   }
		 System.out.print("");
		}
		//for lettr L

else if(ch=='l'||ch=='L')
			
		{
	            for (int i = 0; i <=4; i++)
	   		 {
	   	            for (int j = 0; j <= 4; j++) 
	   	            {
	   	                if (j == 0 || i == 4 )
	   	                    System.out.print("*");
	   	                else
	   	                    System.out.print(" ");
	   	                
	   	            }
	   	            System.out.println();
	   		 }
	   		 System.out.println();
		}
else if(ch=='i'||ch=='I')
			
		{
	            for (int i = 0; i <=4; i++)
	   		 {
	   	            for (int j = 0; j <= 4; j++) 
	   	            {
	   	                if (j == 2|| i == 4 ||i==0)
	   	                    System.out.print("*");
	   	                else
	   	                    System.out.print(" ");
	   	                
	   	            }
	   	            System.out.println();
	   		 }
	   		 System.out.println();
		}
else if(ch=='j'||ch=='J')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j == 2|| (i==4&&j<3) ||i==0||(i==3&&j==0))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='k'||ch=='K')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j == 0|| (j==3&&i==0)||(j==2&&i==1)||(j==1&&i==2)||(j==2&&i==3)||(j==3&&i==4) )
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='y'||ch=='Y')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j ==4-i||(i==1&&j==1)||(i==0&&j==0)) 
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='x'||ch=='X')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j ==4-i||j==i) 
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='c'||ch=='C')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j ==0||i==0||i==4) 
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	            System.out.println();
		 }
		 System.out.println();
}
else if(ch=='d'||ch=='D')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j ==0||(i==0&&j<=3)||(i==4&&j<=3)||(j==4&&i==3) ||(j==4&&i==2)||(j==4&&i==1))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	           System.out.println();
		 }
		// System.out.println();
}
else if(ch=='b'||ch=='b')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if (j ==0||i==2||(i==0&&j<=3)||(i==4&&j<=3)||(j==4&&i==3) ||(j==4&&i==2)||(j==4&&i==1))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	           System.out.println();
		 }
		 System.out.println();
}

else if(ch=='o'||ch=='O')
	
{
        for (int i = 0; i <=4; i++)
		 {
	            for (int j = 0; j <= 4; j++) 
	            {
	                if( (i==0||i==4)&&(j>0&j<4)||(j==0||j==4)&&(i>0&i<4))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                
	            }
	           System.out.println();
		 }
		 System.out.println();
}
else if(ch=='q'||ch=='Q')
{
 //for letter P
   for (int i = 0; i <= 5; i++)
   {
     for (int j = 0; j <= 5; j++) 
        {
            if (j == 5 || i == 0 || i == 2 || (i <= 2 && j == 0))
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
   }
 System.out.print("");
}

		else
		{
			System.out.println("Bro its not an letter");
	     }
		}
	    


	}

}
