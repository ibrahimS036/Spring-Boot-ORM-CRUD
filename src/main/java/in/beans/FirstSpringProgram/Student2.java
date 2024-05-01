package in.beans.FirstSpringProgram;

public class Student2 {

	private String name;
	private char div;
	private String clg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getDiv() {
		return div;
	}

	public void setDiv(char div) {
		this.div = div;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public void display() {
		System.out.println("Student name:" + name);
		System.out.println("Student Div:" + div);
		System.out.println("Student Collage:" + clg);
	}

}
