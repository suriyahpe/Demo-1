package com.hpe.cache.mainmethod;

import com.hpe.cache.fifo.FifoCache;
import com.hpe.cache.lrucache.LRUCache;
import java.util.Scanner;
import com.hpe.cache.staticcache.StaticCache;


public class CacheMainMethods {

 public static FifoCache fc= new FifoCache(6);
 public static LRUCache lc=new LRUCache(6);
 public static StaticCache s= new StaticCache(5);
 
 static int key,ch;
	static	String value;
	static	boolean flag;
		@SuppressWarnings("resource")
	static	Scanner sc=new Scanner(System.in); 
   
    
    public static void main(String[] args)
	{
	
          System.out.println("CACHE FRAMEWORK ");

           do{
              
            System.out.println("1. Static Cache... \n2. FIFO Cache... \n3. LRU Cache... \n4. Exit. \n\n Please enter your choice:- ");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:{
                
                s.addCache(key, value);
        do
	{
	 System.out.println("\n1. Get Cache\n2. Exit\n");
	 System.out.println("Please enter your choice");
	 ch=sc.nextInt();
	 switch(ch)
	 {
	 
	 case 1:System.out.println("Enter the key");
			key=sc.nextInt();
			value=s.getCache(key);
			System.out.println(value);
			break;
	 
	 case 2: System.exit(1);
	         break;
	  default: System.out.println("Invalid choice");
	 
			
	 }
	
	}while(true);
        }
            
                case 2:{
            do
		{
                 
		 System.out.println("1.Add Cache\n2.Get Cache\n3.Delete Cache\n4.Update Cache\n5.Exit\n");
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:System.out.println("Enter key");
			     key=sc.nextInt();
			     System.out.println("Enter value");
			     value=sc.next();
			     fc.addCache(key, value);
			     break;
		 case 2:System.out.println("Enter the key");
				key=sc.nextInt();
				value=fc.getCache(key);
				System.out.println(value);
				break;
		 case 3:System.out.println("Enter the key");
			key=sc.nextInt();
			flag=fc.delCache(key);
			if(flag == true)
			    System.out.println("Deleted");
			else
				System.out.println("Key not Found");
			break;
		 case 4:System.out.println("Enter key");
	     key=sc.nextInt();
	     System.out.println("Enter value");
	     value=sc.next();
	     flag = fc.update(key, value);
	     if(flag == true)
			    System.out.println("Updated");
			else
				System.out.println("Key not Found");
			break;
				
				
		 case 5: System.exit(1);
		         break;
		  default: System.out.println("Invalid choice");
		   }
		
		}while(true);
			
	}
                case 3:
                {
            do
		{
		 System.out.println("1.Add Cache\n2.Get Cache\n3.Delete Cache\n4.Update Cache\n5.Exit\n");
		 System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:System.out.println("Enter key");
			     key=sc.nextInt();
			     System.out.println("Enter value");
			     value=sc.next();
			     lc.addCache(key, value);
			     break;
		 case 2:System.out.println("Enter the key");
				key=sc.nextInt();
				value=lc.getCache(key);
				System.out.println(value);
				break;
		 case 3:System.out.println("Enter the key");
			key=sc.nextInt();
			flag=lc.delCache(key);
			if(flag == true)
			    System.out.println("Deleted");
			else
				System.out.println("Key not Found");
			break;
		 case 4:System.out.println("Enter key");
	     key=sc.nextInt();
	     System.out.println("Enter value");
	     value=sc.next();
	     flag = lc.update(key, value);
	     if(flag == true)
			    System.out.println("Updated");
			else
				System.out.println("Key not Found");
			break;
				
				
		 case 5: System.exit(1);
		         break;
		  default: System.out.println("Invalid choice");
		 
				
		 }
		
		}while(true);    
                }
                case 4: System.exit(1);
            }
         }while(true);	
    }
}