package day6;

public class Human {
	
	String name ;
	int age;
	String phone;
	String bloodGroups;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void numAdd(int a){
		a++;
	}
	void newYear(Human human) {
		human.age++;
	}
}
