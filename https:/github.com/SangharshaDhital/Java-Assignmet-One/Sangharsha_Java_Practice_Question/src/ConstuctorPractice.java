/*
In Java, a constructor is a special type of method that is used to create and initialize objects of a class. 
When an object is created using the new keyword, a constructor is called to initialize the object's state. 
Constructors have the same name as the class and no return type, not even void.

A constructor can take parameters, which are used to set the initial values of the object's instance variables.
 If no constructor is defined for a class, Java provides a default constructor with no arguments that initializes
  all instance variables to their default values.

Constructors can be overloaded, which means a class can have multiple constructors with different parameter lists.
 This allows for more flexibility in creating objects of a class. For example, a Person class might have a
  constructor that takes a name and age, and another constructor that takes just a name.

One important thing to note about constructors is that they are not inherited.
 Each subclass must define its own constructors, even if they have the same signature 
 as the constructors in the superclass.
*/

public class ConstuctorPractice {

	private String make;
	private String model;
	private int year;

	public ConstuctorPractice(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
}

/*In this example, the Car class has a constructor that takes three parameters: make, model, and year. 
 * The constructor initializes the object's make, model,
  and year instance variables using the parameter values.
 */