// File: BlindingTest.java
// Name: Haris Hanif 
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class BindingTest {

	public static void main(String[] args) {
		// Binding of methods
		System.out.print("new GradStudent(): ");
		msg(new GradStudent("Robotics"));
		System.out.print("new Student(): ");
		msg(new Student());
		System.out.print("new Person(): ");
		msg(new Person());
		System.out.print("new Object(): ");
		msg(new Object());
		
		System.out.println();
		
		System.out.print("GradStudent g:");
		GradStudent g = new GradStudent("Crawd Funding");
		msg(g);
		System.out.print("Student s:");
		Student s = new Student("Economics");
		msg(s);
		System.out.print("Person p:");
		Person p = new Person("Jane Doe");
		msg(p);
		System.out.print("Object o:");
		Object o = new Object();
		msg(o);
		
		
	}
	
	public static void msg(Object x) {
		System.out.println(x.toString());
	}
	
	 static class GradStudent extends Student { 
		private String discipline;
		public GradStudent() {discipline = "Robotics";}
		public GradStudent(String name) {setDiscipline(name);}
		public void setDiscipline(String s) {discipline = s;}
		public String getDiscipline() { return discipline; }
		@Override
		public String toString() { return "Discipline is " + discipline + ", in Grad Program"; }


		}
		
	

	static class Student extends Person {
		private String major;
		public Student() {major = "Comp Sci";}
		public Student(String name) {setMajor(name);}
		public void setMajor(String s) {major = s;}
		public String getMajor() { return major;}
		@Override
		public String toString() { return "Major is " + major + ", is a student" ; }

	}

	static class Person extends Object {
		private String name;
		public Person() { name = "Jon Doe";}
		public Person(String name) { setName(name); }
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		@Override
		public String toString() { return "Name is " +name + ", a Person"; }
	}




}
