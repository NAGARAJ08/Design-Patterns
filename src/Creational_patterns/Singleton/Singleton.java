package Creational_patterns.Singleton;


class Database{
	
	//Create a private attribute of the class type that refers to the single object.
	private static Database DBobject;
	
	//Create a private constructor of the class to restrict object creation outside of the class.
	private Database()
	{
		
	}
	
	
	//Create a public static method that allows us to create and access the object we created. 
	public static Database getInstance()
	{
		
		//a condition that restricts us from creating more than one object.
		if(DBobject == null)
		{
			DBobject = new Database();
		}
		return DBobject;
	}
	
	public void getConnection()
	{
		System.out.println("You are now connected to the database.");
	}
}

class Singleton {
	
	public static void main(String args[])
	{
		Database s1;
		s1 = Database.getInstance();
		s1.getConnection();
	}
	
}
