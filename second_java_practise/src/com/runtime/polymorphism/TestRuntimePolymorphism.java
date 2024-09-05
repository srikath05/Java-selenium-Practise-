package com.runtime.polymorphism;

public class TestRuntimePolymorphism {

	public static void main(String[] args) {
		
		Animal a= createObject("Dog");
		a.eat();
	}
	public static Animal createObject(String animalType)
	{
		if(animalType.equals("Dog"))
		{
			Dog d = new Dog();
			return d;
		}
		else if(animalType.equals("Cat"))
		{
			//Cat c = (Cat) new Animal();  -- Not possible
			//Animal c= new Cat();
			Cat c = new Cat();
			return c;
		}
		else if(animalType.equals("Lion"))
		{
			Lion l = new Lion();
			return l;
		}
		else
		{
			System.out.println("Please provide correct animaltype");
			return null;
		}
				
	}

}
