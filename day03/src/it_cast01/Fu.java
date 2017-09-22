package it_cast01;

public class Fu {
     String name;
     int age;
     
     public Fu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Fu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show(){
    	 System.out.println("我是明星"+name+",我今年"+age+"岁了;");
     }
}
