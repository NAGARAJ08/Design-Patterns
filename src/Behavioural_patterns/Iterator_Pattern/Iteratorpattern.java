package Behavioural_patterns.Iterator_Pattern;

public class Iteratorpattern {

	public static void main(String args[])
	{
        CollectionofNames cmpnyRepository = new CollectionofNames();  

        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
            String name = (String)iter.next();  
            System.out.println("Name : " + name);  
         }      
	}
}
