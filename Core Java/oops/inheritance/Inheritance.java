package oops.inheritance;


class Animal{
	private String name;
	
	Animal(){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sound() {
		System.out.println("By default sound is mute");
	}
	
}

class Dog extends Animal{

	public void bark() {
		System.out.println("Dog is barking");
	}
	
}

public class Inheritance {
	public static void main(String args[]) {
		Dog dog = new Dog();
//		dog.setId(123);
//		dog.getId();
		dog.sound();
		dog.bark();
	}
}
