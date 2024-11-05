package selenium_package;

public class SingletonObject {


		    // Declaring the instance, but not creating it yet
		    private static SingletonObject instance;

		    // Private constructor to prevent instantiation
		    private SingletonObject() {}

		    // Synchronized method to ensure thread safety
		    public static  SingletonObject getInstance() {
		        if (instance == null) {
		            instance = new SingletonObject();
		        }
		        return instance; 
		    }
		}
	
