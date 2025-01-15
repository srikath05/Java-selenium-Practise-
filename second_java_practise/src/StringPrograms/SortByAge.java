package StringPrograms;

import java.util.*;

public class SortByAge {
    public static void main(String[] args) {
        // Create a list of Person objects
    	
        List<Person> people = new ArrayList<>();
        
        people.add(new Person("Anil", 45, 5000));
        people.add(new Person("Srinath", 42, 3000));
        people.add(new Person("Dravid", 40, 10000));
        people.add(new Person("Sachin", 41, 20000));
        people.add(new Person("Dhoni", 38, 17000));

        // Sort by age using a simple lambda expression
       // Collections.sort(people, (p1, p2) -> p1.age - p2.age);
        
        // Sort the list by age using a comparator 
        people.sort(Comparator.comparingInt(p -> p.age));
        

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
        
       // for (int i = 0; i < people.size(); i++) {
      //  System.out.println(people.get(i));
    }
}
   class Person {
	   String name;
	   int age;
	   int salary;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   // @Override
    	public String toString() {
       return name + " - Age: " + age + ", Salary: " + salary;
    }
}

