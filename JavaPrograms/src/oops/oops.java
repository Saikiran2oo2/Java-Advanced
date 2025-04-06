package oops;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing somting");
	}
	
	public void color() {
		System.out.println(this.color);
	}
}

//CompileTime_Polymorphism//
//methods having same name but diffrent parameters//
//its also called Static-Polymorphism//
//it is Method Overloading//
class Student{
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);	
	}
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}
}

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pen1=new Pen();
		pen1.color="Red";
		pen1.type="ballpen";
		
		pen1.write();
		pen1.color();
		
		Pen pen2=new Pen();
		pen2.color="Blue";
		pen2.type="Gel";
		
		pen2.color();
		
		Student s1=new Student();
		s1.printInfo("aman");
;
		
	}

}
